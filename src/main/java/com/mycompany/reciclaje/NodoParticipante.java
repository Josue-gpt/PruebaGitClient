/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reciclaje;

/**
 *
 * @author Josué
 */
public class NodoParticipante {
    String nombre;
    NodoParticipante siguiente;
    NodoParticipante anterior;
    PilaEntregas historialEntregas;

    public NodoParticipante(String nombre) {
        this.nombre = nombre;
        this.siguiente = this;
        this.anterior = this;
        this.historialEntregas = new PilaEntregas();
    }

}
