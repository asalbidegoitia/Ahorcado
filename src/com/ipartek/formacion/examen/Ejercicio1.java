package com.ipartek.formacion.examen;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static final int NUMERO_BOXEADORES=30;
	public static final int PESO_PESADO =91;
	public static final int PESO_MEDIANO_MAX=90;
	public static final int PESO_MEDIANO_MIN=65;
	public static final int PESO_LIGERO_MAX=64;
	public static final int PESO_LIGERO_MIN=58;
	public static final int PESO_PLUMA_MAX=57;
	public static final int PESO_PLUMA_MIN=52;
	public static final int PESO_MOSCA=51;
	
	/**
	 * El programa pedira introducir un peso en numero entero para el numero de boxeadores de un torneo
	 * Si el peso no es introducido en el formato adecuado saltara una excepcion
	 * Si la ejecucion es correcta sacara el mensaje correspondiente por pantalla
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int peso = 0;
		int contador = 1;
		
		do {
			System.out.println("Introduce un peso: ");
			try {
				String pesoIntroducido = sc.nextLine();
				peso = Integer.parseInt(pesoIntroducido);
				
				if (peso < PESO_MOSCA) { //menor de 52 peso mosca
					System.out.println("El peso introducido es " + peso +", su categoria es peso mosca");
				}
				else if (peso >= PESO_PLUMA_MIN && peso <= PESO_PLUMA_MAX) { //entre 52 y 57 peso pluma
					System.out.println("El peso introducido es " + peso +", su categoria es peso pluma");
				}
				else if (peso >= PESO_LIGERO_MIN && peso <= PESO_LIGERO_MAX) { //entre 58 y 64 peso ligero
					System.out.println("El peso introducido es " + peso +", su categoria es peso ligero");
				}
				else if (peso >= PESO_MEDIANO_MIN && peso <= PESO_MEDIANO_MAX) { //entre 65 y 90 peso mediano
					System.out.println("El peso introducido es " + peso +", su categoria es peso mediano");
				}else { //mayor de 90 peso pesado
					System.out.println("El peso introducido es " + peso +", su categoria es peso pesado");
				}
				System.out.println("Número de pesos de boxeadores introducidos hasta ahora: "+contador);
				contador ++;
				
			}catch (Exception e) {
				//e.printStackTrace();
				System.out.println("Mensaje excepcion " + e.getMessage());
				System.out.println("Ha introducido datos sin el formato indicado o fuera del rango");
				sc.close();
				System.out.println("Se acaba la ejecución del programa");
				System.exit(1);
				
			}	
		}while(contador <= NUMERO_BOXEADORES);
			
		sc.close();
		System.out.println("Se acaba la ejecución del programa");
		
	}
}
	



