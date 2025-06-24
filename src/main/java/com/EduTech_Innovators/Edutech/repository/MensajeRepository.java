package com.EduTech_Innovators.Edutech.repository;

import com.EduTech_Innovators.Edutech.model.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensajeRepository extends JpaRepository<Mensaje, Integer> {
}
