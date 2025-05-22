package com.EduTech_Innovators.Edutech.controller;

import com.EduTech_Innovators.Edutech.model.Admin;
import com.EduTech_Innovators.Edutech.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

public class AdminController{
  @Autowired
  private AdminService adminService;
  @PostMapping
  public Usuario crearUsuario(Usuario usuario){
    return adminService.crearUsuario(usuario);
  }
  @DeleteMapping
  public String Eliminar(int id{
  
