/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public Persona crearPersona (@RequestBody Persona persona){
        return per.crearPerso(persona);
    }
    @GetMapping(value = "/verPersona", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Persona> verPersona (){
        return per.verPersona();
    }
}
