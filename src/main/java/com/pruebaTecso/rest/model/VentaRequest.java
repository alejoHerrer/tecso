/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebaTecso.rest.model;

import java.util.List;

/**
 *
 * @author alejo
 */
public class VentaRequest extends ARequest {
    
    private String id;
    private String fecha;
    private ClienteRequest clienteRequest;
    private List<DetalleVentaRequest> detalleVentaRequests;
}
