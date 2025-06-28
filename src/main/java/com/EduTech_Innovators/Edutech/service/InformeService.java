package com.EduTech_Innovators.Edutech.service;

import com.EduTech_Innovators.Edutech.model.Informe;
import com.EduTech_Innovators.Edutech.repository.InformeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformeService {
    @Autowired
    private final InformeRepository informeRepository;

    public InformeService(InformeRepository informeRepository) {this.informeRepository = informeRepository;}
    public String crearInforme(Informe informe) {
        informeRepository.save(informe);
        return "Informe creado";
    }
    public List<Informe> getInformes() {return informeRepository.findAll();}
    public Informe buscarInformePorId(int id) {return informeRepository.findById(id).orElse(null);}
    public Informe actInforme(int id, Informe informe) {
        Informe inf = informeRepository.findById(id).orElse(null);
        if (inf != null ){
            inf.setFechaInforme(informe.getFechaInforme());
            inf.setTitulo(informe.getTitulo());
            inf.setDescripcion(informe.getDescripcion());
            inf.setNombreCurso(informe.getNombreCurso());
            inf.setDescripcionCurso(informe.getDescripcionCurso());
            inf.setNombreProfesor(informe.getNombreProfesor());
            inf.setNombreUsuario(informe.getNombreUsuario());
            inf.setRutUsuario(informe.getRutUsuario());
            inf.setNota1(informe.getNota1());
            inf.setNota2(informe.getNota2());
            inf.setNota3(informe.getNota3());
            inf.setNota4(informe.getNota4());
            inf.setNota5(informe.getNota5());
            inf.setNota6(informe.getNota6());
            inf.setNota7(informe.getNota7());
            inf.setPorcentajeAsistencia(informe.getPorcentajeAsistencia());
            return informeRepository.save(inf);
        }
        return null;
    }
    public String deleteInforme(int id) {
        informeRepository.deleteById(id);
        return "Informe eliminado";
    }
}
