/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reciclaje;

/**
 *
 * @author Josué
 */
public class ListaParticipantesDoblementeCircular {
    private NodoParticipante cabeza;

    public ListaParticipantesDoblementeCircular() {
        cabeza = null;
    }

    public void agregarParticipante(String nombre) {
        NodoParticipante nuevo = new NodoParticipante(nombre);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoParticipante ultimo = cabeza.anterior;
            nuevo.siguiente = cabeza;
            nuevo.anterior = ultimo;
            cabeza.anterior = nuevo;
            ultimo.siguiente = nuevo;
        }
    }

    public NodoParticipante buscarParticipante(String nombre) {
        if (cabeza == null) return null;

        NodoParticipante actual = cabeza;
        do {
            if (actual.nombre.equalsIgnoreCase(nombre)) {
                return actual;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);

        return null;
    }

    public void mostrarParticipantes() {
        if (cabeza == null) {
            System.out.println("No hay");
            return;
        }
        NodoParticipante actual = cabeza;
        do {
            System.out.println(actual.nombre);
            actual = actual.siguiente;
        } while (actual != cabeza);
    }
}
