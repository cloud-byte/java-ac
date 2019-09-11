package com.deloitte.examples.classes;
import java.util.Scanner;
public class clase2 {

	public static void main(String[] args) {
		
		System.out.println("HELLO WORLD");
		
		System.out.println("Que operación desea hacer?\n 1. suma \n 2.resta \n 3.multiplicación \n 4.division \n 5.modulo \n 6.potencia \n 7porcentage");
		int op;
		
		Scanner sc= new Scanner(System.in);
		op=sc.nextInt();
	
	
	switch (op) {
	
	case 1:
		int n1=0;
		int n2=0;
		System.out.println("Introduce el primer número:");			
		n1 = sc.nextInt();
		
		System.out.println("Introduce el segundo numero:");			
		n2 = sc.nextInt();
		
		int resultado = n1+n2;
		
		System.out.println("La suma es = "+resultado);
		
		
//		
//		public static int suma (int a, int b) 
//		{
//			return a+b;
//			
//			System.out.println("El resultado de la suma es="+suma(1,2));
//		}
		
		break;
		
case 2:
	
	System.out.println("Introduce el primer número:");			
	n1 = sc.nextInt();
	
	System.out.println("Introduce el segundo numero:");			
	n2 = sc.nextInt();
	
    resultado = n1-n2;
	
	System.out.println("resultado de la resta = "+resultado);
	
	
	
	break;
	
case 3:
	
	System.out.println("Introduce el primer número:");			
	n1 = sc.nextInt();
	
	System.out.println("Introduce el segundo numero:");			
	n2 = sc.nextInt();
	
    resultado = n1*n2;
	
	System.out.println("resultado de la multiplicacion = "+resultado);
	
	
	break;
	
case 4:
	
	System.out.println("Introduce el primer número:");			
	n1 = sc.nextInt();
	
	System.out.println("Introduce el segundo numero:");			
	n2 = sc.nextInt();
	
    resultado = n1/n2;
	
	System.out.println("resultado de la division = "+resultado);
	
	
	break;
	
case 5:
	
	System.out.println("Introduce el primer número:");			
	n1 = sc.nextInt();
	
	System.out.println("Introduce el segundo numero:");			
	n2 = sc.nextInt();
	
    resultado = n1%n2;
	
	System.out.println("resultado del modulo es = "+resultado);
	
	
	break;
	
case 6:
	
	System.out.println("Introduce el primer número:");			
	n1 = sc.nextInt();
	
	System.out.println("Introduce el segundo numero:");			
	n2 = sc.nextInt();
	
    resultado = n1^n2;
	
	System.out.println("resultado de la potencia = "+resultado);
	
	
	break;
	
	
case 7:
	
	System.out.println("Introduce el primer número:");			
	n1 = sc.nextInt();
	
	System.out.println("Introduce el segundo numero:");			
	n2 = sc.nextInt();
	
    resultado = n1*n2/100;
	
	System.out.println("resultado del porcentaje es = "+resultado);
	
	
	break;
	
	}
	
	
	}

}
