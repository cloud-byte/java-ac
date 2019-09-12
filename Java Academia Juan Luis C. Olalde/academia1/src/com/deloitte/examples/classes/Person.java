package com.deloitte.examples.classes;

public class Person {
	
	private Double altura;
	private int edad;
	private Double peso;
	private char genero;
	private String nacionalidad;
	private String nombre;
	private String apellidoPat;
	private String apellidoMat;
	private String estado_civil;
	
	//private boolean bollValue = true; //true or false
	private byte byteValue; // -129 to 127
	private char charA, charB; //0 to 65535
	private short shortA, shortB; // -32 to 32
	private long longA, longB;
	private float floatA, floatB;
	
	int suma;
	
	
public Person() {
		
	}
	public Person(String nombre, String apellidoPat, String apellidoMat) {
	this.nombre=nombre;
	this.apellidoPat=apellidoPat;
	this.apellidoMat=apellidoMat;
	
	}
	
	public char suma(char a,char b) {
		char resultado =(char) (a+b);
		return resultado;
	}
	public short suma(short a, short b) {
		short resultado =(short) (b+b);
		return resultado;
	}
	public long suma(long a, long b) {
		long resultado =a+b;
		return resultado;
	}
	public float suma(float a, float b) {
		float resultado =a+b;
		return resultado;
	}
	public byte suma(byte a, byte b) {
		byte resultado =(byte) (a+b);
		return resultado;
	}
	public int suma(int a, int b) {
		int resultado =a+b;
		return resultado;
	}
	public double suma(double a, double b) {
		double resultado =a+b;
		return resultado;
	}
	
	
	public int getSuma() {
		return suma;
	}
	public void setSuma(int suma) {
		this.suma = suma;
	}
	public char getCharA() {
		return charA;
	}
	public void setCharA(char charA) {
		this.charA = charA;
	}
	public char getCharB() {
		return charB;
	}
	public void setCharB(char charB) {
		this.charB = charB;
	}
	public short getShortA() {
		return shortA;
	}
	public void setShortA(short shortA) {
		this.shortA = shortA;
	}
	public short getShortB() {
		return shortB;
	}
	public void setShortB(short shortB) {
		this.shortB = shortB;
	}
	public long getLongA() {
		return longA;
	}
	public void setLongA(long longA) {
		this.longA = longA;
	}
	public long getLongB() {
		return longB;
	}
	public void setLongB(long longB) {
		this.longB = longB;
	}
	public float getFloatA() {
		return floatA;
	}
	public void setFloatA(float floatA) {
		this.floatA = floatA;
	}
	public float getFloatB() {
		return floatB;
	}
	public void setFloatB(float floatB) {
		this.floatB = floatB;
	}
	
	
	public static int metodoSuma (int a, int b) {
		int suma =a+b;
		return suma;
	}
	
	
	
	
	
	
	

	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
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
	
	public String getApellidoPat() {
		return apellidoPat;
	}


	public void setApellidoPat(String apellidoPat) {
		this.apellidoPat = apellidoPat;
	}


	public String getApellidoMat() {
		return apellidoMat;
	}


	public void setApellidoMat(String apellidoMat) {
		this.apellidoMat = apellidoMat;
	}

	public String getEstado_civil() {
		return estado_civil;
	}
	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}

	
	
	

}
