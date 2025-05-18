package com.EduTech_Innovators.Edutech.repository;

import com.EduTech_Innovators.Edutech.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {
}