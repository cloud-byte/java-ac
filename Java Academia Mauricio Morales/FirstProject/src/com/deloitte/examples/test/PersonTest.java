package com.deloitte.examples.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.deloitte.examples.objects.*;

class PersonTest {

	@Test
	public void TestPerson() {
		
		byte X = 4;
		byte Y = 8;
		char C = 2;
		char D = 3;
		long A = 1;
		long B = 1;
		double M = 0.11;
		double N = 0.11;
		float E = (float) 0.55;
		float F = (float) 0.45;
		
		
		Person p = new Person("Mauricio", "Morales", "Morales");
		
		assertEquals(4, p.suma(2, 2));
		assertEquals(12, p.suma(X, Y));
		assertEquals(5, p.suma(C, D));
		assertEquals(2, p.suma(A, B));
		assertEquals(0.22, p.suma(M, N));
		assertEquals(1, p.suma(E, F));
		
		assertEquals("Mauricio", p.getNombre());
		assertEquals("Morales",p.getApellido_paterno());
		assertEquals("Morales",p.getApellido_materno());
	}

}