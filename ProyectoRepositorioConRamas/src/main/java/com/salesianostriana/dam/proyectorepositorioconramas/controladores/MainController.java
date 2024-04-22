package com.salesianostriana.dam.proyectorepositorioconramas.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String sayHello() {
		return "index";
	}

}
