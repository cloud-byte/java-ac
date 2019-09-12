package com.deloitte.examples.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import com.deloitte.examples.classes.Person;
import com.deloitte.examples.classes.clase2;
import com.deloitte.examples.classes.testData;

class personaTest {
	
	testData tes = new testData();
	
	
//	@Test
//	public void personaTest() {
//	
//		Person p = new Person();
//		
//		assertEquals("Albano", p.getNombre());
//		assertEquals("Pena", p.getApellidoPat());
//		assertEquals("Torres", p.getApellidoMat());
//		
//		
//		assertEquals(9, p.suma(byteA, byteB));
//		assertEquals(29, p.suma(10, 19));
//		assertEquals(20.9, p.suma(10.1, 10.8));
//
//	}
	
	@Test
	public void testChar() {
		Person p = new Person();
		assertEquals(300, p.suma(100, 200));
	}
	
	@Test
	public void testShort() {
		Person p = new Person();
		assertEquals(64, p.suma(32, 32));
	}
	
	@Test
	public void testLong() {
		Person p = new Person();
		assertEquals(3000, p.suma(2000, 1000));
	}
	
	@Test
	public void testFloat() {
		Person p = new Person();
		assertEquals(50, p.suma(20, 30));
		
	}
	
	
	
	@Test
	public void TestBoolean() {
			
		for (int i = 0; i < testData.a.length; i++) {
			assertEquals(testData.res[i],tes.suma(testData.a[i], testData.b[i]));
		}
	}
	
	@Test
	public void TestInt() {
		for (int i = 0; i < testData.a1.length; i++) {
			assertEquals(testData.res1[i],tes.suma(testData.a1[i], testData.b1[i]));
		}
	}
	
	@Test
	public void TestByte() {
		for (int i = 0; i < testData.a2.length; i++) {
			assertEquals(testData.res2[i],tes.suma(testData.a2[i], testData.b2[i]));
		}
	}
	
	@Test
	public void TestChar() {
		for (int i = 0; i < testData.a3.length; i++) {
			assertEquals(testData.res3[i],tes.suma(testData.a3[i], testData.b3[i]));
		}
	}
	
	@Test
	public void TestShort() {
		for (int i = 0; i < testData.a4.length; i++) {
			assertEquals(testData.res4[i],tes.suma(testData.a4[i], testData.b4[i]));
		}
	}
	
	@Test
	public void TestLong() {
		for (int i = 0; i < testData.a5.length; i++) {
			assertEquals(testData.res5[i],tes.suma(testData.a5[i], testData.b5[i]));
		}
	}
	
	@Test
	public void TestFloat() {
		for (int i = 0; i < testData.a6.length; i++) {
			assertEquals(testData.res6[i],tes.suma(testData.a6[i], testData.b6[i]),1);
		}
	}
	
	@Test
	public void TestDouble() {
		for (int i = 0; i < testData.a7.length; i++) {
			assertEquals(testData.res7[i],tes.suma(testData.a7[i], testData.b7[i]),1);
		}
	}
	

}
