package com.Games.MinhaLojaDeGames.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "tb_Game")
public class Categoria {//POSTAGEM
	
	@Id  
	@GeneratedValue (strategy = GenerationType.IDENTITY) // no banco de dados esse atributo vai se transformar em uma PK
	private long id;
	
	@NotNull // para o clint injetar informações
	@Size (min = 2, max = 200) // @Size vai definir quantos caracters vai ter no nome do meu console
	private String consoles; //TITULO
	
	@NotNull
	@Size (min = 2, max = 200)
	private String jogos; //TEXTO
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date = new java.sql.Date(System.currentTimeMillis());
	
	@ManyToOne
	@JsonIgnoreProperties("categoria")
	private Produto produto; //TEMA

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getConsoles() {
		return consoles;
	}

	public void setConsoles(String consoles) {
		this.consoles = consoles;
	}

	public String getJogos() {
		return jogos;
	}

	public void setJogos(String jogos) {
		this.jogos = jogos;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}
