package com.EduTech_Innovators.Edutech.service;

import com.EduTech_Innovators.Edutech.model.Usuario;
import com.EduTech_Innovators.Edutech.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService{
    @Autowired
    private final UsuarioRepository usuarioRepository;

    public AdminService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario actualizar(Usuario actualizado){
        Usuario usuario=usuarioRepository.findById(actualizado.getId()).get();
        usuario.setEmail(actualizado.getEmail());
        usuario.setNombres(actualizado.getNombres());
        usuario.setApellidoPaterno(actualizado.getApellidoPaterno());
        usuario.setApellidoMaterno(actualizado.getApellidoMaterno());

        return usuarioRepository.save(usuario);
    }

    public String eliminar(int id){
        usuarioRepository.deleteById(id);
        return "Eliminado";
    }

    public Usuario crearUsuario(Usuario usuario){
        usuario.setAcceso(true);
        return usuarioRepository.save(usuario);
    }
}





