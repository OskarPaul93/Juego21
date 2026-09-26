package com.krakedev.juegos.servicios;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Carta;
import com.krakedev.juegos.entidades.Jugador;

public class Juego21 {
	private ArrayList<Jugador> jugadores;
	private Dealer dealer;
	
	
	
	
	//constructor
	public Juego21() {
		jugadores = new ArrayList<Jugador>();
	}
	
	public void cargarValores() {

		for (Carta carta : dealer.getNaipe()) {

			String valor = carta.getValor();

			if (valor.equals("A")) {

				carta.setValorJuego(11);

			} else if (valor.equals("J") || valor.equals("Q") || valor.equals("K")) {

				carta.setValorJuego(10);

			} else {

				int numero = Integer.parseInt(valor);
				carta.setValorJuego(numero);
			}
		}
	}
	
	public void inicializar () {
		dealer = new Dealer();
		cargarValores();
	}
	
	
	public void agregarJugador(Jugador jugador) {

	    jugadores.add(jugador);
	}
	
	public void repartirCarta(Jugador jugador) {

	    Carta carta = dealer.entregarCarta();

	    jugador.recibirCarta(carta);
	}
	
	
	public void repartirRonda() {

	    for (Jugador jugador : jugadores) {

	        repartirCarta(jugador);
	    }
	    
	    calcularTotal();
	}
	
	
	public void calcularTotal() {

	    for (Jugador jugador : jugadores) {

	        int total = 0;

	        for (Carta carta : jugador.getCartas()) {

	            total = total + carta.getValorJuego();
	        }

	        jugador.setPuntajeCartas(total);
	    }
	}
	
	public Dealer getDealer() {
	    return dealer;
	}
	
	public ArrayList<Jugador> validarGanador() {

	    ArrayList<Jugador> ganadores = new ArrayList<Jugador>();

	    for (Jugador jugador : jugadores) {
	        if (jugador.getPuntajeCartas() == 21) {
	            ganadores.add(jugador);
	        }
	    }

	    return ganadores;
	}
	
	

}
