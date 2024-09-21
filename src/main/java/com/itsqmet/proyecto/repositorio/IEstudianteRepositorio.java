package com.itsqmet.proyecto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itsqmet.proyecto.modelo.Estudiante;

public interface IEstudianteRepositorio extends JpaRepository<Estudiante, Integer>{

}
