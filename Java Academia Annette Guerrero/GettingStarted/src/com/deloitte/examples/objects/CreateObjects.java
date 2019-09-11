package com.deloitte.examples.objects;

public class CreateObjects {

	public static void main(String[] args) {
		//Se pueden comparar con ==, pero en String no 
		
		//Datos primitivos que no heredan, por lo cual Java no es un lenguaje totalmente POO
		boolean boolValue= true; //true or false
		byte byteValue= 127; //-128 to 127
		char charValue= 97; //0 to 65535, valores de código ascii
		short shortValue= 32767; //-32768 to 32767
		int intValue= 2147483647; //-2147483648 to 2147483647
		long longValue=1;
		float floatValue=1;
		double doubleValue=1;
		
		
		//Crear objetos
		Person persona = new Person("Annette", "Guerrero", "Ramos");
		
		//System.out.println(persona.getNombre());
		
		String nombre=persona.getNombre();
		System.out.println(nombre);
		
		
		//Los strings son inmutables, por lo cual si se crea uno arriba pero se "sobreescribe", se hará
		//uno nuevo
		nombre = "Emmanuel";
		System.out.println(nombre);
		String nombre2= new String("Emmanuel");
		
		//String == es comparar primer objeto 
		if(nombre.equals("Emmanuel")) {
			System.out.println("Es correcto");
		}else {
			System.out.println("No es correcto");			
		}
		
		
		/*for(char i='A'; i<='z'; i++) {
			if((i<='Z' || i>='a')) {
			
			System.out.println(i);
			
			//For para imprimir sólo las letras
		}}
		**/
		
		//While para imprimir sólo las letras
		/*char i='A';
		do {
			if(i<='Z' || i>='a') {
				System.out.println(i);
			}i++;
		}while(i<='z');
		**/	
		
		//Otro while
		/*
		  char i='A'; while(i<='z'){ if(i<='Z' || i>='a') { System.out.println(i);
		  }i++; }
		 **/
		
	}
}
