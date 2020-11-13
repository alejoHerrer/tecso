/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebaTecso.rest;

import com.pruebaTecso.log.LogMensaje;
import com.pruebaTecso.rest.model.ProductoRequest;
import com.pruebaTecso.utils.TecsoUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author alejo
 */
@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/productos")
public class ProductoRest {
    
    @Autowired
    private LogMensaje logMensaje;
    
    @RequestMapping(
            value = "guardarProducto",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST
    )
    @SuppressWarnings("UseSpecificCatch")
    public ResponseEntity<Map<String, Object>> estadoCuenta(
            @RequestHeader Map<String, String> headers,
            @RequestBody ProductoRequest payload
    ) throws Exception {
        Map<String, Object> response = new HashMap<>();
        UUID uuid = UUID.randomUUID();
        response.put(TecsoUtil.UUID, uuid.toString());
        logMensaje.registrarMensaje(this.getClass().getName(), ToStringBuilder.reflectionToString(payload), uuid.toString(), Level.CONFIG);

        return new ResponseEntity(response, HttpStatus.OK);
    }
    
    
}
