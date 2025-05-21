package com.EduTech_Innovators.Edutech.service;

import com.EduTech_Innovators.Edutech.model.Profesor;
import com.EduTech_Innovators.Edutech.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorService {
    @Autowired
    private final ProfesorRepository profesorRepository;

    public ProfesorService(ProfesorRepository profesorRepository) {
        this.profesorRepository = profesorRepository;
    }
    public String crearProfesor(Profesor profesor) {
        profesorRepository.save(profesor);
        return "Profesor creado";
    }
    public List<Profesor> getProfesores() {
        return profesorRepository.findAll();
    }
    public Profesor getProfesor(int id) {
        return profesorRepository.findById(id).orElse(null);
    }
    public Profesor actProfesor(Profesor profesor) {
        Profesor prof = profesorRepository.findById(profesor.getId()).orElse(null);
        if (prof!= null) {
            prof.setEmail(profesor.getEmail());
            prof.setNombres(profesor.getNombres());
            prof.setApellidoPaterno(profesor.getApellidoPaterno());
            prof.setApellidoMaterno(profesor.getApellidoMaterno());
            prof.setNombreUsuario(profesor.getNombreUsuario());
            prof.setAcceso(profesor.getAcceso());
            return profesorRepository.save(prof);
        }
        return null;
    }
    public String deleteProfesor(int id) {
        profesorRepository.deleteById(id);
        return "Profesor eliminado";
    }

}
