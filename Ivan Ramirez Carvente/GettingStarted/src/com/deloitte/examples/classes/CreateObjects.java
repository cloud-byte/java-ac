package com.deloitte.examples.classes;

public class CreateObjects {

	public static void main (String[] args) {
		
		boolean boolValue = true;
		byte byteValue = 127;
		char charValue = 97;
		short shortValue = 3276;
		int intValue = 2147;
		long longValue = 922;
		float floatValue = 3.0f;
		double doubleValue = 1.79;
		
		Sumas suma = new Sumas();
		System.out.println(suma.suma(1, 2));
		System.out.println(suma.suma(1, 2));
		System.out.println(suma.suma((byte)2, (byte)3));
		System.out.println(suma.suma((char)4, (char)6));
		System.out.println(suma.suma((short)2, (short)3));
		System.out.println(suma.suma((long)2, (long)3));
		System.out.println(suma.suma((float)2, (float)3));
		System.out.println(suma.suma((double)2, (double)3));
		System.out.println(suma.suma((boolean)true, (boolean)false));
		
		
		Person person = new Person("Ivan", "Ramirez", "Carvente");
		
		String nombre = person.getNombre();
		System.out.println(nombre);
		
		nombre = "Ivan";
		System.out.println(nombre);
		String nombre2 = new String ("Ivan");
		
		if (nombre2.equals("Ivan")) {
			System.out.println("Soy Ivan");
		}
		else {
			System.out.println("No soy Ivan");
		}
		
		
	}
}
