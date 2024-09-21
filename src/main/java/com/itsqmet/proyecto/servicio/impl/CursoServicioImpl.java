package com.itsqmet.proyecto.servicio.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.itsqmet.proyecto.modelo.Curso;
import com.itsqmet.proyecto.repositorio.ICursoRepositorio;
import com.itsqmet.proyecto.servicio.ICursoServicio;
@Service
@Component
public class CursoServicioImpl implements ICursoServicio{
	@Autowired
	private ICursoRepositorio insertarCurso;
	@Override
	public void insertarCurso(Curso nuevo) {
		// TODO Auto-generated method stub
		insertarCurso.save(nuevo);
		
	}

}
