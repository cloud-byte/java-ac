package com.Deloitte.Pruebas.Prueba;

public class CreacionDeObjetos  {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		boolean booleanValue=true;
		byte byteValue=127;
		char charValue=97;
		short shortValue=32767;
		int intValue=2147483647;
		long longValue=9223372036854775807L;
		float floatValue=3.4028235e38f;
		double doubleValue=1.7976931348623157e308;
		
		Person persona = new Person("Diego","Moreno","Perez",68.600, 1.76);
		
		System.out.println(persona.getNombre());
		System.out.println(persona.getApellido_paterno());
		System.out.println(persona.getApellido_materno());
		System.out.println(persona.getPeso());
		System.out.println(persona.getAltura());
	
		

		String nombre = persona.getNombre();
		
		nombre="Diego";
		System.out.println(nombre);
		String nombre2= new String ("Diego");
		System.out.println(charValue);
		
		
		char i='A';
		do 
		{
			if ((i<= 'Z' || i>='a') )
			{
				System.out.println(i);
			}
			i++;
			
		} while (i<= 'z');
		
		/*if (charValue == 'a') 
		{
			System.out.println("Soy Diego");
		}
		else
		{
			System.out.println("No soy Diego");
		}
		for (char i = 'A'; i <= 'z'; i++) 
		{
			if ((i<= 'Z' || i>='a') )
			{
				System.out.println(i);
			}
			
		}*/
		
		
		
		
	}
	
	

}
