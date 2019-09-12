package com.Deloitte.Ejemplos.Academia;

public class CreateObjects {

	public static void main(String[] args) {
		
		Person persona1 = new Person ("Misael","Morales","Martinez");
		
		System.out.println(persona1.getApellidoPaterno());
		
		String nombre = persona1.getNombre();
		System.out.println(nombre);
		
		
		nombre= "Misael";
		System.out.println(nombre);
		String nombre2 = new String("Misael");
		
		if (nombre2.contentEquals("Misa")) {
			System.out.println("Si soy yo");
		} else {
			System.out.println("Nel, no soy");
		}
	}

}
