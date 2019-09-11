package com.Deloitte.Pruebas.Prueba;

public class estudiante extends Person
{
	private int promedio;
	private int noControl;
	public estudiante () 
	{
		
	}
	
	public estudiante (String nombre, String apellido_Paterno, double altura, double peso) 
	{
		super(nombre, apellido_Paterno, apellido_Paterno, altura, peso);
	}
	
	public estudiante (String nombre, String apellido_Paterno, double altura, double peso, int promedio, int noControl) 
	{
		super(nombre, apellido_Paterno, apellido_Paterno, altura, peso);
		
		this.promedio=promedio;
		this.noControl=noControl;
	}

	/**
	 * @return the promedio
	 */
	public int getPromedio() {
		return promedio;
	}

	/**
	 * @param promedio the promedio to set
	 */
	public void setPromedio(int promedio) {
		this.promedio = promedio;
	}

	/**
	 * @return the noControl
	 */
	public int getNoControl() {
		return noControl;
	}

	/**
	 * @param noControl the noControl to set
	 */
	public void setNoControl(int noControl) {
		this.noControl = noControl;
	}
	
	
	

}
