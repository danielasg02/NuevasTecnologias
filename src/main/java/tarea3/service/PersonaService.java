/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tarea3.dao.IPersona;
import tarea3.modelo.Persona;

/**
 *
 * @author FABIO
 */
@Service
public class PersonaService {
    @Autowired
    IPersona per;
    
    public Persona crearPerso (Persona persona){
        return per.crearPersona(persona);
    }
}
