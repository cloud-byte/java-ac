package com.deloitte.startinWithJava.personTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import com.deloitte.startingWithJava.clsae2.*;

import org.junit.jupiter.api.Test;

class PersonTest {
	@Test
	public void TestPerson() {
		Person p = new Person("Luis Fernando","Alonso","Velazquez");
		assertEquals("Luis Fernando",p.getNombre());
		assertEquals("Alonso",p.getApellidoP());
		assertEquals("Velazquez",p.getApellidoM());
		
	}

}
