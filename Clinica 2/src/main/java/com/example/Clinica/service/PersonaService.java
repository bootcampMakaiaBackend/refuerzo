package com.example.Clinica.service;


import com.example.Clinica.modelo.Paciente;
import com.example.Clinica.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    private PacienteRepository pacienteRepository;

    @Autowired
    public PersonaService(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    public Paciente crearPersona(Paciente paciente) {
        if(paciente.getDni() == null){
            //lanzo una exception.
        }
        this.pacienteRepository.save(paciente); // insert into pacinete(...)
        return paciente;
    }

    public List<Paciente> obtenerPacientes(){
        return this.pacienteRepository.findAll(); // select * from pacientes.
    }


}
