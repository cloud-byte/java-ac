package com.deloitte.examples.classes;

public class Estudiante extends Person {
	
	private int numeroControl;
	private double calificacionFinal;
	
	public Estudiante() {
		
	}
	
	public Estudiante(String nombre, String apellidoPat, String apellidoMat) {
		super(nombre,apellidoPat,apellidoMat);
	}
	
//	public Estudiante(String nombre, String apellidoPat, String apellidoMat, int numeroControl, double calificacionFinal) {
//		super(nombre,apellidoPat,apellidoMat,numeroControl,calificacionFinal);
//		this.numeroControl = numero
//	}

}
