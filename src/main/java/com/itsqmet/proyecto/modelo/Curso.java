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
@Table(name = "db.Curso")
@Entity
public class Curso implements Serializable	 {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCurso;
	private String cursoNombre;
	private String DescripcionCurso;
	private int CreditosCurso;
	
	@ManyToOne
	@JoinColumn(name ="fkAulaCurso")
	private Aula fkCurso;
	
	//un curso puede tener varios provesores 
	
	@OneToMany(mappedBy = "fkProfesor")
	private List<Profesor> listaProfesor = new ArrayList<>();

}
