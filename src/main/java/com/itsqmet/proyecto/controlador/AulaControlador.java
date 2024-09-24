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

import com.itsqmet.proyecto.modelo.Aula;
import com.itsqmet.proyecto.servicio.IAulaServicio;

@Controller
@RequestMapping("/aula")
public class AulaControlador {

    @Autowired
    private IAulaServicio aulaServicio;

    // Listar todas las aulas
    @GetMapping("/list")
    public String listarAulas(Model model) {
        List<Aula> aulas = aulaServicio.listarAulas();
        model.addAttribute("aulas", aulas);
        return "aula/aula-list";
    }

    // Mostrar el formulario para crear una nueva aula
    @GetMapping("/create")
    public String mostrarFormularioCreacion(Model model) {
        model.addAttribute("aula", new Aula());
        return "aula/aula-create";
    }

    // Guardar una nueva aula
    @PostMapping("/save")
    public String guardarAula(@ModelAttribute Aula aula) {
        aulaServicio.insertarAula(aula);
        return "redirect:/aula/list";
    }

    // Mostrar el formulario de edición de una aula existente
    @GetMapping("/edit/{id}")
    public String mostrarFormularioEdicion(@PathVariable("id") Integer id, Model model) {
        Aula aula = aulaServicio.obtenerAulaPorId(id);
        model.addAttribute("aula", aula);
        return "aula/aula-edit";
    }

    // Actualizar una aula existente
    @PostMapping("/update/{id}")
    public String actualizarAula(@PathVariable("id") Integer id, @ModelAttribute Aula aula) {
        aula.setIdAula(id);
        aulaServicio.actualizarAula(aula);
        return "redirect:/aula/list";
    }

    // Eliminar una aula existente
    @GetMapping("/delete/{id}")
    public String eliminarAula(@PathVariable("id") Integer id) {
        aulaServicio.eliminarAula(id);
        return "redirect:/aula/list";
    }
}
