
public class FormulasJava {
	public static void main(String [] Args) {
		System.out.println(suma(1,2));
		System.out.println(resta(10,8));
		System.out.println(multiplicacion(3,3));
		System.out.println(division(9,3));
		System.out.println(modulo(5,2));
		System.out.println(potencia(3,3));
		System.out.println(porcentaje(100,20));
	}
	public static int suma(int a, int b) {
		return a + b;
	}
	public static int resta(int a, int b) {
		return a - b;
	}
	public static int multiplicacion(int a, int b) {
		return a * b;
	}
	public static int division(int a, int b) {
		return a / b;
	}
	public static int modulo(int a, int b) {
		return a % b;
	}
	public static int potencia(int a, int b) {
		return (int) Math.pow(a, b);
	}
	public static int porcentaje(int a, int b) {
		return (a/100)*b;
	}

}
