package com.deloitte.examples.objects;

public class Person {
	
	private double altura, peso;
	private int edad;
	private char genero;
	private String nacionalidad, nombre, apellido_paterno, apellido_materno, estado_civil;
	
	public byte sumaByte(byte a, byte b) {
		return (byte) (a+b);
	}
	
	public char sumaChar(char a, char b) {
		return (char) (a+b);
	}
	
	public short sumaShort(short a, short b) {
		return (short) (a+b);
	}
	
	public int sumaInt(int a, int b) {
		return a+b;
	}
	
	public long sumaLong(long a, long b) {
		return a+b;
	}
	
	public float sumaFloat(float a, float b) {
		return a+b;
	}
	
	public double sumaDouble(double a, double b) {
		return a+b;
	}
	
	public Person() {
		
	}
	
	public Person(String nombre, String apellido_paterno, String apellido_materno) {
		this.nombre=nombre;
		this.apellido_paterno=apellido_paterno;
		this.apellido_materno=apellido_materno;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
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
