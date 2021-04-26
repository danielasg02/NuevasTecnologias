/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tarea3.modelo.Persona;

/**
 *
 * @author FABIO
 */
@Repository
public class PersonaDaoImple implements IPersona{
    @Autowired
    IPersonaJpa p;
    @Override
    public Persona crearPersona(Persona persona) {
       return p.save(persona);
    }

    @Override
    public List<Persona> leerPersona() {
        return p.findAll();
    }
    
}
