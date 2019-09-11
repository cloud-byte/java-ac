package com.deloitte.examples.objects;

public class CreateObjects {

	public static void main(String[] args) {
		
		
		//***********Tipos de datos de Java**************
		boolean boolValue = true; //true or false
		byte byteValue = 127; //-128 to 127
		char charValue = 97; //0 to 65535
		short shortValue = 32767; //-32768 to 32767
		int intValue = 2147483647; //-2147483648 to 2147483647
		long longValue = 9223372036854775807L; //-9223372036854775808 to 9223372036854775807
		float floatValue = 3.4028235e38f; //1.17549435e-38 to 3.4028235e 38
		double doubleValue = 1.7976931348623157e308; //4.9e-324 to 1.7976931348623157e 308
		
		Person persona = new Person("Oscar ", "Raya ", "Martinez");
		
		String nombre = persona.getNombre();
		String apellido_paterno = persona.getApellido_paterno();
		String apellido_materno = persona.getApellido_materno();
		
		
		
		//System.out.println(nombre + apellido_paterno + apellido_materno);
		
		
		//Para realizar una validación de Strings se debe utilizar la función equals()
		
//		if(nombre.equals("Oscar ")) {
//			System.out.println("Soy Oscar");
//		} else {
//			System.out.println("No soy Oscar");
//		}
//		System.out.println("Ciclo FOR: ");
//		char i;
//		for(i = 'A'; i <= 'z'; i++) {
//			if(i <= 'Z' || i >= 'a') {
//				System.out.print(i + " ");
//				System.out.println((int)i);
//			}
//		}
//		
//		System.out.println("Ciclo WHILE: ");
//		i = 'A';
//		while(i <= 'z') {
//			if(i <= 'Z' || i >= 'a') {
//				System.out.print(i + " ");
//				System.out.println((int)i);
//			}
//			i++;
//		}
//		System.out.println("Ciclo DO WHILE: ");
//		
//		i = 'A';
//		do {
//			if(i <= 'Z' || i >= 'a') {
//				System.out.print(i + " ");
//				System.out.println((int)i);
//			}
//			i++;
//		}while(i <= 'z');

	}

}
