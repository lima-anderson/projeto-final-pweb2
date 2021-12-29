package com.example.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CadastroController {

	@GetMapping("/cadastro")
	public String home() {
		return "/cadastro";
	}
	
	@GetMapping("/notas")
	public String notas() {
		return "/notas";
	}
}
