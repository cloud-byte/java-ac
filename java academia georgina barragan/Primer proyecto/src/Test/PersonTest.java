package Test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

//import org.junit.jupiter.api.Test;
import Prueba.Sumas;
import Prueba.Sumarregl;
import Prueba.Person;
import Prueba.Arreglos;

class PersonTest {
	Sumas p = new Sumas();
	Sumarregl pa = new Sumarregl();
	
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
	
	@Test
	public void TestArregloBool() {
		for (int i = 0; i < Arreglos.a1.length; i++) {
			assertEquals(Arreglos.c1[i],pa.suma(Arreglos.a1[i],Arreglos.b1[i]));
		}
	}
	
	@Test
	public void TestArregloInt() {
		for (int i = 0; i < Arreglos.a2.length; i++) {
			assertEquals(Arreglos.c2[i],pa.suma(Arreglos.a2[i],Arreglos.b2[i]));
		}
	}
	
	@Test
	public void TestArregloByte() {
		for (int i = 0; i < Arreglos.a3.length; i++) {
			assertEquals(Arreglos.c3[i],pa.suma(Arreglos.a3[i],Arreglos.b3[i]));
		}
	}
	
	@Test
	public void TestArregloChar() {
		for (int i = 0; i < Arreglos.a4.length; i++) {
			assertEquals(Arreglos.c4[i],pa.suma(Arreglos.a4[i],Arreglos.b4[i]));
		}
	}
	
	@Test
	public void TestArregloShort() {
		for (int i = 0; i < Arreglos.a5.length; i++) {
			assertEquals(Arreglos.c5[i],pa.suma(Arreglos.a5[i],Arreglos.b5[i]));
		}
	}
	
	@Test
	public void TestArregloLong() {
		for (int i = 0; i < Arreglos.a6.length; i++) {
			assertEquals(Arreglos.c6[i],pa.suma(Arreglos.a6[i],Arreglos.b6[i]));
		}
	}
	
	@Test
	public void TestArregloFloat() {
		for (int i = 0; i < Arreglos.a7.length; i++) {
			assertEquals(Arreglos.c7[i],pa.suma(Arreglos.a7[i],Arreglos.b7[i]),1);
		}
	}
	
	@Test
	public void TestArregloDouble() {
		for (int i = 0; i < Arreglos.a8.length; i++) {
			assertEquals(Arreglos.c8[i],pa.suma(Arreglos.a8[i],Arreglos.b8[i]),1);
		}
	}
}
