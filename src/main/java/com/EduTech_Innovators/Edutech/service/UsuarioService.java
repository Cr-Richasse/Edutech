package com.EduTech_Innovators.Edutech.service;
import com.EduTech_Innovators.Edutech.model.Usuario;
import com.EduTech_Innovators.Edutech.repository.UsuarioRepository;
import com.Edutech.model.Usuario.java;
import com.Edutech.repository.Usuario.java;
import java.util.List;

public class UsuarioService(){
  private UsuarioRepository usuarioRepository;

  public Usuario crearCuenta(Usuario usuarioNuevo){
    Usuario.setEmail(usuarioNuevo.getEmail());
    Usuario.setnombres(usuarioNuevo.getnombres());
    
