/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    @DeleteMapping(path = "borrarDocumento")
    TipoDocumento borrarTipoDocumento(@RequestBody TipoDocumento tipoDocumento) {
        return docu.borrarDocu(tipoDocumento);
    }
    
}
