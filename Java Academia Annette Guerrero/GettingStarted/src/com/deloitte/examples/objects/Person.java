package com.deloitte.examples.objects;

public class Person {
	private double altura, peso;
	private int edad;
	private char genero;
	private String nacionalidad, nombre,apaterno, amaterno, ecivil;
	
	//El constructor jala los atributos
	//Se pueden poner varios constructores en un solo método
	//Si se llama igual que la clase, es el constructor pero pidiendo diferentes datos, cambia
	
	public Person() {
		
	}
	
	public Person(String nombre, String apaterno, String amaterno) {
		//Para usar las variables de forma local en el constructor
		this.nombre=nombre;
		this.apaterno=apaterno;
		this.amaterno=amaterno;
		
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

	public String getApaterno() {
		return apaterno;
	}

	public void setApaterno(String apaterno) {
		this.apaterno = apaterno;
	}

	public String getAmaterno() {
		return amaterno;
	}

	public void setAmaterno(String amaterno) {
		this.amaterno = amaterno;
	}

	public String getEcivil() {
		return ecivil;
	}

	public void setEcivil(String ecivil) {
		this.ecivil = ecivil;
	}
	
	public int suma(int a, int b) {
		return a+b;
	}
	
	public long suma(long a, long b) {
		return a+b;
	}
	
	public double suma(double a, double b) {
		return a+b;
	}
	
	public float suma(float a, float b) {
		return a+b;		
	}
	
	public char suma(char a, char b) {
		return (char) Character.getNumericValue(a+b);
	}
	
	
	 public byte suma(byte a, byte c) { 
		byte b= a;
		byte d= c;
		int x=b;
		int y=d;
		
		 return (byte) (x+y);
		 }
	  
	 public short suma(short a, short b){
		 return (short) (a+b); 
		 }
	 
	 
	 	
}
