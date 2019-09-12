package com.deloitte.startingWithJava.clsae2;

public class Person {
	private double altura;
	private int edad;
	private double peso;
	private char genero;
	private String nacionalidad;
	private String nombre;
	private String apellidoP;
	private String apellidoM;
	
	public Person() {
		
	}
	public Person(String nombre,String apellidoP,String apellidoM) {
		this.nombre= nombre;	
		this.apellidoP=apellidoP;
		this.apellidoM= apellidoM;
	}	
	public Person(double altura, int edad, double peso, char genero, String nacionalidad, String nombre,
			String apellidoP, String apellidoM) {
		super();
		this.altura = altura;
		this.edad = edad;
		this.peso = peso;
		this.genero = genero;
		this.nacionalidad = nacionalidad;
		this.nombre = nombre;
		this.apellidoP = apellidoP;
		this.apellidoM = apellidoM;
	}
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
	public String getApellidoP() {
		return this.apellidoP;
	}
	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}
	public String getApellidoM() {
		return this.apellidoM;
	}
	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}
	
	//CREAR METODOS PARA SUMAR TODOS LOS TIPOS DE DATOS PRIMITIVOS
	public boolean suma(boolean a, boolean b)
	{
		return (boolean)(a||b);
	}
	public byte suma(byte a, byte b)
	{
		return (byte)(a+b);
	}
	public char suma(char a, char b)
	{
		int sumar= (int)(a+b);
		return (char)sumar;
	}
	public short suma(short a, short b)
	{
		return (short)(a+b);
	}
	public int suma(int a, int b)
	{
		return (int)(a+b);
	}
	public long suma(long a, long b)
	{
		return (long)(a+b);
	}
	public float suma(float a, float b)
	{
		return (float)(a+b);
	}
	public double suma(double a, double b)
	{
		return (double)(a+b);
	}
	
	
}
