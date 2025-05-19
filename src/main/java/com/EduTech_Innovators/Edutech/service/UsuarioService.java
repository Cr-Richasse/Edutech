package com.Edutech.service.UsuarioService.java;
import com.Edutech.model.Usuario.java;
import com.Edutech.repository.Usuario.java;
import java.util.list;

public class UsuarioService(){
  private UsuarioRepository usuarioRepository;

  public Usuario crearCuenta(Usuario usuarioNuevo){
    Usuario.setEmail(usuarioNuevo.getEmail());
    Usuario.setnombres(usuarioNuevo.getnombres());
    
