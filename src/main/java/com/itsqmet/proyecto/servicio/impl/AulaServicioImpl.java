package com.itsqmet.proyecto.servicio.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itsqmet.proyecto.modelo.Aula;
import com.itsqmet.proyecto.repositorio.IAulaRepositorio;
import com.itsqmet.proyecto.servicio.IAulaServicio;

import java.util.List;

@Service
public class AulaServicioImpl implements IAulaServicio {

    @Autowired
    private IAulaRepositorio aulaRepositorio;

    @Override
    public void insertarAula(Aula nuevaAula) {
        aulaRepositorio.save(nuevaAula);
    }

    @Override
    public List<Aula> listarAulas() {
        return aulaRepositorio.findAll();
    }

    @Override
    public Aula obtenerAulaPorId(Integer id) {
        return aulaRepositorio.findById(id).orElse(null); // Manejo de valor opcional
    }

    @Override
    public void actualizarAula(Aula aulaActualizada) {
        aulaRepositorio.save(aulaActualizada); // Save actúa como "insertar" o "actualizar"
    }

    @Override
    public void eliminarAula(Integer id) {
        aulaRepositorio.deleteById(id);
    }
}
