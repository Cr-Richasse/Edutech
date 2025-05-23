package com.EduTech_Innovators.Edutech.controller;

import com.EduTech_Innovators.Edutech.model.Admin;
import com.EduTech_Innovators.Edutech.model.Usuario;
import com.EduTech_Innovators.Edutech.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {
  @Autowired
  private AdminService adminService;

  @PostMapping
  public Usuario crearUsuario(@RequestBody Usuario admin) {
    return adminService.crearUsuario(admin);
  }

  @DeleteMapping
  public String Eliminar(int id) {
    return adminService.eliminar(id);
  }

  @PutMapping
  public Usuario Actualizar(@PathVariable int id, Usuario actualizado) {
    actualizado.setId(id);
    return adminService.actualizar(actualizado);
  }
}
