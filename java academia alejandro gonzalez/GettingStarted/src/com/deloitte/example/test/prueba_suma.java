package com.deloitte.example.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.deloitte.example.objects.suma;

class prueba_suma {
	
	
	@Test
	void testSumaint() {
		suma aaa= new suma(20,30);
		assertEquals(50,aaa.getRint());
		
	}

	@Test
	void testSumadouble() {
		suma bbb= new suma(20.5,30.7);
		assertEquals(51.2,bbb.getRdouble());	}

	@Test
	void testSumachar() {
		char ccc = suma.suma2('B','B');
		assertEquals('a',suma.getRchar());
	}

	@Test
	void testSumashort() {
		suma ddd= new suma(15000000.45,15000.56);
		assertEquals(30000,ddd.getRshort());	}

	@Test
	void testSumalong() {
		suma eee= new suma(111111,234);
		assertEquals(23455,eee.getRlong());	}

	@Test
	void testSumafloat() {
		suma fff= new suma(1.1,2.3);
		assertEquals(3.4,fff.getRfloat());	}

}
