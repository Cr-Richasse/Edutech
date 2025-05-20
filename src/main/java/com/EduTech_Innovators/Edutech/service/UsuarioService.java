package com.EduTech_Innovators.Edutech.service;
import com.EduTech_Innovators.Edutech.model.Usuario;
import com.EduTech_Innovators.Edutech.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> obtenerUsuarios() {
        return usuarioRepository.findAll();
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
