package com.krakedev.juegos.test;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

public class TestJuego21 {

    public static void main(String[] args) {

        // Instanciar Juego21
        Juego21 juego = new Juego21();

        // Crear 3 jugadores
        Jugador jugador1 = new Jugador();
        jugador1.setNickname("Oscar");

        Jugador jugador2 = new Jugador();
        jugador2.setNickname("Carlos");

        Jugador jugador3 = new Jugador();
        jugador3.setNickname("Ana");

        // Agregar jugadores
        juego.agregarJugador(jugador1);
        juego.agregarJugador(jugador2);
        juego.agregarJugador(jugador3);

        // Inicializar el juego
        juego.inicializar();

        // Repartir una carta a cada jugador
//        juego.repartirRonda();
//        juego.repartirRonda();
//        juego.repartirRonda();
        
     // Ejecutar el juego
        ArrayList<Jugador> ganadores = juego.jugar();
        

        // Mostrar cartas de los jugadores
        System.out.println("===== CARTAS DE LOS JUGADORES =====");

        jugador1.imprimir();

        System.out.println("-------------------------");

        jugador2.imprimir();

        System.out.println("-------------------------");

        jugador3.imprimir();

//        // Mostrar el naipe restante del Dealer
//        System.out.println("=========================");
//        System.out.println("NAIPE RESTANTE DEL DEALER");
//        System.out.println("=========================");

        //juego.getDealer().imprimirNaipe();

        System.out.println("Cartas restantes: " + juego.getDealer().getNaipe().size());
        
        System.out.println("===== PUNTAJE DE LOS JUGADORES =====");

        System.out.println(jugador1.getNickname() + ": " 
                + jugador1.getPuntajeCartas());

        System.out.println(jugador2.getNickname() + ": " 
                + jugador2.getPuntajeCartas());

        System.out.println(jugador3.getNickname() + ": " 
                + jugador3.getPuntajeCartas());
        

        System.out.println("===== GANADORES =====");

        for (Jugador ganador : ganadores) {
            System.out.println("Ganador: " + ganador.getNickname());
        }
        
        
    }
    
    
}