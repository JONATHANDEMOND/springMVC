package com.itsqmet.proyecto.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.itsqmet.proyecto.modelo.Aula;
import com.itsqmet.proyecto.repositorio.IAulaRepositorio;
import com.itsqmet.proyecto.servicio.IAulaServicio;
@Service
@Component
public class AulaServicioImpl implements IAulaServicio{
	@Autowired
	private IAulaRepositorio insertarAula;
	
	@Override
	public void insertarAula(Aula nuevo) {
		// TODO Auto-generated method stub
		insertarAula.save(nuevo);
		
	}

}
