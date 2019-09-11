package com.deloitte.examples.objects;

public class Person {

	private double altura;
	private int edad;
	private double peso;
	private char genero;
	private String nacionalidad;
	private String nombre;
	private String apellido_paterno;
	private String apellido_materno;
	private String estado_civil;
	
	public Person(String nombre, String apellido_paterno, String apellido_materno){

		this.nombre = nombre;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		
	}
	

	// Getters and Setters 
	
	public double getAltura() {
		return this.altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public char getGenero() {
		return this.genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public String getNacionalidad() {
		return this.nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido_paterno() {
		return this.apellido_paterno;
	}

	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	public String getApellido_materno() {
		return this.apellido_materno;
	}

	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}

	public String getEstado_civil() {
		return this.estado_civil;
	}

	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}
	
	public Integer sumaInt(int a, int b) {
		return a+b;
	}
	
	public byte sumaByte(byte a, byte b) {
		return (byte) (a+b);
	}
	
	public char sumaChar(char a, char b) {
		return (char) (a+b);
	}
	
	public short sumaShort(short a, short b) {
		return (short) (a+b);
	}
	
	public long sumaLong(long a, long b) {
		return (long) (a+b);
	}
	
	public float sumaFloat(float a, float b) {
		return (float) (a+b);
	}
	
	public double sumaDouble(double a, double b) {
		return (double) (a+b);
	}

}
