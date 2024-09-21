package com.itsqmet.proyecto.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.itsqmet.proyecto.modelo.Profesor;
import com.itsqmet.proyecto.repositorio.IProfesorRepositorio;
import com.itsqmet.proyecto.servicio.IProfesorServicio;

@Service
@Component
public class ProfesorServicioImpl implements IProfesorServicio {
	@Autowired
	private IProfesorRepositorio insertarProfesor;

	@Override
	public void insertarProfesor(Profesor nuevo) {
		// TODO Auto-generated method stub

		insertarProfesor.save(nuevo);
	}

}
