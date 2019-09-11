package academia.deloitte;

public class Operaciones {

	public static void main(String[] args) {
		System.out.println("La Suma es igual a: " + suma(1, 2));
		System.out.println("La resta es igual a: " + resta(1, 2));
		System.out.println("La multiplicacin es igual a: " + multiplica(1, 2));
		System.out.println("La division es igual a: " + division(1, 2));
		System.out.println("El mdulo es igual a: " + modulo(13, 4));
		System.out.println("La potencia es igual a: " + potencia(2, 2));
		System.out.println("El porcentaje es igual a: " + porcentaje(20, 1000));
		System.out.println("El factorial de 5 es: " + factorial(5));

	}
	
	public static int suma(int a, int b) {
		return a + b;
	}
	
	public static int resta(int a, int b) {
		return a - b;
	}
	
	public static int multiplica(int a, int b) {
		return a * b;
	}
	
	public static int division(int a, int b) {
		return a / b;
	}
	
	public static double modulo(double a, double b) {
		
		return a % b;
	}
	
	public static double potencia(double a, double b) {
		return (double)Math.pow(a, b);
	}
	
	public static int porcentaje(int a, int b) {
		return (a * b) / 100;
	}
	
    public static int factorial(int a) {
		
		int factorial = 1;
		
		/*if(a == 1) {
			return 1;
		}*/ //No necesario
		
		for (int i = 1; i <= a; i++) {
			factorial = factorial * i;
		}
		
		return factorial;
		
	}
	

}
