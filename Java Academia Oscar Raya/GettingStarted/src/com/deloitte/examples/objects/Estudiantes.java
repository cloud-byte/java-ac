package com.deloitte.examples.objects;

public class Estudiantes {

	public static void main(String[] args) {
		
		Estudiante estudiante = new Estudiante("Oscar", "Raya", "Martinez");
		
		System.out.println(estudiante.getNombre());
		
		estudiante.setNumControl(12690235);
		
		estudiante.setCalificacion(90.3);
		
		

	}

}
