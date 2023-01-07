package Ejercicios;

import java.util.Scanner;

public class Ejerciciorep09 {

	public static void main(String[] args) {
		///** Dado el sueldo bruto de un trabajador y su número de hijos, realizar un algoritmo
		//que calcule los impuestos que debe pagar según la siguiente tabla de tramos:
			//Tramo Impuesto (%)
			//Descuento
			//0 a 1000
		    //0
			//No aplicable
			//1000 a 1600
			//5
			//1% por hijo (máximo 5%)
			//1600 a 3000
			//10
			//1% por hijo (máximo 10%)
			//3000 a 4600
			//15
			//1% por hijo (máximo 10%)
			//> 4600
			//20
			//1.5% por hijo (máximo 15%)**/
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculo de los impuestos del trabajador");
		System.out.println("Introduzca el Sueldo:");
		double sueldo = teclado.nextDouble();
		
		System.out.println("Introduzca el número de Hijos:");
		int nHijos = teclado.nextInt();
		
		double impuestos, dto, neto, porcentajeDescuento;
		impuestos = dto= neto = porcentajeDescuento=0;
		
		if (sueldo < 1000) {
			neto=sueldo;
		} else if (sueldo <1600) {
			impuestos = sueldo*0.05;
			porcentajeDescuento =0.01*nHijos;
			if (porcentajeDescuento>0.05) {
				porcentajeDescuento=0.05;
			}	
		}else if (sueldo <3000) {
			impuestos = sueldo*0.1;
			porcentajeDescuento =0.01*nHijos;
			if (porcentajeDescuento>0.1) {
				porcentajeDescuento=0.1;
			}
		}else if (sueldo <4600) {
			impuestos = sueldo*0.15;
	
			porcentajeDescuento =0.01*nHijos;
			if (porcentajeDescuento>0.1) {
				porcentajeDescuento=0.1;
			}
		}else {
			impuestos = sueldo*0.20;
			porcentajeDescuento= Math.min(0.15, 0.015*nHijos);
			//if (porcentajeDescuento>0.15) {
			//	porcentajeDescuento=0.15;
				
			}
			
		
					
		dto = sueldo* porcentajeDescuento;
		neto = sueldo - impuestos + dto;
		
		System.out.printf("sueldo bruto: %.2f, Impuestos:%.2f,"
				+ " descuentos:%.2f, salario neto: %.2f\n", sueldo, impuestos,
				dto, neto);
		System.out.printf("Total a impuestos a pagar %.2f", impuestos-dto);
				

	}

}
