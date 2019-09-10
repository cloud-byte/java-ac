package com.deloitte.app.componente;

public class JavaClase {

	public static void main(String[] args) {
		
		System.out.println("Java Class");
		System.out.println(suma(5,8));
		System.out.println(resta(5,8));
		System.out.println(multiplicacion(5,8));
		System.out.println(division(5,8));
		System.out.println(modulo(17,8));
		System.out.println(potencia(2,3));
		System.out.println(porcentaje(5,8));
		
	}	
	
	public static int suma (int a,int b)
	{
		return  a+b;	
	}
	
	public static int resta (int a,int b)
	{
		return a-b;	
	}
	
	public static int multiplicacion (int a,int b)
	{
		return a*b;	
	}
	public static int division (int a,int b)
	{
		return a/b;	
	}
	
	public static double modulo (double a,double b)
	{
		return a%b;	
	}
	public static double potencia (double a,double b)
	{
		return Math.pow(a, b);	
	}
	public static double porcentaje (double a,double b)
	{
		return (a*b)/100;	
	}
}
