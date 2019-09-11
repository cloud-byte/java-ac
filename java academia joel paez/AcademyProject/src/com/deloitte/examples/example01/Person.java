package com.deloitte.examples.example01;

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

	
	public Person(String nombre, String apellido_paterno, String apellido_materno) {
		this.nombre = nombre;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;		
	}
	
	
	public static int suma(int a, int b) {
		System.out.println("Metodo INT");
		return a+b;
	}
	
	public static byte suma(byte a, byte b) {
		System.out.println("Metodo BYTE");
		return (byte) (a+b);
	}
	
	public static float suma(float a, float b) {
		System.out.println("Metodo FLOAT");
		return a+b;
	}
	
	public static double suma(double a, double b) {
		System.out.println("Metodo DOUBLE");
		return a+b;
	}
	
	public static long suma(long a, long b) {
		System.out.println("Metodo LONG");
		return a+b;
	}
	
	public static short suma(short a, short b) {
		System.out.println("Metodo SHORT");
		return (short) (a+b);
	}
	
	public static boolean suma(boolean a, boolean b) {
		System.out.println("Metodo Boolean");
		return (boolean) (a&&b);
	}
	
	public static char suma(char a, char b) {
		System.out.println("Metodo Char");
		return (char) (a+b);
	}
		
	public Person() {
		
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

}
