package com.deloitte.examples.objects;

public class Estudiante extends Person {

	private int numeroControl;
	private double calificacionFinal;
	
	public Estudiante() {	
	}

	public Estudiante(String nombre, String apellido_paterno, String apellido_materno) {
		super(nombre, apellido_paterno, apellido_materno);
	}

	
	public Estudiante(String nombre, String apellido_paterno, String apellido_materno, int numeroControl,
			double calificacionFinal) {
		super(nombre, apellido_paterno, apellido_materno);
		this.numeroControl=numeroControl;
		this.calificacionFinal=calificacionFinal;
	}

	/**
	 * @return the numeroControl
	 */
	public int getNumeroControl() {
		return numeroControl;
	}

	/**
	 * @param numeroControl the numeroControl to set
	 */
	public void setNumeroControl(int numeroControl) {
		this.numeroControl = numeroControl;
	}

	/**
	 * @return the calificacionFinal
	 */
	public double getCalificacionFinal() {
		return calificacionFinal;
	}

	/**
	 * @param calificacionFinal the calificacionFinal to set
	 */
	public void setCalificacionFinal(double calificacionFinal) {
		this.calificacionFinal = calificacionFinal;
	}

	
}
