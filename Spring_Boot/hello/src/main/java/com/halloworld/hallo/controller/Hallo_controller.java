package com.halloworld.hallo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hallo") 

public class Hallo_controller {
	
	@GetMapping 
	public String hello() 
	{
		return "Objetivos de aprendizagem para essa semana:\n " + "\nProfissionalismo" + "\nComunicação" + "\nGerencimento de tempo";
	}

}
