package com.deloitte.examples.example01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayDataTypeTest {
	
	ArrayDataType a = new ArrayDataType();

	@Test
	void TestInt() {
		for (int i = 0 ; i < a.arrayInt1.length; i++) {
			assertEquals(a.arrayIntRes[i],Person.suma(a.arrayInt1[i], a.arrayInt2[i]));
		}
	}
	
	@Test
	void TestLong() {
		for (int i = 0 ; i < a.arrayLonRes.length; i++) {
			assertEquals(a.arrayLonRes[i],Person.suma(a.arrayLon1[i], a.arrayLon2[i]));
		}
	}
	
	@Test
	void TestShort() {
		for (int i = 0 ; i < a.arrayShrRes.length; i++) {
			assertEquals(a.arrayShrRes[i],Person.suma(a.arrayShr1[i], a.arrayShr2[i]));
		}
	}
	
	@Test
	void TestDouble() {
		for (int i = 0 ; i < a.arrayDobRes.length; i++) {
			assertEquals(a.arrayDobRes[i],Person.suma(a.arrayDob1[i], a.arrayDob2[i]));
		}
	}
	
	@Test
	void TestFloat() {
		for (int i = 0 ; i < a.arrayFloRes.length; i++) {
			assertEquals(a.arrayFloRes[i],Person.suma(a.arrayFlo1[i], a.arrayFlo2[i]));
		}
	}
	
	@Test
	void TestByte() {
		for (int i = 0 ; i < a.arrayBytRes.length; i++) {
			assertEquals(a.arrayBytRes[i],Person.suma(a.arrayByt1[i], a.arrayByt2[i]));
		}
	}
	
	@Test
	void TestChar() {
		for (int i = 0 ; i < a.arrayChaRes.length; i++) {
			assertEquals(a.arrayChaRes[i],Person.suma(a.arrayCha1[i], a.arrayCha2[i]));
		}
	}
	
	@Test
	void TestBoolean() {
		for (int i = 0 ; i < a.arrayBolRes.length; i++) {
			assertEquals(a.arrayBolRes[i],Person.suma(a.arrayBol1[i], a.arrayBol2[i]));
		}
	}

}
