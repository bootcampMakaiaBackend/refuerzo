package com.example.Clinica.Controller;

import com.example.Clinica.modelo.Odontologo;
import com.example.Clinica.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/odontologo")
public class OdontologoController {

    private OdontologoService odontologoService;

    @Autowired
    public OdontologoController(OdontologoService odontologoService) {
        this.odontologoService = odontologoService;
    }

    @PostMapping()
    public Odontologo crearOdontologo(@RequestBody Odontologo odontologo){
        return this.odontologoService.crearOdontolo(odontologo);
    }
    //localhost:8080/api/v1/odontologo/2342342342
    @DeleteMapping("/{numeroProfesional}")
    public ResponseEntity<String> eliminarOdontologo(@PathVariable("numeroProfesional") String numeroProfesional){
        //controlo el error
        try{
            this.odontologoService.eliminarOdontologo(numeroProfesional);
            return ResponseEntity.ok("Se creo el odontologo");
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al eliminar un odontologo");
        }
    }
}
