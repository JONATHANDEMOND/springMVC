package com.itsqmet.proyecto.modelo;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "db.Profesor")
public class Profesor implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProfesor;
	@Column(name = "nombreProfesor", length= 50)
	private String nombre;
	@Column(name = "apellidoProfesor", length= 50)
	private String apellido;
	private String CorreoElectronico;
	private String Especializacion;
	
	@ManyToOne
	@JoinColumn(name="fkCursoProfesor")
	private Curso fkProfesor;
	

}
