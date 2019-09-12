package Prueba;

public class CreateObjects 
{
	public static void main (String[] args) 
	{
		boolean boolValue = true;
		byte byteValue = 127;
		char charValue = 97;
		short shortValue = 3276;
		int intValue = 2147;
		long longValue = 922;
		float floatValue = 3;
		double doubleValue = 1.79; 
		
		Person persona = new Person("Misael", "Morales", "Martinez");
		String nombre = persona.getNombre();
		System.out.println(nombre);
		nombre = "Gina";
		System.out.println(nombre);
		String nombre2 = new String("Gina");
		System.out.println(charValue);
		
		if (charValue == 'a')
		{
			System.out.println("Soy Gina");
		}
			else {
				System.out.println("No Soy Gina");
			}
		char i='A';
		do {
				if (i<='z' || i>= 'a')
				{
					System.out.println(i);
				}
		i++;
		}while(i<='z');
	Sumas suma = new Sumas();
	
	System.out.println(suma.suma(1,2));	
	System.out.println(suma.suma((byte)87,(byte)2));	
	System.out.println(suma.suma((char)1,(char)2));	
	System.out.println(suma.suma((short)1,(short)2));	
	System.out.println(suma.suma((long)1,(long)2));	
	System.out.println(suma.suma((float)4,(float)3));	
	System.out.println(suma.suma((double)1,(double)2));	
	

		
	}

}
