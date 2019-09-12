package mxdeloitte.com.examples.test;

import static org.junit.Assert.assertEquals;

import javax.xml.crypto.Data;

import org.junit.jupiter.api.Test;
import mxdeloitte.com.examples.clases.Persona;	
import mxdeloitte.com.examples.clases.Sumas;
import mxdeloitte.com.examples.clases.TestData;
class PersonTest {

	Sumas suma = new Sumas();
	@Test
	public void TestPerson() {
		Persona p = new Persona ("Albano", "Pena", "Torres");
		
		assertEquals("Albano", p.getNombre());
		assertEquals("Pena", p.getApellido_paterno());
		assertEquals("Torres", p.getApellido_materno());
		
	}
	@Test
	public void TestInt() {
		int a = 2;
		int b = 3;
		int r = 5;
		assertEquals(r, suma.suma(a, b));
	}
	@Test
	public void TestByte() {
		byte a = 2;
		byte b = 3;
		byte r = 5;
		assertEquals(r, suma.suma(a, b));
	}
	@Test
	public void TestChar() {
		char a = 2;
		char b = 3;
		char r = 5;
		assertEquals(r, suma.suma(a, b));
	}
	@Test
	public void TestShort() {
		short a = 2;
		short b = 3;
		short r = 5;
		assertEquals(r, suma.suma(a, b));
	}
	
	@Test
	public void TestLong() {
		long a = 2;
		long b = 3;
		long r = 5;
		assertEquals(r, suma.suma(a, b));
	}
	
	@Test
	public void TestFloat() {
		float a = 2;
		float b = 3;
		float r = 5;
		assertEquals(r, suma.suma(a, b),1);
	}
	
	@Test
	public void TestDouble() {
		double a = 1;
		double b = 3;
		double r = 4;
		assertEquals(r, suma.suma(a, b),1);
	}
	@Test
	public void TestBoolean() {
		boolean a = true;
		boolean b = true;
		boolean r = true;
		assertEquals(r, suma.suma(a, b));
	}
	
	@Test
	public void TestIntLoop() {
		
		for (int i = 0; i < TestData.aInt.length; i++) {
			assertEquals(TestData.rInt[i], suma.suma(TestData.aInt[i], TestData.bInt[i]));
		}
		
	}
	
	@Test
	public void TestByteLoop() {
		
		for (int i = 0; i < TestData.aByte.length; i++) {
			assertEquals(TestData.rByte[i], suma.suma(TestData.aByte[i], TestData.bByte[i]));
		}
		
	}
	
	@Test
	public void TestCharLoop() {
		
		for (int i = 0; i < TestData.aChar.length; i++) {
			assertEquals(TestData.rChar[i], suma.suma(TestData.aChar[i], TestData.bChar[i]));
		}
		
	}
	
	@Test
	public void TestShortLoop() {
		
		for (int i = 0; i < TestData.aShort.length; i++) {
			assertEquals(TestData.rShort[i], suma.suma(TestData.aShort[i], TestData.bShort[i]));
		}
		
	}
	
	@Test
	public void TestLongLoop() {
		
		for (int i = 0; i < TestData.aLong.length; i++) {
			assertEquals(TestData.rLong[i], suma.suma(TestData.aLong[i], TestData.bLong[i]));
		}
		
	}
	
	@Test
	public void TestFloatLoop() {
		
		for (int i = 0; i < TestData.aFloat.length; i++) {
			assertEquals(TestData.rFloat[i], suma.suma(TestData.aFloat[i], TestData.bFloat[i]),1);
		}
		
	}
	
	@Test
	public void TestDoubleLoop() {
		
		for (int i = 0; i < TestData.aDouble.length; i++) {
			assertEquals(TestData.rDouble[i], suma.suma(TestData.aDouble[i], TestData.bDouble[i]),1);
		}
		
	}
	
	@Test
	public void TestBooleanLoop() {
		
		for (int i = 0; i < TestData.aBool.length; i++) {
			assertEquals(TestData.rBool[i], suma.suma(TestData.aBool[i], TestData.bBool[i]));
		}
		
	}
	

}
