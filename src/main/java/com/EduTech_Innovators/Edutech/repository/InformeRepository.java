package com.EduTech_Innovators.Edutech.repository;

import com.EduTech_Innovators.Edutech.model.Informe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InformeRepository extends JpaRepository<Informe, Integer> {

}
