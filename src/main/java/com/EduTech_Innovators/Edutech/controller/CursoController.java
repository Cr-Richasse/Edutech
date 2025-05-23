package com.EduTech_Innovators.Edutech.controller;

import com.EduTech_Innovators.Edutech.model.Curso;
import com.EduTech_Innovators.Edutech.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping
    public List<Curso> obtenerCursos() {
        return cursoService.obtenerCursos();
    }

    @GetMapping("/{id}")
    public Curso obtenerCursoPorId(@PathVariable Integer id) {
        return cursoService.obtenerCursoPorId(id);
    }

    @PostMapping
    public String crearCurso(@RequestBody Curso curso) {
        return cursoService.crearCurso(curso);
    }

    @DeleteMapping("/{id}")
    public String eliminarCursoPorId(@PathVariable Integer id) {
        cursoService.eliminarCursoPorId(id);
        return "Curso " + id + " eliminado con éxito";
    }

    @PutMapping("/{id}")
    public String actualizarCurso(@PathVariable Integer id, @RequestBody Curso cursoActualizado) {
        cursoService.actualizarCurso(id, cursoActualizado);
        return "Curso actualizado con éxito";
    }
}


