package com.deloitte.examples.classes;

public class Crear_persona {

	public static void main(String[] args) { // Programa main, en este programa se corre las definiciones en el programa Person.
											 // cuidar la definicion del programa, si es publico, se puede acceder a todo el paquete,
											 // si es private se puede encapsular la información
		
		Person persona = new Person ("Alejandro", "Pérez", "Vaca");
		System.out.println(persona.getNombre() + " " + persona.getApellido_paterno() + " " + persona.getApellido_materno());
	
		
	}
	
}
