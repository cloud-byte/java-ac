package com.Deloitte.Ejemplos.Academia;

public class Person {
	
	private double altura;
	private int edad;
	private double peso;
	private char genero;
	private String nacionalidad;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String estadoCivil;
//	private char a,b;
//	private short c,d;
//	private int e,f;
//	private long g,h;
//	private float i,j;
//	private double k,l;
//	private byte m,n;
	
	public Person() {
		
	}
	
	public Person(String nombre, String apellidoPaterno, String apellidoMaterno) {
		this.nombre=nombre;
	    this.apellidoPaterno=apellidoPaterno;
		this.apellidoMaterno=apellidoMaterno;
	}
	
	public byte suma(byte m, byte n) {
		return (byte) (m+n);
	}
	
	public int suma(int e, int f) {
		return (int) (e+f);
	}
	
	public float suma(float i, float j) {
		return (float) (i+j);
	}
	
	public double suma(double k, double l) {
		return (double) (k+l);
	}
	
	public long suma(long g, long h) {
		return (long) (g+h);
	}
	
	public char suma(char a, char b) {
		return (char) (a+b);
	}
	
	public short suma(short c, short d) {
		return (short) (c+d);
	}
	
	public boolean suma(boolean c, boolean d) {
		return (boolean) (c && d);
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

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
}
