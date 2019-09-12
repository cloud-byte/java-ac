package com.deloitte.examples.objects;

public class Person {
	
	private int age;
 	private char gender;
 	private double height;
 	private double weight;
 	private String name;
 	private String eyeColor;
  	
 	private double a,b;
 
	public Person() {
	}
	
	public int suma(int a, int b) {
		
		return (a + b);
	}
	
	public long suma(long a, long b) {
		return (a + b);
	}
	
	public short suma(short a, short b) {
		return (short) (a + b);
	}
	
	public byte suma(byte a, byte b) {
		return (byte) (a + b);
	}
	
	public boolean suma(boolean a, boolean b) {
		return (a || b);
	}
	
	public float suma(float a, float b) {
		return (a + b);
	}
	
	public double suma(double a, double b) {
		return (a + b);
	}
	
	public char suma(char a, char b) {
		return (char) (a + b);
	}
 	
 	
	
	
	
	public Person(int edad, char genero, double altura, double peso, String nacionalidad, String nombre,
			String apellido_paterno, String apellido_materno, String estado_civil) {
		super();
		this.edad = edad;
		this.genero = genero;
		this.altura = altura;
		this.peso = peso;
		this.nacionalidad = nacionalidad;
		this.nombre = nombre;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		this.estado_civil = estado_civil;
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
