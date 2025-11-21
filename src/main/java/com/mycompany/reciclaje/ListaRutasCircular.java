/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reciclaje;

/**
 *
 * @author Josué
 */
public class ListaRutasCircular {
    NodoRuta cabeza;
    NodoRuta cola;
    NodoRuta actual;

    public ListaRutasCircular() {
        cabeza = null;
        cola = null;
        actual = null;
    }

    public void agregarRuta(String nombreRuta) {
        NodoRuta nuevo = new NodoRuta(nombreRuta);

        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            nuevo.siguiente = nuevo;
            actual = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.siguiente = cabeza;
            cola = nuevo;
        }
    }

    public void mostrarRutas() {
        if (cabeza == null) {
            System.out.println("No hay rutas");
            return;
        }

        NodoRuta temp = cabeza;
        do {
            System.out.println(temp.nombreRuta);
            temp = temp.siguiente;
        } while (temp != cabeza);
    }

    public void siguienteRuta() {
        if (actual == null) {
            System.out.println("No hay rutas");
            return;
        }
        System.out.println("Ruta actual: " + actual.nombreRuta);
        actual = actual.siguiente;
    }
}
