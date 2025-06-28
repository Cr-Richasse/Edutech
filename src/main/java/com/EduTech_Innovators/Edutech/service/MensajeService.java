package com.EduTech_Innovators.Edutech.service;

import com.EduTech_Innovators.Edutech.model.Mensaje;
import com.EduTech_Innovators.Edutech.repository.MensajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MensajeService {
    @Autowired
    private final MensajeRepository mensajeRepository;

    public MensajeService(MensajeRepository mensajeRepository) {this.mensajeRepository = mensajeRepository;}
    public String crearMensaje(Mensaje mensaje) {
        mensajeRepository.save(mensaje);
        return "Mensaje creado correctamente";
    }
    public List<Mensaje> getMensajes() {return mensajeRepository.findAll();}
    public Mensaje getMensaje(int id) {return mensajeRepository.findById(id).orElse(null);}
    public Mensaje actualizarMensaje(int id,Mensaje mensaje) {
        Mensaje mens = mensajeRepository.findById(id).orElse(null);
        if (mens != null){
            mens.setFecha(mensaje.getFecha());
            mens.setEmisor(mensaje.getEmisor());
            mens.setDestinatario(mensaje.getDestinatario());
            mens.setTitulo(mensaje.getTitulo());
            mens.setTexto(mensaje.getTexto());
            return mensajeRepository.save(mens);
        }
        return null;
    }
    public String eliminarMensaje(int id) {
        mensajeRepository.deleteById(id);
        return "Mensaje eliminado correctamente";
    }
}
