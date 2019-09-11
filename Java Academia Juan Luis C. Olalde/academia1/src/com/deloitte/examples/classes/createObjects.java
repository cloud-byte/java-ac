package com.deloitte.examples.classes;

public class createObjects {

	public static void main(String[] args) {
	
		Person person = new Person("Albano","Pena","Torres");
		
		String nombre = person.getNombre();
		System.out.println(nombre);
		
		nombre="Albano";
		System.out.println(nombre);
		String nombre2 = new String("Albano");
		
		if(nombre2.equals("Albano")) {
			System.out.println("soy Albano");
		}else {
			System.out.println("No soy Albano");
		}
		
	
//		char i='A';
//		do {
//			if (i <= 'Z' || i >= 'a') {
//				
//				System.out.println(i);
//			}
//			i++;
//		} while (i<='z');
		
		char i;
		for (i = 'A'; i <= 'z'; i++) {
			if (i <= 'Z' || i >= 'a') {
				System.out.println(i);
				
			}
		}
		
		
		

	}

}
