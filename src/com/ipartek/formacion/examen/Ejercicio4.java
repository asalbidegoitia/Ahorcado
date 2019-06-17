package com.ipartek.formacion.examen;

import java.util.Scanner;

public class Ejercicio4 {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor introduce el tipo de tren: ");
		String tipo = sc.nextLine();
		System.out.println("Por favor introduce la referencia: ");
		String referencia = sc.nextLine();
		System.out.println("Por favor introduce los asientos ocupados: ");
		String sAsientosOcupados = sc.nextLine();
		int asientosOcupados = Integer.parseInt(sAsientosOcupados);
		System.out.println("Por favor introduce los años en activo: ");
		String sAnosActivo = sc.nextLine();
		int anosActivo = Integer.parseInt(sAnosActivo);
		
		Tren tren = new Tren(tipo,referencia,asientosOcupados,anosActivo);
		System.out.println("Datos identificativos del tren:"+ tren.toString());
		
		if (tren.trenLleno()) {
			System.out.println("El tren esta lleno");
		}else {
			System.out.println("Aun quedan asientos");
		}
		
		tren.demasiadoViejo();
	}
		
	
}
