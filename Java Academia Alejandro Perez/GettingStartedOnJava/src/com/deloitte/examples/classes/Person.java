package com.deloitte.examples.classes;

// Este programa constructor, define nuestra clase, el programa no tiene outputs, solo definiciones. 

public class Person {	//Definir la clase, atributos que va tener nuestro objeto. 

	double altura;
	int edad;
	double peso;
	char genero;
	String nacionalidad;
	String nombre;
	String apellido_paterno;
	String apellido_materno;
	String estado_civil;
	
	public Person() {	//Método constructor, permite dar caracteristicas a los atributos creados dentro de la clase.
	}
	public Person(String nombre, String apellido_paterno, String apellido_materno) { // Método constructor con el mismo nombre pero con parametros.
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		this.nombre = nombre;	
	}
	
	// Click derecho, Source --> Generate Getters and Setters, realiza la asignación de valores a los atributos definidos.
		
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido_paterno() {
		return apellido_paterno;
	}
	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}
	public String getApellido_materno() {
		return apellido_materno;
	}
	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}
	public String getEstado_civil() {
		return estado_civil;
	}
	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}
	


	
}

