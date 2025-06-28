package com.EduTech_Innovators.Edutech.controller;

import com.EduTech_Innovators.Edutech.model.Mensaje;
import com.EduTech_Innovators.Edutech.service.MensajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mensaje")
public class MensajeController {
    @Autowired
    private MensajeService mensajeService;

    @GetMapping
    public List<Mensaje> getMensajes(){return mensajeService.getMensajes();}

    @GetMapping("/{id}")
    public Mensaje getMensaje(@PathVariable int id){return mensajeService.getMensaje(id);}

    @PostMapping
    public String crearMensaje(@RequestBody Mensaje mensaje){return mensajeService.crearMensaje(mensaje);}

    @DeleteMapping("/{id}")
    public String eliminarMensaje(@PathVariable int id){return mensajeService.eliminarMensaje(id);}

    @PutMapping("/{id}")
    public String actualizarMensaje(@PathVariable int id, @RequestBody Mensaje mensaje){
        mensajeService.actualizarMensaje(id, mensaje);
        return"El mensaje se ha actualizado con exito";
    }

}
