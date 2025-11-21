/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reciclaje;

/**
 *
 * @author Josué
 */
public class Reciclaje {

    public static void main(String[] args) {
        ListaParticipantesDoblementeCircular participantes = new ListaParticipantesDoblementeCircular();
        participantes.agregarParticipante("Josue");
        participantes.agregarParticipante("Nicolas");
        participantes.agregarParticipante("Allison");

        System.out.println("Participantes:");
        participantes.mostrarParticipantes();

        NodoParticipante diego = participantes.buscarParticipante("Josue");
        if (diego != null) {
            diego.historialEntregas.apilar("Entrega de plastico");
            diego.historialEntregas.apilar("Entrega de papel");
            System.out.println("\nHistorial de entregas de Diego:");
            diego.historialEntregas.mostrarEntregas();
        }

        ListaRutasCircular rutas = new ListaRutasCircular();
        rutas.agregarRuta("Ruta 1 - Centro");
        rutas.agregarRuta("Ruta 2 - Norte");
        rutas.agregarRuta("Ruta 3 - Sur");

        System.out.println("\nRutas de camiones:");
        rutas.mostrarRutas();

        System.out.println("\nRecorriendo rutas:");
        rutas.siguienteRuta();
        rutas.siguienteRuta();
        rutas.siguienteRuta();
        rutas.siguienteRuta(); 

        ColaSolicitudes solicitudes = new ColaSolicitudes();
        solicitudes.encolar("Allison", "Recoleccion de vidrio");
        solicitudes.encolar("Nicolas", "Recoleccion de carton");

        System.out.println("\nSolicitudes de recoleccion:");
        solicitudes.mostrarSolicitudes();

        System.out.println("\nSe atiende a: " + solicitudes.desencolar());

        ListaMateriales materiales = new ListaMateriales();
        materiales.agregarMaterial("Plastico");
        materiales.agregarMaterial("Papel");
        materiales.agregarMaterial("Vidrio");
        materiales.agregarMaterial("Metal");

        System.out.println("\nMateriales reciclables:");
        materiales.mostrarMateriales();
    }
}
