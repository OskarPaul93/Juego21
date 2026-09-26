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
        
        
        //Pruebas anteriores

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
        
        juego.reiniciar();
        
        
        //PRIMERA PRUEBA: EJECUTAR jugar()
        juego.inicializar();
        ArrayList<Jugador> ganadores1 = juego.jugar();
        
        System.out.println("===== PRIMERA PRUEBA =====");

        System.out.println("===== CARTAS DE LOS JUGADORES =====");

        jugador1.imprimir();

        System.out.println("-------------------------");

        jugador2.imprimir();

        System.out.println("-------------------------");

        jugador3.imprimir();

        System.out.println("===== PUNTAJE =====");

        System.out.println(jugador1.getNickname() + ": "
                + jugador1.getPuntajeCartas());

        System.out.println(jugador2.getNickname() + ": "
                + jugador2.getPuntajeCartas());

        System.out.println(jugador3.getNickname() + ": "
                + jugador3.getPuntajeCartas());

        System.out.println("===== GANADORES =====");

        for (Jugador ganador : ganadores1) {

            System.out.println("Ganador: " + ganador.getNickname());
        }
        

        juego.reiniciar();
        
     // SEGUNDA PRUEBA: 10 ITERACIONES

        

        System.out.println("SEGUNDA PRUEBA 10 INTERACCIONES");
        for (int i = 0; i < 10; i++) {

            System.out.println("=========================");
            System.out.println("JUEGO " + (i + 1));
            System.out.println("=========================");

            ArrayList<Jugador> ganadores2 = juego.jugar();

            System.out.println("===== CARTAS DE LOS JUGADORES =====");

            for (Jugador jugador : juego.getJugadores()) {

                jugador.imprimir();

                System.out.println("-------------------------");
            }

            System.out.println("===== PUNTAJE =====");

            for (Jugador jugador : juego.getJugadores()) {

                System.out.println(jugador.getNickname() + ": "
                        + jugador.getPuntajeCartas());
            }

            if (ganadores2.size() > 0) {

                System.out.println("===== GANADORES =====");

                for (Jugador ganador : ganadores2) {

                    System.out.println("Ganador: " + ganador.getNickname());
                }

                break;
            }

            juego.reiniciar();
        }
        
        
    }
    
    
}