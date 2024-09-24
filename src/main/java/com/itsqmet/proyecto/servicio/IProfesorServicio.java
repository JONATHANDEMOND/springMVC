package com.itsqmet.proyecto.servicio;

import java.util.List;

import com.itsqmet.proyecto.modelo.Profesor;

public interface IProfesorServicio {
	
	public void insertarProfesor(Profesor nuevo);
	// Método para listar todos los profesores
    public List<Profesor> listarProfesores();

    // Método para obtener un profesor por su ID
    public Profesor obtenerProfesorPorId(Integer id);

    // Método para actualizar los datos de un profesor
    public void actualizarProfesor(Profesor profesorActualizado);

    // Método para eliminar un profesor por su ID
    public void eliminarProfesor(Integer id);
}
	


