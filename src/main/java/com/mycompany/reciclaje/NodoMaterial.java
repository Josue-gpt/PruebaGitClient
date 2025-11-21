/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reciclaje;

/**
 *
 * @author Josué
 */
public class NodoMaterial {
    String nombreMaterial;
    NodoMaterial siguiente;

    public NodoMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
        this.siguiente = null;
    }
}
