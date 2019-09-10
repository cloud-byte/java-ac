package com.deloitte.firstProject.math;

public class Operaciones {

	public static int suma(int a, int b) {
		return a+b;
	}
	
	public static int resta(int a, int b) {
		return a-b;
	}
	
	public static int multiplicacion(int a, int b) {
		return a*b;
	}
	
	public static float division(float a, float b) {
		return a/b;
	}
	
	public static int mod(int a, int b) {
		return a%b;
	}
	
	public static double potencia(double a, double b) {
		return Math.pow(a, b);
	}
	
	public static double porcentaje(double a, double b) {
		return (b/100)*a;
	}
}
