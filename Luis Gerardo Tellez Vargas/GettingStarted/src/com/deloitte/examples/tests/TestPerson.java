package com.deloitte.examples.tests;

import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import com.deloitte.examples.classes.Person;

class TestPerson {

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
		
		float k=(float) 2.65;
		float l=(float )-0.31;
		float resFloat=(float) 2.34;
		
		byte m=100;
		byte n=22;
		byte resByte= 122;
		
		
		
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
		
		
		//CASOS EN LOS QUE LOS TIPOS DE CARACTER SON DIFERENTES, NO VA A PASAR EL TEST.
		/*
		assertEquals(resShort,p.Suma(a,d)); 
		assertEquals(resInt,p.Suma(a,c));
		assertEquals(resChar,p.Suma(e,g));
		assertEquals(resLong,p.Suma(g,f ));
		assertEquals(resDouble,p.Suma(i, l),0);
		assertEquals(resFloat,p.Suma(k,j),0.05);
		assertEquals(resByte,p.Suma(m, a));
		*/
		
	}
	
}
