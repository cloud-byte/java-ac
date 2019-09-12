package com.deloitte.examples.objects;

public class Estudiante extends Person {
	
	private int numeroControl;
	private double calificacion;
	

	public Estudiante() {
		// TODO Auto-generated constructor stub
	}

	public Estudiante(String nombre, String apellido_paterno, String apellido_materno) {
		super(nombre, apellido_paterno, apellido_materno);
		// TODO Auto-generated constructor stub
	}

	public Estudiante(int edad, char genero, double altura, double peso, String nacionalidad, String nombre,
			String apellido_paterno, String apellido_materno, String estado_civil) {
		super(edad, genero, altura, peso, nacionalidad, nombre, apellido_paterno, apellido_materno, estado_civil);
		// TODO Auto-generated constructor stub
	}

}
