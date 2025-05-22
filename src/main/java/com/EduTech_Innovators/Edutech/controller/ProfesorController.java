package com.EduTech_Innovators.Edutech.controller;

import com.EduTech_Innovators.Edutech.model.Profesor;
import com.EduTech_Innovators.Edutech.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profesor")
public class ProfesorController {

    @Autowired
    private ProfesorService profesorService;

    @GetMapping
    public List<Profesor> getProfesores() {return profesorService.getProfesores();}

    @GetMapping("/{id}")
    public Profesor obtenerProfesor(@PathVariable int id) {return profesorService.getProfesor(id);}

    @PostMapping
    public String crearProfesor(@RequestBody Profesor profesor) {return profesorService.crearProfesor(profesor);}

    @DeleteMapping("/{id}")
    public String eliminarProfesor(@PathVariable int id) {return profesorService.deleteProfesor(id);}

    @PutMapping("/{id}")
    public String actProfesor(@PathVariable int id, @RequestBody Profesor profesor) {
        profesorService.actProfesor(id, profesor);
        return"Actualizado con exito";
    }
}
