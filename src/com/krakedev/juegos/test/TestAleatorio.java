package com.krakedev.juegos.test;

import com.krakedev.juegos.servicios.Dealer;

public class TestAleatorio {

	public static void main(String[] args) {

		Dealer dealer = new Dealer();

		int maximo = 100;

		boolean encontroCero = false;
		boolean encontroMaximo = false;
		boolean fueraDeRango = false;

		for (int i = 0; i < 100; i++) {

			int numero = dealer.generarAleatorio(maximo);

			System.out.println("Número generado: " + numero);

			if (numero == 0) {
				encontroCero = true;
			}

			if (numero == maximo) {
				encontroMaximo = true;
			}

			if (numero < 0 || numero > maximo) {
				fueraDeRango = true;
			}
		}

		System.out.println("-------------------------");
		System.out.println("Genero 0: " + encontroCero);
		System.out.println("Genero max: " + encontroMaximo);
		System.out.println("Fuera de rango: " + fueraDeRango);
	}
}