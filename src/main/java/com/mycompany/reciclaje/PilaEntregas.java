/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reciclaje;

/**
 *
 * @author Josué
 */
public class PilaEntregas {
    private static class Nodo {
        String entrega;
        Nodo siguiente;

        public Nodo(String entrega) {
            this.entrega = entrega;
        }
    }

    private Nodo cima;

    public boolean esVacia() {
        return cima == null;
    }

    public void apilar(String entrega) {
        Nodo nuevo = new Nodo(entrega);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    public String desapilar() {
        if (esVacia()) {
            throw new IllegalStateException("La pila es vacia");
        }
        String entrega = cima.entrega;
        cima = cima.siguiente;
        return entrega;
    }

    public void mostrarEntregas() {
        if (esVacia()) {
            System.out.println("No hay");
            return;
        }
        Nodo actual = cima;
        while (actual != null) {
            System.out.println(actual.entrega);
            actual = actual.siguiente;
        }
    }
}
