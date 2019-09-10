package com.deloitte.examples.classes;

public class Operaciones {
	
	public static void main(String[] args) {
		
		System.out.println("Suma: " + resta(100,20));
		System.out.println("Resta: " + resta(100,20));
		System.out.println("Multiplicación: " + multiplicacion(100,20));
		System.out.println("Division: " + division(100,20));
		System.out.println("Módulo: " + modulo(100,7));
		System.out.println("Potencia: " + potencia(3,4));
		System.out.println("Porcentaje: " + porcentaje(200,75));
		
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
		return (int) Math.pow(a,b);
	}
	
	public static double porcentaje(double a, double b) {
		return (double) ((b/100)*a);
	}
}
