package Ejercicios;

import java.util.Scanner;

public class Ejerciciorep01 {

	public static void main(String[] args) {
		// 1. Algoritmo que pida dos enteros y que indique el mayor y 
		//el menor, o si ambos son iguales.
		
		System.out.println("PROGRAMA.  MAYOR, MENOR O IGUAL \n");
		Scanner teclado = new Scanner (System.in);
		double num1, num2;
		System.out.println("Introduzca un número: ");
		num1= teclado.nextDouble();
		System.out.println("Introduzca otro número: ");
		num2 = teclado.nextDouble();
		if (num1 == num2) {
				System.out.println("Los números son iguales");
		}
		else {
			if (num1 >num2) {
				System.out.println("En número " +num1+ " es mayor que " +num2);			
		  }
		else {
			System.out.println("El número "+num1+ " es menor a "+num2);
		}
		
		
		}
		

	}

}
