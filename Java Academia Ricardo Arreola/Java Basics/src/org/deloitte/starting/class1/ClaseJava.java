package org.deloitte.starting.class1;
import java.util.Scanner;  // Import the Scanner class


public class ClaseJava {

		public static void main(String[] args) {
			
			Scanner myObj = new Scanner(System.in);
		    System.out.println("Introduce A: ");
		    int a = myObj.nextInt();
		    
		    System.out.println("Introduce B: ");
		    int b = myObj.nextInt();
		    

			System.out.println("Operaciones -------");
			System.out.println("Suma: " + suma(a,b));
			System.out.println("Resta: " + resta(a,b));
			System.out.println("Multiplicación: " + multiplicacion(a,b));
			System.out.println("Divición: " + division(a,b));
			System.out.println("Módulo: " + modulo(a,b));
			System.out.println("Potencia: " + potencia(a,b));
			System.out.println("Porcentaje: " + porcentaje(a,b));
			
		}
		
		public static int suma(int a, int b) {
			return a + b;
		}
		public static int resta(int a, int b) {
			return a - b;
		}
		public static int division(int a, int b) {
			return a/b;
		}
		public static int modulo(int a, int b) {
			return a % b;
		}
		public static int multiplicacion(int a, int b) {
			return a * b;
		}
		public static int potencia(int a, int b) {
			return a ^ b;
		}
		public static int porcentaje(int a, int b) {
			return (a /100) * b;
		}
	
}
