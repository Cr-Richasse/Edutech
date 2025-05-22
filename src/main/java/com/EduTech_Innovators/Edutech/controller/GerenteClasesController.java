package com.EduTech_Innovators.Edutech.controller;

import com.EduTech_Innovators.Edutech.model.GerenteClases;
import com.EduTech_Innovators.Edutech.service.GerenteClasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gerente")
public class GerenteClasesController {

    @Autowired
    private GerenteClasesService gerenteClasesService;

    @GetMapping
    public List<GerenteClases> obtenerGerentes() {return gerenteClasesService.obtenerGerentes();}

    @GetMapping("/{id}")
    public GerenteClases obtenerGerente(@PathVariable int id) {return gerenteClasesService.obtenerGerente(id);}

    @PostMapping
    public String crearGerente(@RequestBody GerenteClases gerente) {return gerenteClasesService.crearGerente(gerente);}

    @DeleteMapping("/{id}")
    public String eliminarGerente(@PathVariable int id) {return gerenteClasesService.eliminarGerente(id);}

    @PutMapping("/{id}")
    public String actGerente(@PathVariable int id, @RequestBody GerenteClases gerente) {
        gerenteClasesService.actuGerente(id,gerente);
        return"Actualizado con exito";
    }

}
