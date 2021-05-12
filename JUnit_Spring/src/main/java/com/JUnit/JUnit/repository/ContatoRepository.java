package com.JUnit.JUnit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JUnit.JUnit.model.ContatoModel;

public interface ContatoRepository extends JpaRepository<ContatoModel, Long>  {

}
