package Ejercicios;

import java.util.Scanner;

public class Ejerciciorep08 {

	public static void main(String[] args) {
		// 8. Escribir un programa que implemente una pequeña calculadora con switch-case. 
		//El programa pedirá al usuario los operandos (a y b) y la operación a realizar: 
		//suma, resta, multiplicación, división, raíz cuadrada del primer número 
		//y elevar el primer número al segundo.
		//En función de la opción seleccionada se realizará una de las operaciones aritméticas.
		
	
		Scanner teclado = new Scanner(System.in);
		System.out.println("CALCULADORA");
		System.out.println("Introduce el número 1: ");
		double num1 = teclado.nextDouble();
		System.out.println("Introduce el número 2: ");
		double num2 = teclado.nextDouble();
		
		System.out.println("=================================");
		System.out.println("1. Suma. ");
		System.out.println("2. resta. ");
		System.out.println("3. multiplicación");
		System.out.println("4. División");
		System.out.println("5. Raíz cuadrada del primer número.");
		System.out.println("6. Elevar el primer número al segundo");
		System.out.println("Introduce una opción (1-6)");
		teclado.nextLine();
		String opcion = teclado.nextLine();
		
		switch(opcion) {
		case "suma":
			System.out.printf("%.2f+%.2f=%.2f", num1, num2, num1+num2);
			break;
		case "resta":
			System.out.printf("%.2f-%.2f=%.2f", num1, num2, num1-num2);
			break;
		case "multiplicacion":
			System.out.printf("%.2f*%.2f=%.2f", num1, num2, num1*num2);
			break;
		case "division":
			System.out.printf("%.2f/%.2f=%.2f", num1, num2, num1/num2);
			break;
		case "raiz":
			System.out.printf("raíz cuadrada(%.2f)=%.2f", num1, Math.sqrt(num1));
			break;
		case "potencia":
			System.out.printf("%.2f^%.2f=%.2f", num1, num2, Math.pow(num1, num2));
			break;
		default:
			System.out.println("Opción incorrecta");
		}	
	}		
}
