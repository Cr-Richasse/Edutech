package com.EduTech_Innovators.Edutech.repository;
import com.EduTech_Innovators.Edutech.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer>{

}
