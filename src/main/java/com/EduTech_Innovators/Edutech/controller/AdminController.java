package com.EduTech_Innovators.Edutech.controller;

import com.EduTech_Innovators.Edutech.model.Admin;
import com.EduTech_Innovators.Edutech.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

public class AdminController{
  @Autowired
  private AdminService adminService;
  @PostMapping
  public Admin crearUsuario(Admin admin){
    return adminService.crearUsuario(admin);
  }
  @DeleteMapping
  public String Eliminar(int id){
    return adminService.Eliminar(id);
  }
  
  @PutMapping
  public Usuario Actualizar(Usuario actualizado){
    return adminService.Actualizar(Admin actualizado);
  }
