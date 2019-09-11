package Prueba;

public class PRUEBA1 {
	public static void main(String[] args) {
		System.out.println("Java Class");
		System.out.println(suma(5,2));
		System.out.println(resta(6,2));
		System.out.println(multiplicacion(3,4));
		System.out.println(division(9,3));
		System.out.println(modulo(4,2));
		System.out.println(potencia(2,3));
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
	public static double potencia(int a, int b) {
		return Math.pow(a,b);
	}
	public static double porcentaje(double a, double b) {
		return (a*b)/100;
	}
}
