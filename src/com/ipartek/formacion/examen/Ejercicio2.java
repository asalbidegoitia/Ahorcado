package com.ipartek.formacion.examen;

import java.util.Scanner;

public class Ejercicio2 {
	
	/**
	 * Dada una puntuacion entera introducida por pantalla el programa calculara si tiene posibilidades de ganar el campeonato
	 * Si la puntuacion no es introducida en el formato adecuado saltara una excepcion
	 * Si la ejecucion es correcta sacara el mensaje correspondiente por pantalla
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int puntuacion=0;
		boolean puedeGanar;
		boolean repetir = true;
		
		do {
			System.out.println("Introduce una puntuación: ");
			try {
				String puntuacionIntroducida = sc.nextLine();
				puntuacion = Integer.parseInt(puntuacionIntroducida);
				repetir= false;
			} catch (Exception e) {
				//e.printStackTrace();
				System.out.println("Mensaje excepcion " + e.getMessage());
				System.out.println("Ha introducido datos sin el formato indicado");
				repetir= true;
			}
		}while(repetir);
			
		puedeGanar=ganar(puntuacion);
		if (puedeGanar){
			System.out.println("Puedes ganar el campeonato");
		}else {
			System.out.println("Ponte las pilas si quieres ganar");
		}
		sc.close();
	}

	/**
	 * Subprograma que dada una puntuación calculara si se cree que el participante pueda ganar el campeonato
	 * puntuacion > 70 puedeGanar true, sino entonces puedeGanar false
	 * @param puntuacion int puntuación del participante
	 * @return puedeGanar boolean representa si el participante puede ganar o no
	 */
	private static boolean ganar(int puntuacion) {
		boolean puedeGanar;
		if (puntuacion>70) {
			puedeGanar = true;	
		}else {
			puedeGanar = false;
		}
		return puedeGanar;
	}
}
