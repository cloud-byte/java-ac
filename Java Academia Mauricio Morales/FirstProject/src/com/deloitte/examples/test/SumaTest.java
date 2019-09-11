package com.deloitte.examples.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.deloitte.examples.objects.Person;

class SumaTest {

	@Test
	public void TestSuma() {
		Person p = new Person("Mauricio", "Morales", "Morales");
		
		assertEquals("Mauricio", p.getNombre());
		assertEquals("Morales",p.getApellido_paterno());
		assertEquals("Morales",p.getApellido_materno());
	}

}
