package com.itsqmet.proyecto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itsqmet.proyecto.modelo.Matricula;

public interface IMatriculaRepositorio extends JpaRepository<Matricula, Integer> {

}
