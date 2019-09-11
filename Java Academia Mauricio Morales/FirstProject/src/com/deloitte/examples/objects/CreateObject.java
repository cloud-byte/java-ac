package com.deloitte.examples.objects;

public class CreateObject {
	
	public static void main(String[] args) {
		
		Person persona = new Person("Mauricio", "Morales", "Morales");
		
		String nombre = persona.getNombre();
		System.out.println(nombre);
		
		/*
		//For
		char i;
		
		for (i = 'A'; i <= 'z'; i++) {
			if (i <= 'Z' || i >= 'a') {
				System.out.println(i);
			}
		}
		*/
		
		//do while
		char i='A';
		do {
			if (i <='Z' || i >='a') {
				System.out.println(i);
			}
			i++;
		}while(i<='z');
		

	}
}
