/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tarea3.modelo.TipoDocumento;

/**
 *
 * @author FABIO
 */
@Repository
public class DocumentoDaoImple implements IDocumento{
    @Autowired
    IDocumentoJpa docuJpa;
    @Override
    public TipoDocumento borrarDocumento(TipoDocumento documento) {
        TipoDocumento td = docuJpa.findById(documento.getId()).get();
        docuJpa.delete(td);
        return td;
    }
    
}
