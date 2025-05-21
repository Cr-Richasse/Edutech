package com.EduTech_Innovators.Edutech.repository;

import com.EduTech_Innovators.Edutech.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Integer> {

}
