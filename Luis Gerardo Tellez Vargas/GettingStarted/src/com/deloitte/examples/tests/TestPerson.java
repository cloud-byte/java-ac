package com.deloitte.examples.tests;

import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import com.deloitte.examples.classes.Person;

class TestPerson {

	Person dataTester=new Person();	
	

	//TEST PARA LOS ARREGLOS DE LA CLASE TestData
	@Test
	public void TestPersona() {
		Person p=new Person("Luis Gerardo", "Tellez", "Vargas");
		
		assertEquals("Luis Gerardo", p.getNombre());
		assertEquals("Tellez", p.getApellido_paterno());
		assertEquals("Vargas", p.getApellido_materno());
		
		short a = 127;
		short b = 3;
		short resShort = 130;
		
		int c= 2;
		int d= 1;
		int resInt=3;
		
		char e='c';
		char f='a';
		char resChar=196;
		
		long g=234524312;
		long h=452414433;
		long resLong=686938745;
		
		double i=2.34;
		double j=3.43;
		double resDouble=5.77;
		
		float k=2.65f;
		float l=-0.31f;
		float resFloat= 2.34f;
		
		byte m=100;
		byte n=22;
		byte resByte= 122;
		
		
		boolean o=true;
		boolean q= false;
		boolean resBoolean=false;
		
		
		
		/*CASOS EN LOS QUE LOS TIPOS DE CARACTER SON IGUALES, DECLARADOS ANTERIORMENTE PARA PODER HACER PRUEBAS CON NUMEROS
		DIFERENTES SIN CAMBIAR LAS PRUEBAS DE assertEquals SIGUIENTES.
		*/
		
		assertEquals(resShort,p.Suma(a,b));
		assertEquals(resInt,p.Suma(c,d));
		assertEquals(resChar,p.Suma(e,f));
		assertEquals(resLong,p.Suma(g,h ));
		assertEquals(resDouble,p.Suma(i, j),0);
		assertEquals(resFloat,p.Suma(k,l),0.05);
		assertEquals(resByte,p.Suma(m, n));
		assertEquals(resBoolean,p.Suma(o, q));
	
	
	}
	
	
	@Test
	public void TestBoolean() {
		
		for(int i=0; i<TestData.BooleanA.length; i++) {
				assertEquals(TestData.resBoolean[i],dataTester.Suma(TestData.BooleanA[i], TestData.BooleanB[i]));
		}
	}
	
	@Test
	public void TestInt() {
		for(int i=0; i<TestData.intA.length; i++) {
			assertEquals(TestData.resInt[i],dataTester.Suma(TestData.intA[i], TestData.intB[i]));
		}
	}	
	
	@Test
	public void TestDouble() {
		for(int i=0; i<TestData.doubleA.length; i++) {
			assertEquals(TestData.resDouble[i],dataTester.Suma(TestData.doubleA[i], TestData.doubleB[i]),0.5);
		}
	}
	
	@Test
	public void TestFloat() {
		for(int i=0; i<TestData.floatA.length; i++) {
			assertEquals(TestData.resFloat[i],dataTester.Suma(TestData.floatA[i], TestData.floatB[i]),0);
		}
	}
	
	@Test
	public void TestShort() {
		for(int i=0; i<TestData.shortA.length; i++) {
			assertEquals(TestData.resShort[i],dataTester.Suma(TestData.shortA[i], TestData.shortB[i]));
		}
	}
	
	@Test
	public void TestLong() {
		for(int i=0; i<TestData.longA.length; i++) {
			assertEquals(TestData.resLong[i],dataTester.Suma(TestData.longA[i], TestData.longB[i]));
		}
	}
	
	@Test
	public void TestChar() {
		for(int i=0; i<TestData.charA.length; i++) {
			assertEquals(TestData.resChar[i],dataTester.Suma(TestData.charA[i], TestData.charB[i]));
		}
	}
	
	@Test
	public void TestByte() {
		for(int i=0; i<TestData.byteA.length; i++) {
			assertEquals(TestData.resByte[i],dataTester.Suma(TestData.byteA[i], TestData.byteB[i]));
		}
	}
	
}
