/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import tarea3.modelo.Persona;
import tarea3.service.PersonaService;

/**
 *
 * @author FABIO
 */
@RestController
public class PersonaController {
    @Autowired
    PersonaService per;
    @PostMapping(value = "/crearPersona", produces = MediaType.APPLICATION_JSON_VALUE)
    public Persona crearPersona (Persona persona){
        return per.crearPerso(persona);
    }
}
