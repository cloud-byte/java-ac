package com.deloitte.startingWithJava.clsae2;

public class Estudiante extends Person {
	private int numeroControl;
	private double calificacionFinal;
	
	public Estudiante() {
		// TODO Auto-generated constructor stub
	}

	public Estudiante(String nombre, String apellidoP, String apellidoM,int numeroControl,
			double calificacionFinal) {
		super(nombre, apellidoP, apellidoM);
		// TODO Auto-generated constructor stub
		this.numeroControl=numeroControl;
		this.calificacionFinal=calificacionFinal;
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

	public Estudiante(double altura, int edad, double peso, char genero, String nacionalidad, String nombre,
			String apellidoP, String apellidoM) {
		super(altura, edad, peso, genero, nacionalidad, nombre, apellidoP, apellidoM);
		// TODO Auto-generated constructor stub
		
	}
	

}
