package com.EduTech_Innovators.Edutech.service;

import com.EduTech_Innovators.Edutech.model.Admin;
import com.EduTech_Innovators.Edutech.model.Profesor;
import com.EduTech_Innovators.Edutech.model.Usuario;
import com.EduTech_Innovators.Edutech.repository.AdminRepository;
import com.EduTech_Innovators.Edutech.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService{
    @Autowired
    private final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }
    public List<Admin> getAdmins() {return adminRepository.findAll();}

    public Admin actualizar(Admin actualizado){
        Admin usuario=adminRepository.findById(actualizado.getId()).get();
        usuario.setEmail(actualizado.getEmail());
        usuario.setNombres(actualizado.getNombres());
        usuario.setApellidoPaterno(actualizado.getApellidoPaterno());
        usuario.setApellidoMaterno(actualizado.getApellidoMaterno());

        return adminRepository.save(usuario);
    }

    public String eliminar(int id){
        adminRepository.deleteById(id);
        return "Eliminado";
    }

    public String crearUsuario(Admin usuario){
        adminRepository.save(usuario);
        return "admin creado";
    }
}





