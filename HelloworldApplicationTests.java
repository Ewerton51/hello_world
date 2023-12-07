package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 					
@RequestMapping("/hello-world")		 
public class HelloWorldController {

	@GetMapping
	public String helloWorld() {
		return "Hello World";
	}
	
	//endereço: http://localhost:8080/hello-world/bsms
	@GetMapping("/bsms")	
	public String generationBSM() {
		return "Persistência, Mentalidade de crescimento, Responsabilidade, Orientação ao futuro, Proatividade, Comunicação, Trabalho em equipe, Orientação ao detalhe.";
	}
	
	// endereço: http://localhost:8080/hello-world/lista
	@GetMapping("/lista")
	public String lista() {
		return "Essa semana quero aprimorar meus conhecimentos em SQL e entender mais sobre HTTPS, vou complementar meus estudos de POO no final de semana, pois estou bem perdido nisso e sei que vou usar muito em breve";
	}
	
}
