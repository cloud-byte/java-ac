package com.deloitte.examples.example01;

public class MyFirstClass {
	
		public static void main(String[] args) {
		System.out.println("Java Class");
		System.out.println("SUMA (2+3): " + suma(2,3));
		System.out.println("RESTA (3-2): " + resta(3,2));
		System.out.println("Multiplicacion (2*3): " + multiplicacion(2,3));
		System.out.println("Division (5/2): " + division(5,2));
		System.out.println("Modulo (5/2): " + modulo(5,2));
		System.out.println("Potencia (2^2): " + potencia(2,2));
		System.out.println("Porcentaje (2*10%): " + porcentaje(2,10));
				
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
		int i;
		for (i=0;i<b;i++) {
			a = a*b;
		}
		return a;
		
	}
	
	public static float porcentaje(float a, float b) {
		float comodin = 0;
		comodin = a/100;
		return b*comodin;
	}
}
