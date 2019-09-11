package com.Deloitte.Pruebas.Prueba;

public class Person 
{
	double altura;
	int edad;
	double peso;
	char genero;
	String nacionalidad;
	String nombre;
	String apellido_paterno;
	String apellido_materno;
	String estado_civil;
	
	
	int suma;
	
	public Person(String nombre, String apellido_paterno,String apellido_materno,double altura, double peso) 
	{

		this.nombre=nombre;
		this.apellido_paterno=apellido_paterno;
		this.apellido_materno=apellido_materno;
		this.altura=altura;
		this.peso=peso;
		
	}
	
	public Person(int suma) 
	{
		this.suma=suma;
	}
	public Person() 
	{
		
	}
	

	public void setSuma(int suma) {
		this.suma = suma;
	}
	public void getSuma(int suma) {
		this.suma = suma;
	}
	
	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * @return the genero
	 */
	public char getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(char genero) {
		this.genero = genero;
	}

	/**
	 * @return the nacionalidad
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}

	/**
	 * @param nacionalidad the nacionalidad to set
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido_paterno
	 */
	public String getApellido_paterno() {
		return apellido_paterno;
	}

	/**
	 * @param apellido_paterno the apellido_paterno to set
	 */
	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	/**
	 * @return the apellido_materno
	 */
	public String getApellido_materno() {
		return apellido_materno;
	}

	/**
	 * @param apellido_materno the apellido_materno to set
	 */
	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}

	/**
	 * @return the estado_civil
	 */
	public String getEstado_civil() {
		return estado_civil;
	}

	/**
	 * @param estado_civil the estado_civil to set
	 */
	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}
	
	public byte suma(byte a, byte b) 
	{
		int r=a+b;
		byte c= (byte)r;
		return c;
	}
	
	public double suma(double a, double b) 
	{
		return (double) a+b;
	}
	
	public int suma (int a, int b) 
	{
		return a+b;
	}
	
	public long suma (long a, long b) 
	{
		return a+b;
	}
	
	public boolean suma (boolean a, boolean b) 
	{
		return true;
	}
	
	public float suma (float a, float b) 
	{
		return a+b;
	}
	
	public int suma (char a, char b) 
	{
		return (char) a+b;
	}
	
	public int suma (short a, short b) 
	{
		return (short) a+b;
	}
	
	
	

}
