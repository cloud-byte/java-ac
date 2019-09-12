package com.deloitte.examples.example01;

public class MoreOperations {

	public int suma(int a, int b) {
		return a+b;
	}
	
	public int resta(int a, int b) {
		return a-b;
	}
	
	public int multiplicacion(int a, int b) {
		return a*b;
	}
	
	public int division(int a, int b) {
		return a/b;
	}
	
	public int modulo(int a, int b) {
		return a%b;
		
	}
	
	public int potencia(int a, int b) {
		return a^b;
		
	}
	
	public float porcentaje(int a, int b) {
		float comodin = 0;
		comodin = a/100;
		return b*comodin;
	}
}
