/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tarea3.dao.ICiudad;
import tarea3.modelo.Ciudad;

/**
 *
 * @author FABIO
 */
@Service
public class CiudadService {
    @Autowired
    ICiudad ciu;
    public List<Ciudad> verCiudad (){
        return ciu.leerCiudad();
    }
}
