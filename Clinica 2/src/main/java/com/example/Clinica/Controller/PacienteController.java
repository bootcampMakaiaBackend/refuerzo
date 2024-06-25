package com.example.Clinica.Controller;

import com.example.Clinica.modelo.Paciente;
import com.example.Clinica.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/pacientes")
public class PacienteController {

    private PersonaService personaService;

    @Autowired
    public PacienteController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @PostMapping()
    public Paciente crear(@RequestBody Paciente paciente) {
        return this.personaService.crearPersona(paciente);
    }

    @GetMapping()
    public List<Paciente> obtenerPacientes() {
        return this.personaService.obtenerPacientes();
    }

}
