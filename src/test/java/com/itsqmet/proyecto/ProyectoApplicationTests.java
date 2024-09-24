package com.itsqmet.proyecto;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
/*import org.springframework.beans.factory.annotation.Autowired;

import com.itsqmet.proyecto.modelo.Aula;
import com.itsqmet.proyecto.modelo.Curso;
import com.itsqmet.proyecto.modelo.Estudiante;
import com.itsqmet.proyecto.modelo.Matricula;
import com.itsqmet.proyecto.modelo.Profesor;

import com.itsqmet.proyecto.servicio.IAulaServicio;
import com.itsqmet.proyecto.servicio.ICursoServicio;
import com.itsqmet.proyecto.servicio.IEstudianteServicio;
import com.itsqmet.proyecto.servicio.IMatriculaServicio;
import com.itsqmet.proyecto.servicio.IProfesorServicio;*/

@SpringBootTest
class ProyectoApplicationTests {
	/*@Autowired
	private IAulaServicio aulaServicio;
	
	@Autowired
	private ICursoServicio cursoServicio;

	

	@Autowired
	private IEstudianteServicio estudianteServicio;

	@Autowired
	private IMatriculaServicio matriculaServicio;

	@Autowired
	private IProfesorServicio profesorServicio;*/

	@Test
	void contextLoads() {
		/* // Inserción de Curso
	    Curso curso = new Curso();
	    curso.setCursoNombre("Historia");
	    curso.setDescripcion("Curso de historia contemporánea");
	    curso.setCreditos(3);
	    cursoServicio.insertarCurso(curso);

	    // Inserción de Profesor
	    Profesor profesor = new Profesor();
	    profesor.setNombre("María");
	    profesor.setApellidoProfesor("González");
	    profesor.setCorreo("maria.gonzalez@example.com");
	    profesor.setEspecializacion("Historia");
	    profesorServicio.insertarProfesor(profesor);

	    // Inserción de Estudiante
	    Estudiante estudiante = new Estudiante();
	    estudiante.setNombreEstudiante("Luis");
	    estudiante.setApellidoEstudiante("García");
	    estudiante.setFechaNacimiento("1998-08-23");
	    estudiante.setCorreo("luis.garcia@example.com");
	    estudianteServicio.insertarEstudiante(estudiante);

	    // Inserción de Matricula
	    Matricula matricula = new Matricula();
	    matricula.setNombre("Matricula Luis García");
	    matricula.setFkMatricula(estudiante); // Relacionar con el estudiante previamente creado
	    matricula.setCurso(curso); // Relacionar con el curso previamente creado
	    matriculaServicio.insertarMatricula(matricula);

	    // Inserción de Aula
	    Aula aula = new Aula();
	    aula.setNombreAula("Aula 202");
	    aula.setCapacidad("40");
	    aula.setCurso(curso); // Relacionar con el curso previamente creado
	    aulaServicio.insertarAula(aula);*/
		
	}
}
