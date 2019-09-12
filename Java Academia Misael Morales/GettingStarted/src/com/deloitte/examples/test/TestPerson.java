package com.deloitte.examples.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.deloitte.examples.objects.Person;

class TestPerson {
	
	Person p = new Person();
	
	@Test
	public void TestBoolean() {
		for (int i = 0; i < TestData.aBool.length; i++) {
			assertEquals(TestData.rBool[i], p.sumaBool(TestData.aBool[i], TestData.bBool[i]));
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
	public void TestShort() {
		for (int i = 0; i < TestData.aShort.length; i++) {
			assertEquals(TestData.rShort[i], p.sumaShort(TestData.aShort[i], TestData.bShort[i]));
		}
	}
	
	@Test
	public void TestInt() {
		for (int i = 0; i < TestData.aInt.length; i++) {
			assertEquals(TestData.rInt[i], p.sumaInt(TestData.aInt[i], TestData.bInt[i]));
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
			assertEquals(TestData.rFloat[i], p.sumaFloat(TestData.aFloat[i], TestData.bFloat[i]), 0);
		}
	}
	
	@Test
	public void TestDouble() {
		for (int i = 0; i < TestData.aDouble.length; i++) {
			assertEquals(TestData.rDouble[i], p.sumaDouble(TestData.aDouble[i], TestData.bDouble[i]), 0);
		}
	}
	
	@Test
	public void TestSuma() {
		byte by1=1,by2=2;
		char c1='a',c2=2;
		short sh1=1,sh2=2;
		int i1=1,i2=2;
		long l1=1,l2=2;
		float f1=1.0f, f2=2.0f;
		double d1=1,d2=2;
		
		assertEquals(3,p.sumaByte(by1, by2));
		assertNotEquals(5,p.sumaByte(by1, by2));
		
		assertEquals('c',p.sumaChar(c1,c2));
		assertNotEquals('d',p.sumaChar(c1,c2));
		
		assertEquals(3,p.sumaShort(sh1,sh2));
		assertNotEquals(5,p.sumaShort(sh1,sh2));
		
		assertEquals(3,p.sumaInt(i1,i2));
		assertNotEquals(5,p.sumaInt(i1,i2));
		
		assertEquals(3,p.sumaLong(l1,l2));
		assertNotEquals(5,p.sumaLong(l1,l2));
		
		assertEquals(3.0,p.sumaFloat(f1,f2),0);
		assertNotEquals(5,p.sumaFloat(f1,f2));
		
		assertEquals(3.0,p.sumaDouble(d1,d2),0);
		assertNotEquals(5,p.sumaDouble(d1,d2));
	}
	
}