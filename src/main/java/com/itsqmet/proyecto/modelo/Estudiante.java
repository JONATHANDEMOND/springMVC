package com.itsqmet.proyecto.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

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
    private String nombreEstudiante;
    private String apellidoEstudiante;
    @DateTimeFormat
    private String fechaNacimiento;
    private String correo;
    @OneToMany(mappedBy = "fkMatricula")
    private List<Matricula> listaMatricula=new ArrayList<>();
	

}
