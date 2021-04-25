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
import tarea3.modelo.Ciudad;
import tarea3.service.CiudadService;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author FABIO
 */
@RestController
public class CiudadController {
    @Autowired
    CiudadService ciu;
    @GetMapping(value = "/verCiudad", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Ciudad> verCiudad (){
        return ciu.verCiudad();
    }
}
