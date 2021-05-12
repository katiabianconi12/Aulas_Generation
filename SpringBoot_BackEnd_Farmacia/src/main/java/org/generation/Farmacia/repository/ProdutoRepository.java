package org.generation.Farmacia.repository;

import java.util.List;

import org.generation.Farmacia.model.NomeProduto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository  extends JpaRepository<NomeProduto, Long> {

	public List<NomeProduto> findAllByDescricaoContainingIgnoreCase(String descricao);

}
