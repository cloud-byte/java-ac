package com.Deloitte.Pruebas.Prueba;

import java.util.Scanner;

public class ClaseDePrueba 
{
	public static void main(String[] args) 
	{
		int a,b;
		
		Scanner chocha = new Scanner(System.in);
		
		System.out.println("Ingresa Numero 1:");
		a = chocha.nextInt();
		System.out.println("Ingresa Numero 2: ");
		b =chocha.nextInt();
		
        System.out.println(Suma(a,b));
        System.out.println(Resta(a,b));
        System.out.println(Multiplicacion(a,b));
        System.out.println(Division(a,b));
        System.out.println(Potencia(a,b));
        System.out.println(Porcentaje(a,b));
		System.out.println("Hellow World JAJA");
		
	}
	
	public static int Suma(int a, int b)
	{
		int suma;
		suma= a+b;
	 return  suma;
	}
	
	public static int Resta(int a, int b)
	{
		int resta;
		resta= a-b;
	 return resta;
	}
	
	public static int Multiplicacion(Integer a, Integer b)
	{
	 return a*b;
	}
	
	public static int Division(Integer a, Integer b)
	{
	 return a/b;
	}
	
	public static int Potencia(Integer a, Integer b)
	{
	 return a^b;
	}
	
	public static int Porcentaje(Integer a, Integer b)
	{
	 return a*b/100;
	}
	
	
}
