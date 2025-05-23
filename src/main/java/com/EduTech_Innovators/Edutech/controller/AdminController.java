package com.EduTech_Innovators.Edutech.controller;

import com.EduTech_Innovators.Edutech.model.Admin;
import com.EduTech_Innovators.Edutech.model.Usuario;
import com.EduTech_Innovators.Edutech.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
  @Autowired
  private AdminService adminService;

  @GetMapping
  public List<Admin> getAdmins() {return adminService.getAdmins();}

  @GetMapping("/{id}")
  public Admin getAdmin(@PathVariable int id) {return adminService.getAdmin(id);}

  @PostMapping
  public String crearUsuario(@RequestBody Admin admin) {
    return adminService.crearUsuario(admin);
  }

  @DeleteMapping("/{id}")
  public String Eliminar(int id) {
    return adminService.eliminar(id);
  }

  @PutMapping("/{id}")
  public Admin Actualizar(@PathVariable int id, Admin actualizado) {
    actualizado.setId(id);
    return adminService.actualizar(actualizado);
  }
}
