package com.EduTech_Innovators.Edutech.service;
import com.EduTech_Innovators.Edutech.model.Usuario;
import com.EduTech_Innovators.Edutech.repository.UsuarioRepository;
import java.util.List;

public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    public Usuario crearCuenta(Usuario usuarioNuevo) {
        Usuario usuario = new Usuario();
        usuario.setEmail(usuarioNuevo.getEmail());
        usuario.setNombres(usuarioNuevo.getNombres());
        usuario.setApellidoPaterno(usuarioNuevo.getApellidoPaterno());
        usuario.setApellidoMaterno(usuarioNuevo.getApellidoMaterno());
        return usuarioRepository.save(usuario);
    }
}
