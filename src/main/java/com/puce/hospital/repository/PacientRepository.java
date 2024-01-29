package com.puce.hospital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.puce.hospital.model.Pacient;


public interface PacientRepository  extends JpaRepository<Pacient, Integer>{
       
    List<Pacient> findByNombre(String nombre);
    List<Pacient> findByApellido(String apellido);
    List<Pacient> findByEdad(int edad);
    List<Pacient> findByPeso(double peso);
    List<Pacient> findByAltura(double altura);
    // List<Pacient> findByNombreOrApellido(String nombre, String apellido);
    //Listar pacientes con peso mayor
    List<Pacient> findByPesoGreaterThan(double peso);
    //Listar pacientes con altura menor
    List<Pacient> findByAlturaLessThan(double altura);



    
}
