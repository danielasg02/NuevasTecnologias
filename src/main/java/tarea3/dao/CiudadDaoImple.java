/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tarea3.modelo.Ciudad;

/**
 *
 * @author FABIO
 */
@Repository
public class CiudadDaoImple implements ICiudad {
    
    @Autowired
    ICiudadJpa ciuJpa;
    @Override
    public List<Ciudad> leerCiudad() {
        return ciuJpa.findAll();
    }
    
}
