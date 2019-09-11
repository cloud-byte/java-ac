package com.deloitte.startinWithJava.personTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import com.deloitte.startingWithJava.clsae2.*;

import org.junit.jupiter.api.Test;

class SumaTest {

	@Test
	public void TestPerson() {
		
		
		
		
		Person sumaObject = new Person();
		short num1=23; 
		short num2=23;
		long num3=2300; 
		long num4=2300;
	
		assertEquals(false,sumaObject.suma(false, true));
		assertEquals(99,sumaObject.suma(0x31, 0x32));
		assertEquals('¤',sumaObject.suma('a', 'C'));
		assertEquals(46,sumaObject.suma(num1, num2));
		assertEquals(30,sumaObject.suma(10, 20));
		assertEquals(4600,sumaObject.suma(num3, num4));
		
		
		
	}
}
