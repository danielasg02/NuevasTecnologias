/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tarea3.dao.IDocumento;
import tarea3.modelo.TipoDocumento;

/**
 *
 * @author FABIO
 */
@Service
public class DocumentoService {
    @Autowired
    IDocumento docu;
    public TipoDocumento borrarDocu (TipoDocumento documento){
        return docu.borrarDocumento(documento);
    }
}
