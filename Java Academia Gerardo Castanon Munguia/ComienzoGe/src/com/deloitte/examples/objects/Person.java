package com.deloitte.examples.objects;

public class Person {
	
	private double altura,peso,a,b,r;
	private int edad;
	private char genero;
	private String nacionalidad,nombre,apellido_pa,apellido_mat,edo_civil;
	
	public Person(String nombre, String apellido_pa, String apellido_mat) {
		this.nombre=nombre;
		this.apellido_pa = apellido_pa;
		this.apellido_mat = apellido_mat;
	}
	

	//EJERCICIO TEST SUMAS
	
	public Person(double a, double b) {
		
		this.a=a;
		this.b=b;
		r = a+b;
		}
//////////////////////////////////////////////

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



	public String getApellido_pa() {
		return apellido_pa;
	}



	public void setApellido_pa(String apellido_pa) {
		this.apellido_pa = apellido_pa;
	}



	public String getApellido_mat() {
		return apellido_mat;
	}



	public void setApellido_mat(String apellido_mat) {
		this.apellido_mat = apellido_mat;
	}



	public String getEdo_civil() {
		return edo_civil;
	}



	public void setEdo_civil(String edo_civil) {
		this.edo_civil = edo_civil;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getNombre() {
		return this.nombre;
	}
	
	
	public double Suma(double a, double b) {
		return  a+b;
		
	}
	
	public int  Suma(int a, int b) {
		return a+b;
		
	}
	public char  Suma(char a, char b) {
		return (char) (a+b);
		
	}
	public float  Suma4(float a, float b) {
		return (float) (this.a+b);
	}
	public short  Suma5(int a, int b) {
		return (short) (this.a+b);
	}
	public long  Suma6(long a, long b) {
		return (long) (this.a+b);
	}
	public byte  Suma7(int a, int b) {
		return (byte) (this.a+b);
	}



	

	//Person person = new Person(nombre,apellido_pa,apellido_mat);
}
