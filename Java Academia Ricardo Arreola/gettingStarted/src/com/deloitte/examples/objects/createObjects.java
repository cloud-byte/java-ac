package com.deloitte.examples.objects;

public class createObjects {

	public static void main(String[] args) {
		Person persona = new Person("Ricardo", "Arreola", "Martínez");
		System.out.println(persona.getNombre());
		
		
		persona.setAltura(73.2);
		System.out.println(persona.getAltura());
		
		char i = 'A';
		while(i >= 'a' || i <= 'Z') {
			System.out.println(i);
			i++;
		}
		
		System.out.println("-------------------------------------------------------------");
		for ( i = 'A'; i <= 'z'; i++) {
			if (i >= 'a' || i <= 'Z') {
				System.out.println(i);

			}
		}
	}
	
}
