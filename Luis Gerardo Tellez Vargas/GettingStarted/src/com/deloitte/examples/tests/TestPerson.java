package com.deloitte.examples.tests;

import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import com.deloitte.examples.classes.Person;

class TestPerson {

	@Test
	public void TestPersona() {
		Person p=new Person("Luis Gerardo", "Tellez", "Vargas");
		
		assertEquals("Luis Gerardo", p.getNombre());
		assertEquals("Tellez", p.getApellido_paterno());
		assertEquals("Vargas", p.getApellido_materno());
		
		short a = 127;
		short b = 3;
		short res = 130;
		
		int c= 2;
		int d= 1;
		int resInt=3;
		/*
		 * Algunos ya tienen valores arriba para no castear otros los voy a modificar
		 * pero es para tener los dos ejemplos
		 * Para adentrarnos a la TestData Class...
		 * */
		 */
		assertEquals(resInt,p.Suma(c,d));
		assertEquals('c',p.Suma('a', (char) 2));
		assertEquals(234524312,p.Suma(234524311,1 ));
		assertEquals(5.77,p.Suma(2.34, 3.43),0);
		assertEquals(res,p.Suma(a,b));
		assertEquals(2.34,p.Suma((float) 2.65,(float) -0.31),0.05);
		assertEquals(122,p.Suma((byte) 100, (byte)22));
		
		
		
	}
	
}
