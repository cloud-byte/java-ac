package com.deloitte.examples.classes;

public class CreateObjects {

	public static void main (String [] args) {
		Person person=new Person ("Luis Gerardo", "Tellez", "Vargas");
		
		String nombre=person.getNombre();
		System.out.println(nombre);
		
		nombre="Albano";
		System.out.println(nombre);
		String nombre2= new String ("Albano");
		
		if(nombre2 == "Albano") {
			System.out.println("Soy Albano");
		}
		else {
			System.out.println("No soy Albano");
		}
		
		for(char i='A'; i <= 'z'; i++)
		{
			if (i<= 'Z' || i >= 'a') {
				System.out.println(i);
			}
		}
		
		
		char i=65;
		/*
		do{
			if(i <= 'Z' || i>= 'a') {				
				System.out.println(i);
			}
			i++;
		}while(i<='z');
		*/
		
		while(i<='z') {
			if (i<='Z' || i>='a') {
				System.out.println(i);
			}
			i++;
		};
	}
}
