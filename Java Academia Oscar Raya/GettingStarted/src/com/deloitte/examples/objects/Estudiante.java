package com.deloitte.examples.objects;

public class Estudiante extends Person {
	
	
	private int numControl;
	private double calificacion;
	
	
	public Estudiante() {
		
	}

	public Estudiante(String nombre, String apellido_paterno, String apellido_materno, int numControl, double calificacion) {
		super(nombre, apellido_paterno, apellido_materno);
		this.numControl = numControl;
		this.calificacion = calificacion;
	}
	
	public Estudiante(String nombre, String apellido_paterno, String apellido_materno) {
		super(nombre, apellido_paterno, apellido_materno);

	}

	public int getNumControl() {
		return numControl;
	}

	public void setNumControl(int numControl) {
		this.numControl = numControl;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	
	
	
	

}
