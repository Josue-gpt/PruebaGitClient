/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reciclaje;

/**
 *
 * @author Josué
 */
public class NodoRuta {
    String nombreRuta;
    NodoRuta siguiente;

    public NodoRuta(String nombreRuta) {
        this.nombreRuta = nombreRuta;
        this.siguiente = null;
    }
}
