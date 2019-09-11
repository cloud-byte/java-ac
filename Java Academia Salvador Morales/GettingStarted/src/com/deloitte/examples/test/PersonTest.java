package com.deloitte.examples.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.deloitte.examples.objects.Person;

import basics.getting.started.TestData;


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
		
		short short1 = 352;
		short short2 = 168;
		short rshort =520;
		long long1 = 925;
		long long2 = 344343;
		byte byte1 = 58;
		byte byte2 = 27;
		float float1 = 3.4028235e38f;
		float float2 = 3.4028235e38f;
		double double1 = 1.15;
		double double2 = 1.15;
		double rdouble = 2.30;
		char char1 = 64500;
		char char2 = 100;
		char rchar = 64600;
		int int1 = 2;
		int int2 = 8;
		int rint = 10;
		
		assertEquals(rint, p.sumaInt(int1, int2));
		assertEquals(rchar, p.sumaChar(char1, char2));
		assertEquals(rdouble, p.sumaDouble(double1, double2));
		assertEquals(rshort, p.sumaShort(short1, short2));
		assertNotEquals(10, p.sumaLong(long1, long2));
		assertNotEquals(10, p.sumaByte(byte1, byte2));
		assertNotEquals(10, p.sumaFloat(float1, float2));
		
	}
	
	@Test
	public void TestInt() {
		
		for (int i = 0; i < TestData.aInt.length; i++) {
			assertEquals(TestData.rInt[i], p.sumaInt(TestData.aInt[i], TestData.bInt[i]));
		}
	}
	
	@Test
	public void TestShort() {
		
		for (int i = 0; i < TestData.aShort.length; i++) {
			assertEquals(TestData.rShort[i], p.sumaShort(TestData.aShort[i], TestData.bShort[i]));
		}
	}
	
	@Test
	public void TestByte() {
		
		for (int i = 0; i < TestData.aByte.length; i++) {
			assertEquals(TestData.rByte[i], p.sumaByte(TestData.aByte[i], TestData.bByte[i]));
		}
	}
	
	@Test
	public void TestChar() {
		
		for (int i = 0; i < TestData.aChar.length; i++) {
			assertEquals(TestData.rChar[i], p.sumaChar(TestData.aChar[i], TestData.bChar[i]));
		}
	}
	
	@Test
	public void TestDouble() {
		
		for (int i = 0; i < TestData.aDouble.length; i++) {
			assertEquals(TestData.rDouble[i], p.sumaDouble(TestData.aDouble[i], TestData.bDouble[i]),0);
		}
	}
	
	@Test
	public void TestLong() {
		
		for (int i = 0; i < TestData.aLong.length; i++) {
			assertEquals(TestData.rLong[i], p.sumaLong(TestData.aLong[i], TestData.bLong[i]));
		}
	}
	
	@Test
	public void TestFloat() {
		
		for (int i = 0; i < TestData.aFloat.length; i++) {
			assertEquals(TestData.rFloat[i], p.sumaFloat(TestData.aFloat[i], TestData.bFloat[i]),1);
		}
	}


}
