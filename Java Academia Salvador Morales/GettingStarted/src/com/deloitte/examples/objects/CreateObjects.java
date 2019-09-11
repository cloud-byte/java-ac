package com.deloitte.examples.objects;

public class CreateObjects {

	public static void main(String[] args) {
		
		boolean boolValue = true; //true of false
		byte byteValue = 127; // -128 to 127
		char charValue = 97; // 0 to 65535
		short shortValue = 32767; // -32768 to 32767
		int intValue = 2147483647; // -214748368 to 2147483647
		long longValue = 9223372036854775807L; // -9223372036854775808 to 9223372036854775807L
		float floatValue = 3.4028235e38f; // -1.17549435e-38 to 3.4028235e 38
		double doubleValue = 1.7976931348623157e308; // -4.9e-324 to 1.7976931348623157e 308
	
		Person persona = new Person("Salvador", "Morales", "Jimenez del Prado");
		
		String nombre = persona.getNombre();
		System.out.println(nombre);
		
		nombre = "Albano";
		System.out.println(nombre);
		String nombre2 = new String("Albano");
		System.out.println(charValue);
		
		if (charValue == 'a') {
			System.out.println("Soy Albano");
		} else {
			System.out.println("No soy Albano");
		}
		
		char i = 'A';
		do {
			if (i<= 'Z' || i>= 'a') {
				System.out.println(i);
			}
			i++;
		} while(i<='z');
		
/*		for (char i = 65; i <= 'z'; i++) {
			if (i<= 'Z' || i>= 'a') {
				System.out.println(i);
			}
		}	
*/
	}
}
