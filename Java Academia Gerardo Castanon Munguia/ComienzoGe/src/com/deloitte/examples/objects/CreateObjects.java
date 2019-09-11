package com.deloitte.examples.objects;

public class CreateObjects {
	public static void main(String[] args) {
		Person persona = new Person("Gerardo", "Castañon","Munguía");
		
		String nombre = persona.getNombre();
		System.out.println(nombre);
		
		nombre ="GerardoCas";
		System.out.println(nombre);
		String nombre2 = new String("GerardoCas");
		
		if(nombre2.equals("GerardoCas"))
        {
			System.out.println("Soy Gerardo");
		}
		else {
			System.out.println("No Soy Gerardo");
		}
		
		char i = 'A';
		for (i = 'A'; i<= 'z'; i++) {
			if (i<='Z' || i>= 'a') {
				System.out.println(i);
			}
			}
		
		
		
		//System.out.println(persona.getApellido_pa());
		//System.out.println(persona.getApellido_mat());
	}

}
