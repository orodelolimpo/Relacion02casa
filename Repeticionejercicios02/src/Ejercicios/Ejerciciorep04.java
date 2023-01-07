package Ejercicios;

import java.util.Scanner;

public class Ejerciciorep04 {

	public static void main(String[] args) {
		// 4. Algoritmo que pida tres números 
		//si es posible que exista un triángulo con esas dimensiones.
		
		System.out.println("PROGRAMA.  TRIANGULO A RAIZ DE TRES NÚMEROS");
		Scanner teclado = new Scanner (System.in);
		int a,b,c;
		System.out.println("Introduzca dimesión lado a: ");
		a= teclado.nextInt();
		System.out.println("Introduzca dimesión lado b: ");
		b= teclado.nextInt();
		System.out.println("Introduzca dimesión lado c: ");
		c= teclado.nextInt();
		
		if ((a+b>c)&&(b+c>a)&&(c+a>b)){
			System.out.printf("EXiste el triángulo de lados %d, %d y %d", a,b,c);
		} else {
			System.out.printf("NO EXiste el triángulo de lados %d, %d y %d", a,b,c);
		}
		
		

	}

}
