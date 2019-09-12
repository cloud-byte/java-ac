package com.deloitte.examples.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.deloitte.examples.objects.*;

class PersonTest {

	Person p = new Person("Mauricio", "Morales", "Morales");
	
	@Test
	public void TestPerson() {
		
		byte X = 4;
		byte Y = 8;
		char C = 'a';
		char D = 1;
		long A = 1;
		long B = 1;
		double M = 0.11;
		double N = 0.11;
		float E = (float) 0.55;
		float F = (float) 0.45;
		
		
		assertEquals(4, p.suma(2, 2));
		assertEquals((byte)12, p.suma(X, Y));
		assertEquals('b', p.suma(C, D));
		assertEquals((long)2, p.suma(A, B));
		assertEquals(0.22, p.suma(M, N));
		assertEquals(1.0, p.suma(E, F));
		
		assertEquals("Mauricio", p.getNombre());
		assertEquals("Morales",p.getApellido_paterno());
		assertEquals("Morales",p.getApellido_materno());
	}
	
}