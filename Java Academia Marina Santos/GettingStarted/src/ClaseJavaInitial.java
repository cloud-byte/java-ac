
public class ClaseJavaInitial {
	public static void main(String[] args) {
		System.out.println("Practica No. 1: Marina Santos!");
		System.out.println("El resultado de la suma es: "+ suma(2,2));
		System.out.println("El resultado de la resta es: "+ resta(2,2));
		System.out.println("El resultado de la multiplicacion es: "+ mult(2,2));
		System.out.println("El resultado de la division es: "+ div(2,2));
		System.out.println("El resultado de la modulo es: "+modulo(2,2));
		System.out.println("El resultado de la potencia es: "+pot(2,2));
		System.out.println("El resultado del porcentaje es: "+porce(20, 1000));
	}
	
	public static int suma(int a, int b) {
		return a+b;
	}
	
	public static int resta (int a, int b) {
		return a-b;
	}
	
	public static int mult (int a, int b) {
		return a * b; 
	}
	
	public static int div(int a, int b) {
		return a/b;
	}
	
	public static double modulo(int a , int b) {
		return a%b;
	}
	
	public static int pot(int a, int b) {
		return (int) Math.pow(a,b);
	}
	
	public static float porce(int a, int b) {
		return (a*b)/100;
	}
	
	//public static int factorial (int a, int b) {}
}
 