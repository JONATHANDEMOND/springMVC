package com.itsqmet.proyecto.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Table(name = "db.Estudiante")
@Entity
public class Estudiante implements Serializable{


	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEstudiante;
	private String NombreEstudiante;
	private String ApellidoEstudiante;
	private String FechaNacimiento;
	private String CorreoElectronico;
	
	//relacion un estudiante varias matriculas

	@OneToMany(mappedBy = "fkMatricula")
	private List<Matricula> listaMatricula = new ArrayList<>();
	

}
