package com.deloitte.examples.objects;

public class Estudiantes {

	

	public static void main(String[] args) {
		Estudiante estudiante = new Estudiante("Gerardo","Casta�on","Munguia");
		System.out.println(estudiante.getNombre());
		estudiante.setCalificacion(90);

	}

}
