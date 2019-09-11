package Test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

//import org.junit.jupiter.api.Test;
import Prueba.Sumas;
import Prueba.Person;

class PersonTest {
	Sumas p = new Sumas();
	
	@Test
	public void TestInteger() {
	  int a = 2;
	  int b = 1;
	  int resp = 3;
	  assertEquals(resp, p.suma(a, b));
	}
	
	@Test
	public void TestByte() {
		byte a = 87;
		byte b = 2;
		byte resp = 89;
		assertEquals(resp, p.suma(a, b));
		
	}

	@Test
	public void TestChar() {
		char a = 1;
		char b = 2;
		char resp = '';
		assertEquals(resp, p.suma(a, b));
		
	}
	
	@Test
	public void TestShort() {
		short a = 1;
		short b = 2;
		short resp = 3;
		assertEquals(resp, p.suma(a, b));
		
	}
	
	@Test
	public void TestLong() {
		long a = 1;
		long b = 2;
		long resp = 3;
		assertEquals(resp, p.suma(a, b));
		
	}
	
	@Test
	public void TestFloat() {
		float a = 4;
		float b = 3;
		float resp = 7;
		assertEquals(resp, p.suma(a, b),1);
		
	}
	
	@Test
	public void TestDouble() {
		double a = 1.0;
		double b = 2.0;
		double resp = 3.0;
		assertEquals(resp, p.suma(a, b),1);
		
	}
}
