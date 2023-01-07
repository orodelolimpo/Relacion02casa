package Ejercicios;

import java.util.Scanner;

public class Ejerciciorep05 {

	public static void main(String[] args) {
		// 5. Dadas dos casillas de un tablero de ajedrez por la fila y columna 
		//que ocupan, comprobar si están en la misma fila, columna, o en la misma diagonal.
		
		System.out.println("PROGRAMA. POSICIÓN DE TABLERO DE AJEDREZ");
		Scanner teclado = new Scanner (System.in);
		int fila1, col1,fila2,col2;
		System.out.println("Introduzca la posición de la primera ficha \n ");
		System.out.println("Fila: \n ");
		fila1= teclado.nextInt();
		System.out.println("Introduzca la posición de la primera ficha \n ");
		System.out.println("Columna: \n ");
		col1= teclado.nextInt();
		System.out.println("Introduzca la posición de la segunda ficha \n ");
		System.out.println("Fila:\n");
		fila2=teclado.nextInt();
		System.out.println("Introduzca la posición de la segunda ficha \n ");
		System.out.println("Columna: \n ");
		col2= teclado.nextInt();
		
		if (fila1 <1 || fila1 >8 || fila2 <1 || fila2 >8 ||
				col1 <1 || col1 >8 || col2 <1 || col2 >8) {
			System.out.println( "Posición de pieza erronea");
			System.exit(0);
				}
				
		if (fila1==fila2 && col1 == col2) {
			System.out.println("Están en la misma casilla");
		} else if (fila1 == fila2) {
			System.out.println("Las piezas están en la misma fila");
		} else if (col1 == col2) {
			System.out.println("Están en la misma columna");
		} else if ((col1-fila1 == col2-fila2) || (fila1+col1 == fila2+col2)){
			System.out.println("Están en la misma diagonal ");
		} else {
			System.out.println("No están en la misma fila, ni es la misma columna,"
					+ "ni en la misma diagonal");
		}
			
			
		
			
		
	}
}
