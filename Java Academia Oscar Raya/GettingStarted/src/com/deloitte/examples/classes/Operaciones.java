package com.deloitte.examples.classes;

public class Operaciones {

	public static void main(String[] args) {
		System.out.println(suma(1, 2));
		System.out.println(resta(1, 2));
		System.out.println(multiplica(1, 2));
		System.out.println(division(10, 2));
		System.out.println(modulo(13, 4));
		System.out.println(potencia(2, 2));
		System.out.println(porcentaje(20, 1000));
		System.out.println(factorial(5));

	}
	
	public static String suma(int a, int b) {
		return "La suma de " + a + " + " + b + " es igual a: "  + (a + b);
	}
	
	public static String resta(int a, int b) {
		return "La resta de " + a + " - " + b + " es igual a: "  + (a - b);
	}
	
	public static String multiplica(int a, int b) {
		return "La multiplicación de " + a + " x " + b + " es igual a: "  + (a * b);
	}
	
	public static String division(int a, int b) {
		return "La división de " + a + " ÷ " + b + " es igual a: "  + (a / b);
	}
	
	public static String modulo(double a, double b) {
		
		return "El módulo de " + a + " / " + b + " es igual a: "  + (a % b);
	}
	
	public static String potencia(double a, double b) {
		return "El resultado de " + a + " a la potencia " + b + " es igual a: "  + (double)Math.pow(a, b);
	}
	
	public static String porcentaje(int a, int b) {
		return "El " + a + "% de " + b + " es igual a: " + (a * b) / 100;
	}
	
	public static String factorial(int a) {
		
		int factorial = 1;
		
//		if(a == 1) {
//			return 1;
//		}
		
		for (int i = 1; i <= a; i++) {
			factorial = factorial * i;
		}
		
		return "El factorial de " + a + " es igual a: " + factorial;
		
	}
	

}
