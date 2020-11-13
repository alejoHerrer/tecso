/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebaTecso.repository;

import com.pruebaTecso.entitys.Proveedor;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author alejo
 */
public interface ProveedorRepository extends CrudRepository<Proveedor, Long>{
    
    public List<Proveedor> findByNombre(String nombre);
    
}
