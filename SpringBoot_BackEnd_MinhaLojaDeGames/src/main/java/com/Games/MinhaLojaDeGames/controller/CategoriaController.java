package com.Games.MinhaLojaDeGames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Games.MinhaLojaDeGames.model.Categoria;
import com.Games.MinhaLojaDeGames.repository.CategoriaRepository;

@RestController
@RequestMapping("/Categoria")
@CrossOrigin ("*")
public class CategoriaController {
	
	@Autowired
    private CategoriaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> GetById(@PathVariable long id)
	{
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))// responde um status ok
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping ("/consoles/{consoles}")
	public ResponseEntity<List<Categoria>> GetByConsoles(@PathVariable String consoles){
		return ResponseEntity.ok(repository.findAllByConsolesContainingIgnoreCase(consoles)); // esse metodo retorna uma lista
	}
	
	@PostMapping
	public ResponseEntity<Categoria> post (@RequestBody Categoria categoria){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));// a diferença de post pra put é que na requizição da body na possa o id
	}
	
	@PutMapping // nesse metodo passamos o id pra para saber qual recurso queremos alterar/mudar
	public ResponseEntity<Categoria> put (@RequestBody Categoria categoria){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(categoria)); //outra forma de devolver um status ok
	}
	
	@DeleteMapping ("/{id}")
	public void delete (@PathVariable long id){
		repository.deleteById(id);
	}
	

}
