package com.Deloitte.Ejemplos.Academia;

//import java.util.Scanner;

public class Ejemplo {
	
	public static void main(String[] args) {
		System.out.println("Java class");
		System.out.println(suma(2,1));
		System.out.println(resta(2,2));
		System.out.println(multiplicacion(2,2));
		System.out.println(division(4,2));
		System.out.println(modulo(10,3));
		System.out.println(potencia(2,2));
		System.out.println(porcentaje(10,20));
		//	System.out.println(operaciones(10,20));
	}
	
	public static int suma(int a, int b) {
		return a+b;
	}
	
	public static int resta(int a, int b) {
		return a-b;
	}
	
	public static int multiplicacion(int a, int b) {
		return a*b;
	}
	
	public static int division(int a, int b) {
		return a/b;
	}
	
	public static int modulo(int a, int b) {
		return a%b;
	}
	
	public static int potencia(int a, int b) {
		return a^b;
	}
	
	public static int porcentaje(int a, int b) {
		return a*b/100;
	}}
	
	
/*	public static int operaciones(int a, int b) {
		System.out.println("Resta = 1\nMultiplicacion = 2\nDivision = 3\nModulo = 4\nPotencia\nPorcentaje\n");
		Scanner sc = new Scanner(System.in);
		int operacion = sc.nextInt();
		
		switch (operacion)
		{
			case 1: 
			return a-b;
			break;
			
			case 2: 
			return a*b;
			break;
			
			case 3: 
			return a/b;
			break;
			
			case 4: 
			return a%b;
			break;
					
			case 5: 
			return a^b;
			break;
					
			case 6: 
			return a*b/100;
			break;
		}
	}

}*/
