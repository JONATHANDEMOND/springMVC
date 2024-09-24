package com.itsqmet.proyecto.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexControler {

	@GetMapping("/Inicio")//ruta
	public String paginaInicio() { //metodo
		return "index";
		
	}
}
