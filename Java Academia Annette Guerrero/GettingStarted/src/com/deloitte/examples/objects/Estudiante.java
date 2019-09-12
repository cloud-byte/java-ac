package com.deloitte.examples.objects;

public class Estudiante extends Person {
	
	private int ncontrol;
	public int getNcontrol() {
		return ncontrol;
	}

	public void setNcontrol(int ncontrol) {
		this.ncontrol = ncontrol;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	private double calificacion;
	
	public Estudiante() {
		
	}

	public Estudiante(String nombre, String apaterno, String amaterno, double altura, double peso,int edad, char genero, String nacionalidad, String ecivil) {
		super(nombre,apaterno,amaterno, altura, peso, edad,genero, nacionalidad,ecivil);
	}
	
	public Estudiante(String nombre, String apaterno, String amaterno,double altura, double peso,int edad, char genero, String nacionalidad, String ecivil, int ncontrol, double calificacion) {
		super(nombre,apaterno,amaterno, altura, peso, edad,genero, nacionalidad,ecivil);
		this.ncontrol= ncontrol;
		this.calificacion= calificacion;
		// TODO Auto-generated constructor stub
	}
	
	

}
