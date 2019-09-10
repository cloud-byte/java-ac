package com.deloitte.examples.classes;



public class JavaClass {
	public static void main (String[] args) {
		System.out.println("Java Class");
		System.out.print("Suma: ");
		System.out.println(Suma(1,2));
		System.out.print("Resta: ");
		System.out.println(Resta(1,2));
		System.out.print("Multiplicacion: ");
		System.out.println(Multiplicacion(1,2));
		System.out.print("Division: ");
		System.out.println(Division(56,3));
		System.out.print("Modulo: ");
		System.out.println(Modulo(1,2));
		System.out.print("Potencia: ");
		System.out.println(Potencia(4,2));
		System.out.print("Porcentaje: ");
		System.out.println(Porcentaje(1,20));
		
	}
	
	
	public static int Suma (int a, int b) {
		
		return a+b;
	}
	
	public static int Resta(int a, int b) {
		return a-b;
	}
	
	public static int Multiplicacion(int a, int b) {
		return a*b;
	}
	
	public static float Division(float a, float b) {
		return a/b;
	}
	
	public static int Modulo(int a, int b) {
		return a%b;
	}
	
	public static int Potencia (int a, int b) {
		return (int) Math.pow(a, b);
	}
	
	public static float Porcentaje (float a, float b) {
		return (a*b)/100;
	}
}
