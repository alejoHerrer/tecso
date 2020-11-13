/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebaTecso.log;

import java.util.logging.Level;

/**
 *
 * @author alejo
 */
public interface ILog {
    
    public void registrarMensaje(String nombreClase, String mensaje, String codigo, Level nivel);
    
}
