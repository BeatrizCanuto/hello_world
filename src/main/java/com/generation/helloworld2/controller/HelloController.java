package com.generation.helloworld2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController 
{
	@GetMapping
	public String helloWorld()
	{
		return "Hello World!!! Agora foi...";
	}
	@GetMapping("/bsm")
	public String bsm()
	{
		return "Introdução às Habilidades Comportamentais e Mentalidades <br />"
				+ "Mentalidade de Crescimento<br />"
				+ "Persistência<br />"
				+ "Responsabilidade Pessoal<br />"
				+ "Orientação ao Futuro<br />"
				+ "Comunicação<br />"
				+ "Orientação ao Detalhe<br />"
				+ "Proatividade<br />"
				+ "Trabalho em Equipe<br />";		
	}
	@GetMapping("/objetivos")
	public String objetivos()
	{
		return "Objetivos de aprendizagem <br />"
				+ "Definir tema para e-commerce pessoal<br />"
				+ "Evoluir projeto integrador<br />";
	}
}