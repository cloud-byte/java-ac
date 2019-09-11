package com.deloitte.examples.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.deloitte.examples.objects.*;

class DataTest {

	Person p = new Person();
	TestData d = new TestData();
	
	@Test
	public void testBoolean() {
		for (int i = 0; i < TestData.a.length; i++) {
			assertEquals(TestData.r[i],p.suma(TestData.a[i], TestData.b[i]));
		}
	}
	
	@Test
	public void testInt() {
		for (int i = 0; i < TestData.c.length; i++) {
			assertEquals(TestData.r2[i],p.suma(TestData.c[i], TestData.d[i]));
		}
	}
	
	@Test
	public void testChar() {
		for (int i = 0; i < TestData.c.length; i++) {
			assertEquals(TestData.r3[i],p.suma(TestData.e[i], TestData.f[i]));
		}
	}
	
	@Test
	public void testString() {
		for (int i = 0; i < TestData.c.length; i++) {
			assertEquals(TestData.r4[i],p.suma(TestData.g[i], TestData.h[i]));
		}
	}
	
	@Test
	public void testShort() {
		for (int i = 0; i < TestData.c.length; i++) {
			assertEquals(TestData.r5[i],p.suma(TestData.i[i], TestData.j[i]));
		}
	}
	
	@Test
	public void testLong() {
		for (int i = 0; i < TestData.c.length; i++) {
			assertEquals(TestData.r6[i],p.suma(TestData.k[i], TestData.l[i]));
		}
	}
	
	@Test
	public void testByte() {
		for (int i = 0; i < TestData.c.length; i++) {
			assertEquals(TestData.r7[i],p.suma(TestData.m[i], TestData.n[i]));
		}
	}
	
	@Test
	public void testDouble() {
		for (int i = 0; i < TestData.c.length; i++) {
			assertEquals(TestData.r8[i],p.suma(TestData.o[i], TestData.p[i]));
		}
	}
	
	@Test
	public void testFloat() {
		for (int i = 0; i < TestData.c.length; i++) {
			assertEquals(TestData.r9[i],p.suma(TestData.q[i], TestData.r0[i]));
		}
	}

}
