package com.deloitte.firstProject.main;

import com.deloitte.firstProject.math.*;

public class ClaseJava {

	public static void main(String[] args) {
		System.out.println("Java Class");
		
		
		System.out.println("Suma: " + com.deloitte.firstProject.math.Operaciones.suma(1, 2));
		System.out.println("Resta:" + com.deloitte.firstProject.math.Operaciones.resta(11, 2));
		System.out.println("Multiplicacion: " + com.deloitte.firstProject.math.Operaciones.multiplicacion(13, 2));
		System.out.println("Division: " + com.deloitte.firstProject.math.Operaciones.division(5, 0));
		System.out.println("Modulo: " + com.deloitte.firstProject.math.Operaciones.mod(5, 2));
		System.out.println("Potencia: " + com.deloitte.firstProject.math.Operaciones.potencia(2, 5));
		System.out.println("Porcentaje: " + com.deloitte.firstProject.math.Operaciones.porcentaje(50, 30));
	}
	
}
