package com.deloitte.example.objects;

public class Estudiante extends person {

	public Estudiante(double altura, int edad, double peso, char genero, String nacionalidad, String nombre,
			String apellido_paterno, String apellido_materno, String estado_civil) {
		//super(altura, edad, peso, genero, nacionalidad, nombre, apellido_paterno, apellido_materno, estado_civil);
		// TODO Auto-generated constructor stub
	}

	public Estudiante() {
		// TODO Auto-generated constructor stub
	}
	private int numerodecontrol;
	private double calificacion;
	public Estudiante(String nombre, String apellido_paterno, String apellido_materno,int numerocontrol,double calificacion) {
		super(nombre, apellido_paterno, apellido_materno);
		this.numerodecontrol=numerocontrol;
		this.calificacion=calificacion;
	}

	/**
	 * @return the numerodecontrol
	 */
	public int getNumerodecontrol() {
		return numerodecontrol;
	}

	/**
	 * @param numerodecontrol the numerodecontrol to set
	 */
	public void setNumerodecontrol(int numerodecontrol) {
		this.numerodecontrol = numerodecontrol;
	}

	/**
	 * @return the calificacion
	 */
	public double getCalificacion() {
		return calificacion;
	}

	/**
	 * @param calificacion the calificacion to set
	 */
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

}
