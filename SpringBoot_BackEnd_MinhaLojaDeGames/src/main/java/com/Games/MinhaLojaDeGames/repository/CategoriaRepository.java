package com.Games.MinhaLojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Games.MinhaLojaDeGames.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria> findAllByConsolesContainingIgnoreCase (String consoles); 
	//ContainingIgnoreCase TUDO QUE CONTEM os caracteres DENTRO DESSA VARIAVEL ELE VAI TRAZER
	//IgnoreCase leva em consideração tudos os caracteres que tiver em maiusculo ou minusculo e vai trazer 
	//findAllBy vai me trazer tudo o que for consoles 
}
