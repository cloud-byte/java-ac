package com.deloitte.examples.classes;

public class Example {

	public static void main (String[] args) {
	System.out.println("Hola");
	System.out.println(Sumar(1, 2));
	System.out.println(Resta(1, 2));
	System.out.println(Mult(1, 2));
	System.out.println(Div(1, 2));
	System.out.println(Mod(1, 2));
	System.out.println(Porcentaje(1, 2));
	}
	
	public static int Sumar(int n1, int n2){
	    int r = n1 + n2;
	    return r;
	    }

	public static int Resta(int n1, int n2){
	    int r = n1 - n2;
	    return r;
	    }

	public static int Mult(int n1, int n2){
	    int r = n1 * n2;
	    return r;
	    }

	public static int Div(int n1, int n2){
	    int r = n1 / n2;
	    return r;
	    }  

	public static int Mod(int n1, int n2){
	    int r = n1 % n2;
	    return r;
	    }
	
	public static int Porcentaje(int n1, int n2){
	    int r = (n1 + n2)/2;
	    return r;
	    }
}
