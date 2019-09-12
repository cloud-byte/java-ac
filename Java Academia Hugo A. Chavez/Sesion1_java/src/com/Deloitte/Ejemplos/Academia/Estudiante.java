package com.Deloitte.Ejemplos.Academia;

public class Estudiante extends Person {

	private int numeroControl;
	private double calificacionFinal;
	
	public Estudiante() {
	}

//	public Estudiante(String nombre, String apellidoPaterno, String apellidoMaterno) {
//		super(nombre, apellidoPaterno, apellidoMaterno);
//	}

	public Estudiante(String nombre, String apellidoPaterno, String apellidoMaterno, int numeroControl, double calificacionFinal) {
		super(nombre, apellidoPaterno, apellidoMaterno);
		this.numeroControl=numeroControl;
		this.calificacionFinal=calificacionFinal;
	}
	
	public int getNumeroControl() {
		return numeroControl;
	}

	public double getCalificacionFinal() {
		return calificacionFinal;
	}

	public void setCalificacionFinal(double calificacionFinal) {
		this.calificacionFinal = calificacionFinal;
	}

	public void setNumeroControl(int numeroControl) {
		this.numeroControl = numeroControl;
	}

}
