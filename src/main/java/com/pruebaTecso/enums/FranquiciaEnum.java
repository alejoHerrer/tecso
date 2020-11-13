/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebaTecso.enums;

/**
 *
 * @author alejo
 */
public enum FranquiciaEnum {
    MARVEL("marvel","01"),
    DC_COMICS("dc_comics","02");

    private final String nombre;
    private final String codigo;

    private FranquiciaEnum(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }
}
