package com.itsqmet.proyecto.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itsqmet.proyecto.modelo.Profesor;
import com.itsqmet.proyecto.servicio.IProfesorServicio;
@Controller
@RequestMapping("/profesor")

public class ProfesorControlador {

    @Autowired
    private IProfesorServicio profesorServicio;

    @GetMapping("/list")
    public String listarProfesores(Model model) {
        List<Profesor> profesores = profesorServicio.listarProfesores();
        model.addAttribute("profesores", profesores);
        return "profesor/profesor-list";
    }

    @GetMapping("/create")
    public String mostrarFormularioCreacion(Model model) {
        model.addAttribute("profesor", new Profesor());
        return "profesor/profesor-create";
    }

    @PostMapping("/save")
    public String guardarProfesor(@ModelAttribute Profesor profesor) {
        profesorServicio.insertarProfesor(profesor);
        return "redirect:/profesor/list";
    }

    @GetMapping("/edit/{id}")
    public String mostrarFormularioEdicion(@PathVariable("id") Integer id, Model model) {
        Profesor profesor = profesorServicio.obtenerProfesorPorId(id);
        model.addAttribute("profesor", profesor);
        return "profesor/profesor-edit";
    }

    @PostMapping("/update/{id}")
    public String actualizarProfesor(@PathVariable("id") Integer id, @ModelAttribute Profesor profesor) {
        profesor.setIdProfesor(id);
        profesorServicio.actualizarProfesor(profesor);
        return "redirect:/profesor/list";
    }

    @GetMapping("/delete/{id}")
    public String eliminarProfesor(@PathVariable("id") Integer id) {
        profesorServicio.eliminarProfesor(id);
        return "redirect:/profesor/list";
    }
}
