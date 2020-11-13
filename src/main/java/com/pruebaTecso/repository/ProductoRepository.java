/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebaTecso.repository;

import com.pruebaTecso.entitys.Producto;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author alejo
 */
public interface ProductoRepository extends CrudRepository<Producto, Long>{
    
    public List<Producto> findByNombre(String nombre);
    
}
