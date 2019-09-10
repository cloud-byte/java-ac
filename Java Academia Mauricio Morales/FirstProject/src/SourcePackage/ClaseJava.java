package SourcePackage;

public class ClaseJava {
	
	public static void main(String[] args) {
		System.out.println("Java Class");
		System.out.println(suma(1,3));
		System.out.println(resta(6,2));
		System.out.println(multiplicacion(2,2));
		System.out.println(division(8,2));
		System.out.println(modulo(15,4));
		System.out.println(potencia(2,2));
		System.out.println(porcentaje(10,24));
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
		int r = 1;
		for (int i=1; i<=b; i++) {
			r=r*a;
		}
		return r;
	}
	
	public static float porcentaje(float a, float b) {
		return ((a*b)/100);
	}
}
