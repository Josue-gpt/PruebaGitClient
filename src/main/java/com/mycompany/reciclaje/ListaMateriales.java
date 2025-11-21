/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reciclaje;

/**
 *
 * @author Josué
 */
public class ListaMateriales {
    private NodoMaterial cabeza;

    public ListaMateriales() {
        cabeza = null;
    }

    public void agregarMaterial(String nombreMaterial) {
        NodoMaterial nuevo = new NodoMaterial(nombreMaterial);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }

    public void mostrarMateriales() {
        if (cabeza == null) {
            System.out.println("No hay materiales registrados.");
            return;
        }
        NodoMaterial actual = cabeza;
        while (actual != null) {
            System.out.println(actual.nombreMaterial);
            actual = actual.siguiente;
        }
    }
}
