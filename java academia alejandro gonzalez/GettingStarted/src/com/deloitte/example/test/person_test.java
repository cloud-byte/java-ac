package com.deloitte.example.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.deloitte.example.objects.TestData;
import com.deloitte.example.objects.person;

class person_test {
	@Test
	public void testPerson() {
	person p= new person("alejandro", "gonzalez", "castorena");
	
	assertEquals("alejandro", p.getNombre());
	assertEquals("gonzalez",p.getApellido_paterno());
	assertEquals("castorena",p.getApellido_materno());
	
}

	
	
	
	
}

