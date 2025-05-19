package com.Edutech.service.admin.java;
import com.Edutech.model.user;
import com.Edutech.repository.Usuario.java;
import java.util.list;

public class adminService{
 private final UsuarioRepository usuarioRepository
 public Usuario Actualizar(Usuario actualizado){
  Usuario usuario=UsuarioRepository.findById(id);
  usuario.setemail(actualizado.getemail());
  usuario.setnombres(actualizado.getnombres());
  usuario.setapellidoPaterno(actualizado.getapellidoPaterno());
  usuario.setapellidoMaterno(actualizado.getapellidoMaterno());
 }
 public Usuario Eliminar(id){
  usuarioRepository.deleteById(id)
   }
 
  
  


  


















































