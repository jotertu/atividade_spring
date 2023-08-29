package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String HelloWorld() {
		return "Hello World!!!";
		
	}
	
	@GetMapping("bsms")
	public String listaBsms() {
		return "lista de BSM’s da Generation Brasil."
				+ "\nPersistência"
				+ "\nResponsabilidade Pessoal"
				+ "\nOrientação ao Futuro"
				+ "\nHabilidades Comportamentais e Mentalidades"
				+ "\nResponsabilidade Pessoal"
				+ "\nComunicação"
				+ "\nOrientação ao Detalhe"
				+ "\nProatividade"
				+ "\nTrabalho em Equipe"
				+ "\nMentalidade de Crescimento";
	}
	
	@GetMapping("objetivos")	
	public String objetivosSemanais() {
		return "Lista de objetivos semanais"
				+ "\nFinalizar parte do projeto blog pessoal"
				+ "\nConversar com o meu grupo sobre o projeto integrador"
				+ "\nRealizar tarefas que estão pendentes";
	}
}
