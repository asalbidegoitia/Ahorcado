package com.ipartek.formacion.examen;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
	final static int MAX_NUMEROS = 10;
	static int[] DATOS = new int[MAX_NUMEROS];

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
		System.out.println("El numero de multiplos de 7 es: " + multiplos7);

		float media = calcularMedia(DATOS);
		// redondear a 2 decimales
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("\nLa media es " + df.format(media));

		sc.close();

	}

	/**
	 * Subprograma que dado un array de enteros calcula la media aritmetica
	 * 
	 * @param datos int[] array de integer con los datos
	 * @return media float media aritmetica del array datos
	 */
	private static float calcularMedia(int[] datos) {
		float media = 0;
		if ((datos != null) && (datos.length > 0)) {
			for (double valor : datos) {
				media += valor;
			}
			media /= datos.length;
		}
		return media;
	}

	/**
	 * Subprograma que dado un array de enteros devuelve el numero de multiplos de 7
	 * 
	 * @param int[] array de integer con los datos
	 * @return numero de elementos del array que son multiplos de 7
	 */
	private static int calcularMultiplos7(int[] datos) {
		int multiplos7 = 0;
		for (int i = 0; i < datos.length; i++) {
			if (datos[i] % 7 == 0) {
				multiplos7++;
			}
		}
		return multiplos7;
	}
}
