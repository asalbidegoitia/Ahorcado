package com.ipartek.formacion.examen;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
	public static final int[] DATOS = new int[10];

	/**
	 * El usuario introducira 10 numeros por pantallas que se guardaran en el array
	 * DATOS
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		boolean salir = false;
		int contador = 0;

		for (int i = 0; i < DATOS.length; i++) {
			System.out.println("Vuelta numero: " + (i + 1));
			System.out.println("Por favor introduce el numero: ");
			try {
				String sNumero = sc.nextLine();
				numero = Integer.parseInt(sNumero);
				DATOS[i] = numero;
				System.out.println("El se ha introducido en el array correctamente");
			} catch (Exception e) {
				// e.printStackTrace();
				System.out.println("Mensaje excepcion " + e.getMessage());
				System.out.println("No has introducido un numero");
			}
		}
		int multiplos7 = calcularMultiplos7(DATOS);
		System.out.println("El numero de multiplos de 7 es: "+multiplos7);
		

		float media = calcularMedia(DATOS);
		System.out.println("\nLa media es " + media);

		sc.close();

	}

	private static float calcularMedia(int[] datos) {
		float media = 0;
		if ((datos != null) && (datos.length > 0)) {
			for (double valor : datos) {
				media += valor;
			}
			media /= datos.length;
		}
		// redondear a 2 decimales
		DecimalFormat df = new DecimalFormat("#,###.##");
		df.format(media);
		return media;
	}

	private static int calcularMultiplos7(int[] datos) {
		int multiplos7=0;
		for (int i = 0; i < datos.length; i++) {
			if (datos[i] % 7 == 0) {
				multiplos7++;
			}
		}
		return multiplos7;
	}
}
