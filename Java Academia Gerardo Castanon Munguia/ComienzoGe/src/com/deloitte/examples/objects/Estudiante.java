package com.deloitte.examples.objects;

public class Estudiante extends Person {
	private int numControl;
	private int calificacion;
	public Estudiante(String nombre, String apellido_pa, String apellido_mat, int numControl, int calificacion) {
		super(nombre, apellido_pa, apellido_mat);
		this.numControl=numControl;
		this.calificacion=calificacion;
		
	}
	public Estudiante(String nombre, String apellido_pa, String apellido_mat) {
		super(nombre, apellido_pa, apellido_mat);
		
		
	}
	public int getNumControl() {
		return numControl;
	}
	public void setNumControl(int numControl) {
		this.numControl = numControl;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	
}
