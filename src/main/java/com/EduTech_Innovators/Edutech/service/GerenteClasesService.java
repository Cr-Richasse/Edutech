package com.EduTech_Innovators.Edutech.service;

import com.EduTech_Innovators.Edutech.model.GerenteClases;
import com.EduTech_Innovators.Edutech.repository.GerenteClasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GerenteClasesService {
    @Autowired

    private final GerenteClasesRepository gerenteClasesRepository;

    public GerenteClasesService(GerenteClasesRepository gerenteClasesRepository) {
        this.gerenteClasesRepository = gerenteClasesRepository;
    }
    public String crearGerente(GerenteClases gerente) {
        gerenteClasesRepository.save(gerente);
        return "se creó con exito";
    }
    public List<GerenteClases> obtenerGerentes(){
        return gerenteClasesRepository.findAll();
    }
    public GerenteClases obtenerGerente(int id){
        return gerenteClasesRepository.findById(id).orElse(null);
    }

    public GerenteClases actuGerente(int id, GerenteClases gerente){
        GerenteClases gerenteClases = gerenteClasesRepository.findById(id).orElse(null);
        if(gerenteClases != null){
            gerenteClases.setRut(gerente.getRut());
            gerenteClases.setDv(gerente.getDv());
            gerenteClases.setNombres(gerente.getNombres());
            gerenteClases.setApellidoPaterno(gerente.getApellidoPaterno());
            gerenteClases.setApellidoMaterno(gerente.getApellidoMaterno());
            gerenteClases.setEmail(gerente.getEmail());
            gerenteClases.setFechaNacimiento(gerente.getFechaNacimiento());
            gerenteClases.setNombreUsuario(gerente.getNombreUsuario());
            gerenteClases.setAcceso(gerente.getAcceso());
            return gerenteClasesRepository.save(gerenteClases);
        }
        return null;
    }
    public String eliminarGerente(int id){
        gerenteClasesRepository.deleteById(id);
        return "Se elimino con exito";
    }

}
