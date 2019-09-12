package com.deloitte.examples.test;

import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.deloitte.examples.objects.Person;

class PersonTest {
	
	//Escribir @Test para identificar que es una prueba
	@Test
	public void TestPerson() {
	Person p = new Person("Annette", "Guerrero", "Ramos");
	
	double a = 1.0;
	double b = 2.0;
	double resDouble = 3.0;
	
	assertEquals("Annette", p.getNombre());
	assertEquals("Guerrero", p.getApaterno());
	assertEquals("Ramos", p.getAmaterno());
	//double
	assertEquals(resDouble,(p.suma(a, b)),0);
	//float
	assertEquals(10,(p.suma(1.0f , 9.0f)),1);
	//int
	assertEquals(69.0,(p.suma(39,30)),1);
	//char
	assertEquals(65535,(p.suma('a', 'b')),1);
	//long
	assertEquals(180,(p.suma(100L, 80L)),1);
	//short
	assertEquals(6, p.suma((short)2,(short)4),1);
	//byte
	assertEquals(50,p.suma((byte)20,(byte)30),1);
	//boolean
	assertEquals(false, p.suma(true, false));
		
	
	
	
	
	
	
		
		
		  
		  
		/*
		 * System.out.println(p.sumabyte(127,127));
		 * System.out.println(p.sumashort(10,12));
		 */ 
		 

	}
	
	
}
