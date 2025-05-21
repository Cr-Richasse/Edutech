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
    public List<Profesor> getProfesores() {
        return profesorRepository.findAll();
    }
    public Profesor createProfesor(Profesor profesor) {
        Profesor prof = new Profesor();
        prof.setEmail(profesor.getEmail());
        prof.setNombres(profesor.getNombres());
        prof.setApellidoPaterno(profesor.getApellidoPaterno());
        prof.setApellidoMaterno(profesor.getApellidoMaterno());
        return profesorRepository.save(prof);
    }

}
