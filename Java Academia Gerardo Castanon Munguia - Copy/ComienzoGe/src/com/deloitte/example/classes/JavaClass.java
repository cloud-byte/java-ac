package com.deloitte.example.classes;

public class JavaClass {

	public static void main(String[] args) {
		System.out.println("Java Class");
		System.out.println("el resultado de la suma es "+suma(1,2));
		System.out.println("el resultado de la resta es "+resta(1,2));
		System.out.println("el resultado de la multiplicacion es "+multi(1,2));
		System.out.println("el resultado de la division es "+divi(1,2));
		System.out.println("el resultado del modulo es "+modulo(5,8));
		System.out.println("el resultado de la potencia es "+potencia(2,4));
		System.out.println("el resultado del porcentaje es %"+porce(10,50));
	}
	
	public static int suma (int a, int b) {
		
		return a+b;
	}
public static int resta (int a, int b) {
		
		return a-b;
	}
public static int multi (int a, int b) {
	
	return a*b;
}
public static int divi (int a, int b) {
	
	return a/b;
}
public static double modulo (double a, double b) {
	
	return a%b;
}
public static double potencia (double a, double b) {
	
 return Math.pow(a, b);
}
public static double porce (double a, double b) {
	
	return a*b/100*10;
}
}
