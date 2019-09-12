package com.deloitte.examples.classes;

public class Student extends Person {
	
	private double promedio;
	private int noControl;

	public Student () { 
	}
	 
	public Student (String nombre, String apellido_paterno, String apellido_materno, double altura, double peso) {
		super (nombre,apellido_paterno, apellido_materno, altura, peso);	
	}
	
	public Student (String nombre, String apellido_paterno, String apellido_materno, double altura, double peso, double promedio, int noControl) { 
		super (nombre,apellido_paterno, apellido_materno, altura, peso);
		this.promedio = promedio;
		this.noControl = noControl;
		}
	
//Incomplete



}
