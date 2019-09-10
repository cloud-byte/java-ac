package com.deloitte.startingWithJava.clase1;

public class ClaseJava {
	public static void main(String[] args) {
		System.out.println("HOLA MUNDO");
		System.out.println(suma(3,2));
		System.out.println(resta(3,2));
		System.out.println(multiplicacion(3,2));
		System.out.println(division(3,3));
		System.out.println(modulo(3,2));
		System.out.println(potencia(3,3));
		System.out.println(porcentaje(10,50));
		
		
	}
	public static int suma(int a, int b)
	{
		return a+b;
	}
	public static int resta(int a, int b)
	{
		return a-b;
	}
	public static int multiplicacion(int a, int b)
	{
		return a*b;
	}
	public static int division(int a, int b)
	{
		return a/b;
	}
	public static int modulo(int a, int b)
	{
		return a%b;
	}
	public static int potencia(int a, int b)
	{
		return a^b;
	}
	public static int porcentaje(int a, int b)
	{
		return ((b*a)/100);
	}
}
