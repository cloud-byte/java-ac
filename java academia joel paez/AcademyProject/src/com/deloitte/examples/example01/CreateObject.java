package com.deloitte.examples.example01;

public class CreateObject {
	
	public static void main(String[] args) {
		
		Person persona = new Person("Francisco Joel", "Paez", "Oropeza");
		System.out.println(persona.getNombre());
		System.out.println(persona.getApellido_paterno());
		System.out.println(persona.getApellido_materno());
		
		String nombre = persona.getNombre();
				
		nombre = "Joel Francisco";
		
		System.out.println(nombre);
		
// El siguiente ejercicio se ejemplifica como CHAR puede ser utilizado con numeros o caracteres 
		
		for (char i = 65; i <= 'z'; i++) {
			if(i <= 'Z' || i >= 'a') {
				System.out.println(i);	
			}
		}
		
		char j='A';
		do {
			if(j <= 'Z' || j >= 'a') {
				System.out.println(j);
			}
			j++;
		} while(j <= 'z');
	}
	

}
