/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebaTecso.rest.model;

import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author alejo
 */
@Slf4j
public class ProductoRequest {
    
    private String id;
    private String nombre;
    private String franquisia;
    private Integer cantidad;
    private Double precioEntrada;
    private Double precioVenta;
    private ProveedorRequest proveedorRequest;
    
}
