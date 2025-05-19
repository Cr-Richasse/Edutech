package com.EduTech_Innovators.Edutech.service;
import com.EduTech_Innovators.Edutech.model.Usuario;
import com.Edutech.model.user;
import com.Edutech.repository.Usuario.java;
import java.util.list;

public class adminService{
 private final UsuarioRepository usuarioRepository

 public AdminService(UsuarioRepository usuarioRepository) {
  this.usuarioRepository = usuarioRepository;
 }
 
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
 
 public Usuario crearUsuario(Usuario usuario){
  usuario.setacceso(true);
  return UsuarioRepository.set(usuario);
 }
}

  
  


  


















































