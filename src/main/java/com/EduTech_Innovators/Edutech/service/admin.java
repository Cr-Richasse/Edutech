package com.Edutech.service.admin.java;
import com.Edutech.model.user;
import com.Edutech.Repository.Usuario.java;
import java.util.list;

public class adminService{
 
 public Usuario Actualizar(Usuario actualizado){
  Usuario usuario=UsuarioRepository.findById(id);
  usuario.setemail(actualizado.getemail());
  usuario.setnombres(actualizado.getnombres());
  usuario.setapellidoPaterno(actualizado.getapellidoPaterno());
  usuario.setapellidoMaterno(actualizado.getapellidoMaterno());
 }
 public Usuario Eliminar(id){
  
  


  


















































