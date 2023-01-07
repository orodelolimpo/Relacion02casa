package Ejercicios;

import java.util.Scanner;

public class Ejerciciorep07 {

	public static void main(String[] args) {
		// 7. Algoritmo que determine si un año dado es bisiesto o no, teniendo 
		//en cuenta que son años bisiestos los múltiplos de 4,excepto los que son 
		//también múltiplos de 100 pero no lo son de 400.
		Scanner teclado = new Scanner(System.in);
		System.out.println("Programa AÑO BISIESTO");
		System.out.println("Introduce el año:");
		int anio = teclado.nextInt();
		
		if ((anio%4) == 0) {
			if ((anio%100)==0 && (anio%400!=0)) {
				System.out.println("El año no es bisiesto");
			} else {
				System.out.println("El año es bisiesto");
			}
		} else {
			System.out.println("El año no es bisiesto");
		}
	}

}
