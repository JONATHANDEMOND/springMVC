package com.itsqmet.proyecto.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "db.Aula")
@Entity
public class Aula implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAula;
    private String nombreAula;
    private String capacidad;
	
	/// una aula puede tener varios cursos relacion de 
	//1  a varios
	
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Curso curso;
	
}
