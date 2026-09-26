package com.krakedev.juegos.test;

import com.krakedev.juegos.entidades.Carta;

public class TestCarta {

	public static void main(String[] args) {

		Carta carta = new Carta();

		carta.setValor("A");
		carta.setValorJuego(11);
		carta.setPalo("CR");

		carta.imprimir();
	}
}