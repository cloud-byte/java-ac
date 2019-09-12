package com.deloitte.examples.example01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	public void TestPerson(){
		
		Person P = new Person("Joel", "Paez", "Oropeza");
		
		assertEquals("Joel", P.getNombre());
		assertEquals("Paez", P.getApellido_paterno());
		assertEquals("Oropeza", P.getApellido_materno());
		
	}
	
	@Test
	public void TestSuma() {
		
//		This part is showing how we can use suma in wrong way.
		System.out.println("Int: " + Person.suma(2, 3));
		System.out.println("Double: " + Person.suma(5.2, 3.2));
		System.out.println("Float: " + Person.suma(3.5, 2.5));
		System.out.println("Long: " + Person.suma(100, 200));
		System.out.println("Byte: " + Person.suma(1, 3));
		System.out.println("Short: " + Person.suma(5, 6));
		
//		This part is setting the correct parameters to use in each suma method.
		int num = 5;
		Double num1 = 5.312345667789;
		Float num2 = new Float(6.0);
		Long num3 = new Long(300);
		Byte num4 = 4;
		Short num5 = 11;
		Boolean num6 = false;
		char num7 = 97;
		
		
		assertEquals(num,Person.suma(2, 3));
		assertEquals(num1,Person.suma(5.2, 0.112345667789));
		assertEquals(num2,Person.suma(new Float((float)3.5), new Float((float)2.5)));
		assertEquals(num3,Person.suma(new Long((long)100),new Long((long) 200)));
		assertEquals(num4,Person.suma(new Byte((byte)1),new Byte((byte) 3)));
		assertEquals(num5,Person.suma(new Short((short) 5),new Short((short) 6)));
		assertEquals(num6,Person.suma(false,true));
		assertEquals(num7,Person.suma('C','m'));
		
	}
	
	
	
	
}
