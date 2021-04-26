/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tarea3.dao;

import java.util.List;
import tarea3.modelo.Persona;
/**
 *
 * @author FABIO
 */
public interface IPersona {
    
    public Persona crearPersona (Persona persona);
    public List<Persona> leerPersona ();
}
