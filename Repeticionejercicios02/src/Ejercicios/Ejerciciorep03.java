package Ejercicios;

import java.util.Scanner;

public class Ejerciciorep03 {

	public static void main(String[] args) {
		// 3. Algoritmo que pida tres números distintos de tipo float e indique cual es el
		//que ocupa la posición central si los tres se ordenasen.
		
		System.out.println("PROGRAMA.  NÚMEROS MEDIO\n");
		Scanner teclado = new Scanner (System.in);
		float num1,num2,num3;
		System.out.println("Introduzca un número: ");
		num1= teclado.nextFloat();
		System.out.println("Introduzca el segundo número: ");
		num2 = teclado.nextFloat();
		System.out.println("Introduzca el tercer número: ");
		num3 = teclado.nextFloat();
		if ((num2 > num1 && num2< num3) || (num1>num3 && num1<num2)){
			System.out.printf("El número %.2f es el del medio \n",num2);
		}else if ((num1>num2 && num1<num3 )|| (num2>num3 && num2<num1)){
			System.out.printf("El número %.2f es el del medio \n",num1);
		}else {
			System.out.printf("El numero %.2f es el del medio \n ",num3);
		}

	}

}
