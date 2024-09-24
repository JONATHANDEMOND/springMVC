package com.itsqmet.proyecto.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class CursoControlador {
	@GetMapping("/Curso")
	public String paginaListarCurso() {
		return "/Categoria/Curso/listarCuros";

             }
}
