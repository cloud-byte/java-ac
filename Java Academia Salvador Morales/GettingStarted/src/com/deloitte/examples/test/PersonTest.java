package com.deloitte.examples.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.deloitte.examples.objects.Person;


class PersonTest {
	
	Person p = new Person("Albano", "Peña", "Torres");
	@Test
	public void TestPerson() {
	
	assertEquals("Albano", p.getNombre());
	assertEquals("Peña", p.getApellido_paterno());
	assertEquals("Torres", p.getApellido_materno());
	
	}
	@Test
	public void TestSuma() {
		assertEquals(10, p.sumaInt(2, 8));
		assertEquals(64600, p.sumaChar((char)64500, (char)100));
		assertEquals(2.30, p.sumaDouble((double)1.15, (double)1.15));
		assertEquals(520, p.sumaShort((short)352, (short)168));
		assertNotEquals(10, p.sumaLong((long)925, (long)344343));
		assertNotEquals(10, p.sumaByte((byte)58, (byte)27));
		assertNotEquals(10, p.sumaFloat((float)1.17549435e-38, (float)1.17549435e-38));
		
	}

}
