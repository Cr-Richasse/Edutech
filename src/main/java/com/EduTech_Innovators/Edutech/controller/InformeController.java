package com.EduTech_Innovators.Edutech.controller;

import com.EduTech_Innovators.Edutech.model.Informe;
import com.EduTech_Innovators.Edutech.service.InformeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/informe")
public class InformeController {
    @Autowired
    private InformeService informeService;

    @GetMapping
    public List<Informe> getInformes() {return informeService.getInformes();}

    @GetMapping("/{id}")
    public Informe getInformeById(@PathVariable int id) {return informeService.buscarInformePorId(id);}

    @PostMapping
    public String crearInforme(@RequestBody Informe informe) {return informeService.crearInforme(informe);}

    @DeleteMapping("/{id}")
    public String EliminarInforme(@PathVariable int id) {return informeService.deleteInforme(id);}

    @PutMapping("/{id}")
    public String actualizarInforme(@PathVariable int id, @RequestBody Informe informe) {
        informeService.actInforme(id, informe);
        return"Actualizado com exito";
    }
}
