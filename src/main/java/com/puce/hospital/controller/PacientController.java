package com.puce.hospital.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//oimpotrtat modelos y servicio
import com.puce.hospital.model.Pacient;
import com.puce.hospital.service.PacientService;

/* 
Guardar Paciente

Listar todos los Pacientes ok

Actualizar Paciente

Eliminar Paciente

Listar Paciente por ID ok

Listar pacientes con peso mayor a 180 libras ok

Listar pacientes con altura menor a 1.80 metros ok */ 

@RestController
@RequestMapping("/api")

public class PacientController {
    @Autowired
    private PacientService pacientService;

    // select *from paciente
    @RequestMapping("/pacientes")
    public List<Pacient> listarPacientes() {
        return pacientService.buscarTodosPacientes();
    }

    //Select porID
    @RequestMapping("/pacientes/{id}")
    public Pacient buscarPacienteID(@PathVariable int id) {
        return pacientService.buscarPacienteID(id);
    }

    @RequestMapping("/pacientes/pesomayor/{peso}")
    public List<Pacient> buscarPacientePesoMayor(@PathVariable double peso) {
        return pacientService.buscarPacientePesoMayor(peso);
    }
    @RequestMapping("/pacientes/alturamenor/{altura}")
    public List<Pacient> buscarPacienteAlturamenor(@PathVariable double altura) {
        return pacientService.buscarPacienteAlturamenor(altura);
    }

    //insertar/guardar paciente
        //insert post body
    @PostMapping("/pacientes")
    public Pacient guardarPaciente(@RequestBody Pacient pacient){
    return pacientService.guardarPaciente(pacient);
        }

    //actualizar paciente por id put
    @PutMapping("/pacientes/{id}")
    public Pacient actualizarPaciente(@RequestBody Pacient pacient, @PathVariable int id){

        pacientService.actualizarPaciente(pacient);
        Pacient pacientExistente = pacientService.buscarPacienteID(id);
        return pacientExistente;
 
    }

    //delete paciente por id
    @DeleteMapping("/pacientes/{id}")
    public String eliminarPaciente(@PathVariable int id){

        pacientService.eliminarPasiente(id);
        return "Paciente eliminado con id: "+id;
    }

    
}
