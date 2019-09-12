package com.deloitte.examples.objects;

public class Estudiante extends Person {

	private int numeroControl;
	private double calificacionFinal;
	
	public Estudiante(String nombre, String apellido_paterno, String apellido_materno, String nacionalidad,
			String estado_civil, double altura, double peso, int edad, char genero, int numeroControl, double calificacionFinal) {
		super(nombre, apellido_paterno, apellido_materno, nacionalidad, estado_civil, altura, peso, edad, genero);
		this.numeroControl = numeroControl;
		this.calificacionFinal = calificacionFinal;
	}

	public Estudiante() {
		// TODO Auto-generated constructor stub
	}

	public int getNumeroControl() {
		return numeroControl;
	}

	public void setNumeroControl(int numeroControl) {
		this.numeroControl = numeroControl;
	}

	public double getCalificacionFinal() {
		return calificacionFinal;
	}

	public void setCalificacionFinal(double calificacionFinal) {
		this.calificacionFinal = calificacionFinal;
	}
	
	
}
