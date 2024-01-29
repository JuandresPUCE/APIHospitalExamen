package com.puce.hospital.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.puce.hospital.model.Pacient;
import com.puce.hospital.repository.PacientRepository;

@Service
public class PacientService {

    @Autowired
    //inyectar el repositorio
    private PacientRepository pacientRepository;

    //select *from paciente

    public List<Pacient> buscarTodosPacientes(){
        return pacientRepository.findAll();
    }

    //select *from paciente where id

    public Pacient buscarPacienteID(int id){
        return pacientRepository.findById(id).orElseThrow();
    }

    //select *from paciente where peso mayor
    public List<Pacient> buscarPacientePesoMayor(double peso){
        return pacientRepository.findByPesoGreaterThan(peso);
    }

    //select *from paciente where altura menor
    public List<Pacient> buscarPacienteAlturamenor(double altura){
        return pacientRepository.findByAlturaLessThan(altura);

    }

    //insertar/guardar paciente
    public Pacient guardarPaciente(Pacient pacient){
        return pacientRepository.save(pacient);
    }
    //actualizar paciente
    public Pacient actualizarPaciente(Pacient pacient){
        return pacientRepository.save(pacient);
    }

    //eliminar paciente
    public void eliminarPasiente(int id) {
        pacientRepository.deleteById(id);
    }


    
}
