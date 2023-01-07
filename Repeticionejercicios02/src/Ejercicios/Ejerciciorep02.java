package Ejercicios;

import java.util.Scanner;

public class Ejerciciorep02 {

	public static void main(String[] args) {
		// 2. Algoritmo que pida 3 números e indique cual es el menor de los tres.
		
		System.out.println("PROGRAMA. MENOR DE TRES NÚMEROS \n");
		Scanner teclado = new Scanner (System.in);
		double num1,num2,num3;
		System.out.println("Introduzca un número: ");
		num1= teclado.nextDouble();
		System.out.println("Introduzca el segundo número: ");
		num2 = teclado.nextDouble();
		System.out.println("Introduzca el tercer número: ");
		num3 = teclado.nextDouble();
		
		if (num1 < num2 && num1 < num3) {
			System.out.printf("El número %.2f es menor \n",num1);
		}else if (num2<num1 && num2<num3 ){
			System.out.printf("El número %.2f es el menor \n",num2);
		}else {
			System.out.printf("El numero %.2f es el menor \n ",num3);
		}

	}

}
