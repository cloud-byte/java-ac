package com.deloitte.examples.classes;

public class ClasePruebaDeloitte {
	
	public static void main(String[] args) {
		System.out.println("Annette GR");
		System.out.println(suma(1,2));
		System.out.println(resta(1,2));
		System.out.println(multiplicacion(1,2));
		System.out.println(division(1,2));
		System.out.println(modulo(1,2));
		System.out.println(porcentaje(60,120));
		
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
	
	public static float modulo(int a, int b) {
		return a%b;
	}
	
	public static int potencia (int a, int b) {
		return a^b;
	}
	
	public static double porcentaje (int a, int b) {
		int r;
		r= a*100/b;
		return r;
	}
}
