package com.deloitte.examples.objects;

public class Estudiantes extends Person {

	public static void main(String[] args) {
		Estudiante estudiante= new Estudiante("Annette", "Guerrero","Ramos",1.60,75,21,'F',"Mexicana","Soltera",123,9.5);
		System.out.println(estudiante.getNombre());
		estudiante.setCalificacion(9.0);
	}

}
