package com.krakedev.juegos.test;

import com.krakedev.juegos.entidades.Carta;
import com.krakedev.juegos.servicios.Dealer;

public class TestDealer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dealer dealer = new Dealer();

		//dealer.imprimirNaipe();
		
		System.out.println("Cartas iniciales: " + dealer.getNaipe().size());

		Carta carta = dealer.entregarCarta();

		System.out.println("Carta entregada:");
		carta.imprimir();

		System.out.println("Cartas restantes: " + dealer.getNaipe().size());
	}

}
