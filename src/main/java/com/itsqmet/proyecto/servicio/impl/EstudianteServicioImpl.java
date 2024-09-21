package com.itsqmet.proyecto.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.itsqmet.proyecto.modelo.Estudiante;
import com.itsqmet.proyecto.repositorio.IEstudianteRepositorio;
import com.itsqmet.proyecto.servicio.IEstudianteServicio;
@Service
@Component
public class EstudianteServicioImpl implements IEstudianteServicio{
	@Autowired
	private IEstudianteRepositorio insertarEstudiante;
	@Override
	public void insertarEstudiante(Estudiante nuevo) {
		// TODO Auto-generated method stub
		insertarEstudiante.save(nuevo);
		
	}
	

}
