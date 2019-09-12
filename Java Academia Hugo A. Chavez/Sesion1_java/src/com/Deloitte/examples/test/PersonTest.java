package com.Deloitte.examples.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.Deloitte.Ejemplos.Academia.Person;
import com.Deloitte.examples.test.TestData;

class PersonTest {

	@Test
	public void TestPerson() {

		Person p = new Person("Hugo", "Chavez", "Garcia");

		assertEquals("Hugo", p.getNombre());
		assertEquals("Chavez", p.getApellidoPaterno());
		assertEquals("Garcia", p.getApellidoMaterno());
	}
	
	@Test	
	public void TestByte() {
		Person p = new Person();
		assertEquals((byte)5, p.suma(3,2));
	}
	
	@Test	
	public void TestChar() {
		Person p = new Person();
		assertEquals((char)'b', p.suma('a', 1));	//char
	}
	
	@Test	
	public void TestShort() {
		Person p = new Person();
		assertEquals((short)6, p.suma(1, 5));			//short
	}
	
	@Test	
	public void TestInt() {
		Person p = new Person();
		assertEquals((int)15, p.suma(20, -5));		//int
	}
	
	@Test	
	public void TestLong() {
		Person p = new Person();
		assertEquals((long)21, p.suma(10, 11));		//long
	}
	
	@Test	
	public void TestFloat() {
		Person p = new Person();
		assertEquals(7.7f, p.suma(3.2f , 4.5f),1);		//float
	}
	
	@Test	
	public void TestDouble() {
		Person p = new Person();
		assertEquals(25.6, p.suma(20.4, 5.2),1);	//double
	}
	
	TestData tes = new TestData();
	
	@Test
	public void TestArrayBoolean() {
		for (int i=0; i<TestData.a.length; i++) {
			assertEquals(TestData.c[i],tes.suma(TestData.a[i],TestData.b[i]));
		}
	}
	
	@Test
	public void TestArrayByte() {
		for (int i=0; i<TestData.d.length; i++) {
			assertEquals(TestData.f[i],tes.suma(TestData.d[i],TestData.e[i]));
		}
	}
	
	@Test
	public void TestArrayChar() {
		for (int i=0; i<TestData.g.length; i++) {
			assertEquals(TestData.i[i],tes.suma(TestData.g[i],TestData.h[i]));
		}
	}
	
	@Test
	public void TestArrayShort() {
		for (int i=0; i<TestData.j.length; i++) {
			assertEquals(TestData.l[i],tes.suma(TestData.j[i],TestData.k[i]));
		}
	}
	
	@Test
	public void TestArrayInt() {
		for (int i=0; i<TestData.m.length; i++) {
			assertEquals(TestData.o[i],tes.suma(TestData.m[i],TestData.n[i]));
		}
	}
	
	@Test
	public void TestArrayLong() {
		for (int i=0; i<TestData.p.length; i++) {
			assertEquals(TestData.r[i],tes.suma(TestData.p[i],TestData.q[i]));
		}
	}
	
	@Test
	public void TestArrayFloat() {
		for (int i=0; i<TestData.s.length; i++) {
			assertEquals(TestData.u[i],tes.suma(TestData.s[i], TestData.t[i]),1);
		}
	}
	
	@Test
	public void TestArrayDouble() {
		for (int i=0; i<TestData.v.length; i++) {
			assertEquals(TestData.x[i],tes.suma(TestData.v[i],TestData.w[i]),1);
		}
	}
}
