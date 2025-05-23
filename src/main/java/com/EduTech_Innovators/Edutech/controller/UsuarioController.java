package com.EduTech_Innovators.Edutech.controller;

import com.EduTech_Innovators.Edutech.model.Usuario;
import com.EduTech_Innovators.Edutech.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
public class UsuarioController {
  @AutoWired 
  private UsuarioService usuarioService;
  
  @GetMapping
  public List<Usuario> obtenerUsuarios(){
    return usuarioService.obtenerUsuarios();
  }
  @PostMapping
  public Usuario crearCuenta(@RequestBody Usuario usuarioNuevo){
    return usuarioService.crearCuenta(usuarioNuevo);
  }

  
  
