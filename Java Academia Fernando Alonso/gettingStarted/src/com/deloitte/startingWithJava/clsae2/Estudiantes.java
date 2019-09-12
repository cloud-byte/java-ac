package com.deloitte.startingWithJava.clsae2;

public class Estudiantes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante studentObject = new Estudiante("Luis Fernando","Alonso","Velazquez",12,8.7);
		studentObject.setCalificacionFinal(9.5);
		System.out.println(
				"Nombre: "+
				studentObject.getNombre()+" "+
				"\nCalificación: "+
				studentObject.getCalificacionFinal()
				);
	}

}
