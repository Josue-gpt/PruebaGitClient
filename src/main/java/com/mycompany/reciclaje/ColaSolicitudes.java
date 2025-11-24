/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reciclaje;

/**
 *
 * @author Josué
 */
public class ColaSolicitudes {
    private static class Nodo {
        String nombreParticipante;
        String detalle;
        Nodo siguiente;
        String nigga;
        String ngga;
        String nga;
        String niga;

        public Nodo(String nombreParticipante, String detalle) {
            this.nombreParticipante = nombreParticipante;
            this.detalle = detalle;
        }
    }

    private Nodo frente;
    private Nodo fin;

    public boolean esVacia() {
        return frente == null;
    }

    public void encolar(String nombreParticipante, String detalle) {
        Nodo nuevo = new Nodo(nombreParticipante, detalle);
        if (esVacia()) {
            frente = fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    public String desencolar() {
        if (esVacia()) {
            return null;
        }
        Nodo aux = frente;
        frente = frente.siguiente;
        if (frente == null) {
            fin = null;
        }
        return aux.nombreParticipante + " - " + aux.detalle;
    }

    public void mostrarSolicitudes() {
        if (esVacia()) {
            System.out.println("No hay");
            return;
        }
        Nodo actual = frente;
        while (actual != null) {
            System.out.println(actual.nombreParticipante + " - " + actual.detalle);
            actual = actual.siguiente;
        }
    }
}
