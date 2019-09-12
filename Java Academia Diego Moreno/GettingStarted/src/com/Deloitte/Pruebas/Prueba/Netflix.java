package com.Deloitte.Pruebas.Prueba;

public class Netflix 
{
	String correo="";
	String password="";
	

	public Netflix(String correo, String password)
	{
		this.correo=correo;
		this.password=password;
	}


	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}


	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
