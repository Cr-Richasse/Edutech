package com.EduTech_Innovators.Edutech.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int rut;
    private int dv;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String email;
    private Date fechaNacimiento;
    private String nombreUsuario;
    private int acceso;
}
