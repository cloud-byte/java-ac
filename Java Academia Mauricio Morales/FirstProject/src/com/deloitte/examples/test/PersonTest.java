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
		
		assertEquals(4, p.suma1(2, 2),"Yeah");
		assertEquals(12, p.suma2(X, Y));
		assertEquals(5, p.suma3(C, D));
		assertEquals(2, p.suma4(A, B));
		assertEquals(0.22, p.suma5(M, N));
		assertEquals(2, p.suma6(E, F));
		
		assertEquals("Mauricio", p.getNombre());
		assertEquals("Morales",p.getApellido_paterno());
		assertEquals("Morales",p.getApellido_materno());
	}

}