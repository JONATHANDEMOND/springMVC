package com.itsqmet.proyecto.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.itsqmet.proyecto.modelo.Matricula;
import com.itsqmet.proyecto.repositorio.IMatriculaRepositorio;
import com.itsqmet.proyecto.servicio.IMatriculaServicio;

@Service
@Component
public class MatriculaServicioImpl implements IMatriculaServicio{
	@Autowired
	private IMatriculaRepositorio insertarMatricula;
	@Override
	public void insertarMatricula(Matricula nuevo) {
		// TODO Auto-generated method stub
		insertarMatricula.save(nuevo);
		
	}
	

}
