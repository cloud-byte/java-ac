package com.deloitte.examples.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.deloitte.examples.objects.Person;

class TestPerson {
	
	Person p = new Person("Misael", "Morales", "Martínez");
	
	@Test
	public void TestPerson() {
		assertEquals("Misael", p.getNombre());
		assertEquals("Morales", p.getApellido_paterno());
		assertEquals("Martínez", p.getApellido_materno());
	}
	
	@Test
	public void TestNombre() {
		assertEquals("Misael", p.getNombre());
	}
	
	@Test
	public void TestNombre2() {
		assertNotEquals("Anubis", p.getNombre());
	}
	
	@Test
	public void TestSuma() {
		assertEquals(3,p.sumaByte((byte) 1, (byte) 2));
		assertNotEquals(5,p.sumaByte((byte) 1, (byte) 2));
		assertEquals('c',p.sumaChar((char) 97, (char) 2));
		assertNotEquals('d',p.sumaChar((char) 97, (char) 2));
		assertEquals(3,p.sumaShort((short) 1, (short) 2));
		assertNotEquals(5,p.sumaShort((short) 1, (short) 2));
		assertEquals(3,p.sumaInt(1,2));
		assertNotEquals(5,p.sumaInt(1,2));
		assertEquals(3,p.sumaLong((long) 1, (long) 2));
		assertNotEquals(5,p.sumaLong((long) 1, (long) 2));
		assertEquals(3.0,p.sumaFloat((float) 1.0, (float) 2.0),0);
		assertNotEquals(5,p.sumaFloat((float) 1, (float) 2));
		assertEquals(3.0,p.sumaDouble((double) 1.0, (double) 2.0),0);
		assertNotEquals(5,p.sumaDouble((double) 1, (double) 2));
	}
	
}