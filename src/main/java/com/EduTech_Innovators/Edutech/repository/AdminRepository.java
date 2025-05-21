package com.EduTech_Innovators.Edutech.repository;

import com.EduTech_Innovators.Edutech.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{

}
