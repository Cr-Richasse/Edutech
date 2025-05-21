package com.EduTech_Innovators.Edutech.repository;

import com.EduTech_Innovators.Edutech.model.GerenteClases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GerenteClasesRepository extends JpaRepository<GerenteClases, Integer> {

}
