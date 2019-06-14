package com.ipartek.formacion;

import java.util.Scanner;

public class Ahorcado {

	/**
	 * Juego del ahorcado
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int vidas = 7;
		int aciertos = 0;
		String letraIntroducida = null; // metemos la letra que mete el usuario para hacer la comparacion
		String palabra = "viernes";
		int tamano = palabra.length();
		char[] respuesta;
		respuesta = new char[tamano];
		// array de booleans para que no cuente letras repetidas como aciertos
		Boolean[] letrasRepes = new Boolean[tamano]; 

		Scanner sc = new Scanner(System.in);

		// inicializamos el array de chars de la respuesta
		for (int i = 0; i < tamano; i++) {
			respuesta[i] = '_';
		}

		// inicializamos el array de booleans a falso
		for (int i = 0; i < letrasRepes.length; i++) {
			letrasRepes[i] = false;
		}

		System.out.println("*******************EMPIEZA EL JUEGO DEL AHORCADO**********************");

		// recorre mientras vidas > 0 y el acierto sea menor que el tamaño de la palabra
		while (vidas > 0 && aciertos < tamano) {
			// Saca por pantalla las vidas y aciertos actuales
			System.out.println("*******************VIDAS = " + vidas);
			System.out.println("*******************ACIERTOS = " + aciertos);

			// Subprograma para dibujar el ahorcado
			dibujarAhorcado(vidas);

			// sacamos por pantalla la palabra con las letras
			System.out.printf("La palabra es: ");
			for (int i = 0; i < tamano; i++) {
				System.out.printf(respuesta[i] + " ");
			}

			// pedimos la letra del usuario
			System.out.println("\nIntroduce una letra: "); // \n es para hacer salto de linea
			letraIntroducida = sc.nextLine().trim().toLowerCase(); // trim elimina espacios por delante y detras

			// si la palabra contiene la letra introducida
			if (palabra.contains(letraIntroducida)) {
				for (int i = 0; i < tamano; i++) {
					// si la letra de la palabra coincide con la introducida y no habia introducido
					// la misma letra anteriormente
					if (palabra.charAt(i) == letraIntroducida.charAt(0) && letrasRepes[i].equals(false)) {
						respuesta[i] = letraIntroducida.charAt(0);
						letrasRepes[i] = true;
						aciertos++;
					}
				}
			} else {
				vidas--;
			}
		} // end while

		if (vidas == 0) {
			dibujarAhorcado(vidas);
			System.out.println("\n********************GAME OVER*************************");
		} else {
			System.out.printf("La palabra es: ");
			for (int i = 0; i < tamano; i++) {
				System.out.printf("_" + respuesta[i] + "_");
			}
			System.out.println("\nHAS GANADO!!!!!");
		}
		sc.close();
	}

	/**
	 * Dado el numero de vidas dibuja el ahorcado correspondiente
	 * 
	 * @param vidas numero de vidas actual del jugador
	 */
	public static void dibujarAhorcado(int vidas) {
		switch (vidas) {
		case 7:
			System.out.println(" ---------------------");
			for (int j = 0; j < 15; j++) {
				System.out.println(" |");

			}
			System.out.println("__________");
			break;
		case 6:
			System.out.println(" ---------------------");
			System.out.println(" |                     |");
			System.out.println(" |                     |");
			System.out.println(" |                  -------");
			System.out.println(" |                 | -  -  |");
			System.out.println(" |                 |   o   |");
			System.out.println(" |                  -------");
			for (int j = 0; j < 10; j++) {
				System.out.println(" |");

			}
			System.out.println("__________");
			break;

		case 5:
			System.out.println(" ---------------------");
			System.out.println(" |                     |");
			System.out.println(" |                     |");
			System.out.println(" |                  -------");
			System.out.println(" |                 | -  -  |");
			System.out.println(" |                 |   o   |");
			System.out.println(" |                  -------");
			System.out.println(" |                     |   ");
			System.out.println(" |                     |   ");
			System.out.println(" |                     |   ");
			System.out.println(" |                     |   ");
			System.out.println(" |                     |   ");
			for (int j = 0; j < 5; j++) {
				System.out.println(" |");

			}
			System.out.println("__________");
			break;

		case 4:
			System.out.println(" ---------------------");
			System.out.println(" |                     |");
			System.out.println(" |                     |");
			System.out.println(" |                  -------");
			System.out.println(" |                 | -  -  |");
			System.out.println(" |                 |   o   |");
			System.out.println(" |                  -------");
			System.out.println(" |                     |   ");
			System.out.println(" |                   / |   ");
			System.out.println(" |                 /   |   ");
			System.out.println(" |                /    |   ");
			System.out.println(" |                     |   ");
			for (int j = 0; j < 5; j++) {
				System.out.println(" |");

			}
			System.out.println("__________");
			break;

		case 3:
			System.out.println(" ---------------------");
			System.out.println(" |                     |");
			System.out.println(" |                     |");
			System.out.println(" |                  -------");
			System.out.println(" |                 | -  -  |");
			System.out.println(" |                 |   o   |");
			System.out.println(" |                  -------");
			System.out.println(" |                     |   ");
			System.out.println(" |                   / | \\ ");
			System.out.println(" |                  /  |   \\ ");
			System.out.println(" |                 /   |     \\ ");
			System.out.println(" |                     |   ");
			for (int j = 0; j < 5; j++) {
				System.out.println(" |");

			}
			System.out.println("__________");
			break;

		case 2:
			System.out.println(" ---------------------");
			System.out.println(" |                     |");
			System.out.println(" |                     |");
			System.out.println(" |                  -------");
			System.out.println(" |                 | -  -  |");
			System.out.println(" |                 |   o   |");
			System.out.println(" |                  -------");
			System.out.println(" |                     |   ");
			System.out.println(" |                   / | \\ ");
			System.out.println(" |                  /  |   \\ ");
			System.out.println(" |                 /   |     \\ ");
			System.out.println(" |                     |   ");
			System.out.println(" |                    /  ");
			System.out.println(" |                   /      ");
			System.out.println(" |                  /       ");
			for (int j = 0; j < 2; j++) {
				System.out.println(" |");

			}
			System.out.println("__________");
			break;

		case 1:
			System.out.println(" ---------------------");
			System.out.println(" |                     |");
			System.out.println(" |                     |");
			System.out.println(" |                  -------");
			System.out.println(" |                 | X  X  |");
			System.out.println(" |                 |   o   |");
			System.out.println(" |                  -------");
			System.out.println(" |                     |   ");
			System.out.println(" |                   / | \\ ");
			System.out.println(" |                  /  |   \\ ");
			System.out.println(" |                 /   |     \\ ");
			System.out.println(" |                     |   ");
			System.out.println(" |                    / \\");
			System.out.println(" |                   /   \\  ");
			System.out.println(" |                  /     \\ ");
			for (int j = 0; j < 2; j++) {
				System.out.println(" |");

			}
			break;
		}
	}

}
