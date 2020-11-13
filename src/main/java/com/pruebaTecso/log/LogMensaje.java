/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebaTecso.log;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Service;

/**
 *
 * @author alejo
 */
@Service
public class LogMensaje implements ILog {

    private static final Logger logger = Logger.getLogger(LogMensaje.class.getName());
    
    public void registrarMensaje(String nombreClase, String mensaje, String codigo, Level nivel) {
        String msj = "Log com TECSO " + nombreClase + " - " + codigo + " - " + mensaje;
        logger.log(nivel, msj);
    }
    
}
