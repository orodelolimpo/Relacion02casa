package Ejercicios;

import java.util.Scanner;

public class Ejerciciorep06 {

	public static void main(String[] args) {
		// 6. Algoritmo que pida los parΓ‘metros (a, b y c de tipo double) de dos rectas, 
		//correspondientes a su ecuaciΓ³n implΓ­cita (ax + by + c = 0), e indique si son 
		//coincidentes, paralelas o secantes. En el caso de que sean secantes, hay que indicar 
		//si son perpendiculares o no.
		//Las dos rectas se definen como A1x+B1y+C1=0 y A2x+B2y+C2=0, o sea que pedimos 6 valores
		//por teclado:
		//	β’ Dos rectas son secantes si π΄π΄1π΄π΄2β π΅π΅1π΅π΅2
		//	β’ Dos rectas son perpendiculares si son secantes y π΄π΄1π΅π΅1=βπ΅π΅2π΄π΄2
		//	β’ Dos rectas son paralelas si π΄π΄1π΄π΄2=π΅π΅1π΅π΅2
		//	β’ Dos rectas son coincidentes si no son paralelas y π΄π΄1π΄π΄2=π΅π΅1π΅π΅2=πΆπΆ1
		
		System.out.println("PROGRAMA RECTAS");
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce las medidas de la primera recta");
		
		System.out.println("Introduce la recta 1");
		System.out.println("A1: ");
		double a1 = teclado.nextDouble();
		System.out.println("B1: ");
		double b1 = teclado.nextDouble();
		System.out.println("C1: ");
		double c1 = teclado.nextDouble();
		
		System.out.println("Introduce la recta 2");
		System.out.println("A2: ");
		double a2 = teclado.nextDouble();
		System.out.println("B2: ");
		double b2 = teclado.nextDouble();
		System.out.println("C2: ");
		double c2 = teclado.nextDouble();
		
		if (a1/a2 == b1/b2) {
			// Paralelas
			System.out.print("La rectas son paralelas");
			if (b1/b2==c1/c2) {
				System.out.println(" y coincidentes");
			}
		} else {
			// secantes
			System.out.print("Las rectas son secantes");
			if (a1/b1 == -b2/a2) {
				System.out.println(" y perpendiculares");
			}
		}

	}

}
