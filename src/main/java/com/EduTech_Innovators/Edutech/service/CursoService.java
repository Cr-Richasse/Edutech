package com.EduTech_Innovators.Edutech.service;

import com.EduTech_Innovators.Edutech.model.Curso;
import com.EduTech_Innovators.Edutech.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    private final CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }


    public String crearCurso(Curso curso) {
        cursoRepository.save(curso);
        return "Curso creado con éxito";
    }


    public List<Curso> obtenerCursos() {
        return cursoRepository.findAll();
    }


    public Curso obtenerCursoPorId(Integer id) {
        return cursoRepository.findById(id).orElse(null);
    }


    public Curso actualizarCurso(Integer id, Curso cursoActualizado) {
        Curso curso = cursoRepository.findById(id).orElse(null);
        if (curso != null) {
            curso.setNombreCurso(cursoActualizado.getNombreCurso());
            curso.setDescripcionCurso(cursoActualizado.getDescripcionCurso());
            curso.setCapacidadAlumnos(cursoActualizado.getCapacidadAlumnos());
            curso.setPrecioCurso(cursoActualizado.getPrecioCurso());
            return cursoRepository.save(curso);
        }
        return null;
    }

    public String eliminarCursoPorId(Integer id) {
        cursoRepository.deleteById(id);
        return "Curso" + id + "eliminado con éxito";
    }
}

