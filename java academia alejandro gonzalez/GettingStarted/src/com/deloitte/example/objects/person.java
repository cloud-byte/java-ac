package com.deloitte.example.objects;

public class person {
	private double altura;
	private int edad;
	private double peso;
	private char genero;
	private String nacionalidad;
	private String nombre;
	private String apellido_paterno;
	private String apellido_materno;
	private String estado_civil;
	
	public person(String nombre, String apellido_paterno,String apellido_materno) 
		{
		this.nombre = nombre;
		this.apellido_paterno=apellido_paterno;
		this.apellido_materno=apellido_materno;
		
		
		}
	public String getNombre()
	{
		return this.nombre;
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
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	
	//person persona = new person("Alejandro","Gonzalez","Castorena" ) ;
}
