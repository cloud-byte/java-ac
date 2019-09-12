package com.Deloitte.Ejemplos.test;
import com.Deloitte.Pruebas.Prueba.*;

import static org.junit.jupiter.api.Assertions.*;
import com.Deloitte.Ejemplos.test.testdata;
import org.junit.jupiter.api.Test;

class TestPersona 

{
	Person p= new Person();
	@Test
	public void TestPerson() 
	{
		p = new Person("Diego","Moreno","Perez",65.300,1.78);
		
		assertEquals("Diego",p.getNombre());
		assertEquals("Moreno", p.getApellido_paterno());
		assertEquals("Perez",p.getApellido_materno());
		
		
		
	}
	
	/*@Test 
	public void testbyte() 
	{
		byte a=3;
		byte b=4;
		byte r=7;
		assertEquals(r,p.suma(a, b));//Byte	
	}
	
	@Test 
	public void testDouble() 
	{
		double a=3.555;
		double b=4.3555;
		double r=7.9105;
		assertEquals(r,p.suma(a, b),4);//Double
	}
	
	@Test 
	public void testFloat() 
	{
		float a=3.578f;
		float b=4.398f;
		float r=7.976f;
		assertEquals(r,p.suma(a, b));//float
	}
	
	@Test 
	public void testInteger() 
	{
		int a=15;
		int b=45;
		int r=60;
		assertEquals(r,p.suma(a, b));//Integer
	}
	
	@Test 
	public void testLong() 
	{
		long a=15600000;
		long b=1000000;
		long r=16600000;
		assertEquals(r,p.suma(a, b));// Long
	}*/
	
	//Pruebas Con Arreglos
	@Test
	public void testBoolean() 
	{
		for (int i = 0; i < testdata.a.length; i++) 
		{
			assertEquals(testdata.c[i],p.suma(testdata.a[i], testdata.b[i]));
			
		}
	}
	@Test
	public void testInt() 
	{
		for (int i = 0; i < testdata.d.length; i++) 
		{
			assertEquals(testdata.f[i],p.suma(testdata.d[i], testdata.e[i]));
			
		}
	}
	@Test
	public void testdouble() 
	{
		for (int i = 0; i < testdata.g.length; i++) 
		{
			assertEquals(testdata.i[i],p.suma(testdata.g[i], testdata.h[i]),1);
			
		}
	}
	@Test
	public void testFloa() 
	{
		for (int i = 0; i < testdata.j.length; i++) 
		{
			assertEquals(testdata.l[i],p.suma(testdata.j[i], testdata.k[i]));
			
		}
	}
	@Test
	public void testChar() 
	{
		for (int i = 0; i < testdata.m.length; i++) 
		{
			assertEquals(testdata.o[i],p.suma(testdata.m[i], testdata.n[i]));
			
		}
	}
	@Test
	public void testByte() 
	{
		for (int i = 0; i < testdata.p.length; i++) 
		{
			assertEquals(testdata.r[i],p.suma(testdata.p[i], testdata.q[i]));
			
		}
	}
	@Test
	public void testShort() 
	{
		for (int i = 0; i < testdata.s.length; i++) 
		{
			assertEquals(testdata.u[i],p.suma(testdata.s[i], testdata.t[i]));
			
		}
	}
}
