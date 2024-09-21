package com.itsqmet.proyecto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itsqmet.proyecto.modelo.Profesor;

public interface IProfesorRepositorio extends JpaRepository<Profesor, Integer> {

}
