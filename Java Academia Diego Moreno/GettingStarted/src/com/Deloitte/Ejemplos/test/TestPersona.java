package com.Deloitte.Ejemplos.test;
import com.Deloitte.Pruebas.Prueba.*;

import static org.junit.jupiter.api.Assertions.*;

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
	
	@Test 
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
	}
}
