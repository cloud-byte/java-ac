package mxdeloitte.com.examples.clases;

public class CreateObjects {

		public static void main (String[] args) {
			
		
		Sumas suma = new Sumas();
		System.out.println(suma.suma(1, 2));
		System.out.println(suma.suma((byte) 1 ,(byte) 2));
		System.out.println(suma.suma((char) 1, (char) 2));
		System.out.println(suma.suma((short) 1, (short) 2));
		System.out.println(suma.suma((long) 1, (long) 2));
		System.out.println(suma.suma((float) 1, (float) 2));
		System.out.println(suma.suma((double) 1, (double) 2));
		System.out.println(suma.suma(true, false));
		
		
			boolean boolValue = true;
			byte byteValue = 127;
			char charValue = 97;
			short shortValue = 3276;
			int intValue = 2147;
			long longValue = 922;
			float floatValue = 3;
			double doubleValue = 1.79;
			
		Persona person = new Persona("Pablo", "Lujan", "Hernandez");
		
		String nombre = person.getNombre();
		System.out.println(nombre);
		
		nombre = "Ivan";
		System.out.println(nombre);
		String nombre2 = new String ("Pablo");
		
		if (nombre2.equals("Albano")) {
			System.out.println("Soy Ivan");
		}
		else {
			System.out.println("No soy Ivan");
		}
		
		
		
		
	}

}
