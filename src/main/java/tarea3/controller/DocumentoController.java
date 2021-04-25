/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import tarea3.service.DocumentoService;
import tarea3.modelo.TipoDocumento;


/**
 *
 * @author FABIO
 */
@RestController
public class DocumentoController {
    @Autowired
    DocumentoService docu;
    @DeleteMapping(value = "/borrarDocumento", produces = MediaType.APPLICATION_JSON_VALUE)
    public TipoDocumento borrarDocumento (TipoDocumento documento){
        return docu.borrarDocu(documento);
    }
    
}
