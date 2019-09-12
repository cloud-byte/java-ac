package com.deloitte.examples.objects;

public class Estudiantes {

	public static void main(String[] args) {
		
		Estudiante estudiante = new Estudiante("Marina", "Santos", "Antunez");
		
		System.out.println(estudiante.getNombre());
		
		estudiante.setNumControl(12690235);
		
		estudiante.setCalificacion(90.3);
		
		

	}

}
