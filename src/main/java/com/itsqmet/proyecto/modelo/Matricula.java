package com.itsqmet.proyecto.modelo;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Table(name = "db.Matricula")
@Entity
public class Matricula implements Serializable{

	
	private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		private int idMatricula;
	    private String Nombre;
		private String FechaMatricula;
		
		@ManyToOne
		@JoinColumn(name ="fkMatEst")
		private Estudiante fkMatricula;

}
