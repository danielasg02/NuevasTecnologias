/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tarea3.dao;
import tarea3.modelo.TipoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author FABIO
 */
public interface IDocumentoJpa extends JpaRepository <TipoDocumento, Integer>{

}
