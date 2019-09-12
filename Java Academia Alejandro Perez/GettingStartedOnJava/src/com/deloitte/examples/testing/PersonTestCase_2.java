package com.deloitte.examples.testing;

//Imports
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.deloitte.examples.classes.*;

public class PersonTestCase_2 {

	// Crear instancias - son atajos de acceso a programas de paqueterias importadas
	Tipo_variables var = new Tipo_variables();	//metodos de suma
	PersonCreateTestData p = new PersonCreateTestData();	//datos a revisar

	@Test
	public void TestBoolean() {
		for (int i = 0; i < p.a1.length; i++) {
			assertEquals(p.c1[i], var.suma(p.a1[i], p.b1[i]));
		}
	}

	@Test
	public void TestChar() {
		for (int i = 0; i < p.a2.length; i++) {
			assertEquals(p.c2[i], var.suma(p.a2[i], p.b2[i]));
		}
	}
	@Test
	public void TestByte() {
		for (int i = 0; i < p.a3.length; i++) {
			assertEquals(p.c3[i], var.suma(p.a3[i], p.b3[i]));
		}
	}
	@Test
	public void TestInt() {
		for (int i = 0; i < p.a4.length; i++) {
			assertEquals(p.c4[i], var.suma(p.a4[i], p.b4[i]));
		}
	}
	@Test
	public void TestShort() {
		for (int i = 0; i < p.a5.length; i++) {
			assertEquals(p.c5[i], var.suma(p.a5[i], p.b5[i]));
		}
	}
	@Test
	public void TestFloat() {
		for (int i = 0; i < p.a6.length; i++) {
			assertEquals(p.c6[i], var.suma(p.a6[i], p.b6[i]),3);
		}
	}
	@Test
	public void TestDouble() {
		for (int i = 0; i < p.a7.length; i++) {
			assertEquals(p.c7[i], var.suma(p.a7[i], p.b7[i]),2);
		}
	}
	@Test
	public void TestLong() {
		for (int i = 0; i < p.a8.length; i++) {
			assertEquals(p.c8[i], var.suma(p.a8[i], p.b8[i]));
		}
	}
	@Test
	public void TestString() {
		for (int i = 0; i < p.a9.length; i++) {
			assertEquals(p.c9[i], var.suma(p.a9[i], p.b9[i]));
		}
	}
}
