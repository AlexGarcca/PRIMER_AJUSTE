/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.act2;

/**
 *
 * @author garci
 */
class Particion {
    String nombre;
    int tamano;
    boolean ocupada;
    String nombreProceso;

    public Particion(String nombre, int tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.ocupada = false;
        this.nombreProceso = "";
    }
}