package com.deloitte.examples.test;


import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import com.deloitte.examples.objects.Person;
import com.deloitte.examples.objects.Suma;

class PersonTest {
	@Test
	public void TestPerson() {
		Person p = new Person("Marina Yamile", "Santos", "Antunez");
				
		assertEquals("Marina Yamile", p.getNombre());
		assertEquals("Santos", p.getApellido_paterno());
		assertEquals("Antunez", p.getApellido_materno());
		
		Suma suma1 = new Suma (10,50);
		
		
			
	}

	}
