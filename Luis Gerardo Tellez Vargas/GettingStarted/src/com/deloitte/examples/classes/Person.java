package com.deloitte.examples.classes;

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
	
	public int Suma(int a, int b) {
		return a+b;
	}
	
	public double Suma(double a, double b) {
		return a+b;
	}
	
	public char Suma(char a, char b) {
		return (char) (a+b);
	}
	
	public short Suma(short a, short b) {
		return (short) (a+b);
	}
	
	public long Suma(long a, long b) {
		return a+b;
	}
	
	public float Suma(float a, float b) {
		return a+b;
	}
	
	public byte Suma(byte a, byte b) {
		return (byte) ((byte) a+b);
	}
	
	public boolean Suma(boolean a, boolean b) {
		return (a && b);
	}

	
}
