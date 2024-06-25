package com.example.Clinica.service;

import com.example.Clinica.modelo.Odontologo;
import com.example.Clinica.repository.OdontologoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OdontologoService {

    private OdontologoRepository odontologoRepository;

    @Autowired
    public OdontologoService(OdontologoRepository odontologoRepository) {
        this.odontologoRepository = odontologoRepository;
    }

    public Odontologo crearOdontolo(Odontologo odontologo){
        this.odontologoRepository.save(odontologo); // insert into odontologo(..)
        return odontologo;
    }

    public void eliminarOdontologo(String numeroProfesional){
            Optional<Odontologo> odontologoOptional = this.odontologoRepository.findById(numeroProfesional); //select * from odonotologo where numero_profesional = 1231231
            if(odontologoOptional.isPresent()){
                this.odontologoRepository.delete(odontologoOptional.get()); // delete ..
            } else {
                //lanza  creo el error
                throw new RuntimeException("No se pudo eliminar el odontologo");
            }
    }
}
