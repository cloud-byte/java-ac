package com.deloitte.examples.testing; //Crear paquete individual para hacer pruebas

import static org.junit.jupiter.api.Assertions.*; //importar bibliotecas de pruebas, assertEquals te permite 
import static org.junit.Assert.assertEquals; //assertEquals te permite comparar igualdad de Strings
import org.junit.jupiter.api.Test;
import com.deloitte.examples.classes.*;

class PersonTestCase_1 {

	@Test
	public void TestPerson() {
		Person p = new Person("Alejandro", "Perez", "Vaca"); // Creamos variable que contiene 3 strings.

		assertEquals("Alejandro", p.getNombre()); // Probamos que segun el metodo creado en
													// com.deloitte.examples.testing.Person
		assertEquals("Perez", p.getApellido_paterno()); // el string 1 corresponda a nombre, el segundo a apellido
														// paterno y el tercero a materno.
		assertEquals("Vaca", p.getApellido_materno());
	}
	@Test
	public void TestByte() {
		Tipo_variables var = new Tipo_variables ();
		byte a = 23;
		byte b = 4;
		byte r = 27;
		assertEquals(r, var.suma(a, b));
		
	}
	@Test
	public void TestChar() {
		Tipo_variables var = new Tipo_variables ();
		char a = 'A';
		char b = 'P';
		char r = 145;
		assertEquals(r, var.suma(a, b));		
	}
	@SuppressWarnings("deprecation")
	@Test
	public void TestDouble() {
		Tipo_variables var = new Tipo_variables ();
		double a = -5757.867;
		double b = -1000.657;
		double r = -6758.524;
		assertEquals(r, var.suma(a, b),3);	 // valor delta es el numero de decimales
	}										 // que comprueba para determinar que son iguales.
	@Test
	public void TestShort() {
		Tipo_variables var = new Tipo_variables ();
		short a = 6465;
		short b = -3434;
		short r = 3031;
		assertEquals(r, var.suma(a, b));
	}
	@Test
	public void TestLong() {
		Tipo_variables var = new Tipo_variables ();
		long a = 2464653;
		long b = 8787987;
		long r = 11252640;
		assertEquals(r, var.suma(a, b));
	}
	@Test
	public void TestInt() {
		Tipo_variables var = new Tipo_variables ();
		int a = 94456032;
		int b = 504654604;
		int r = 599110636;
		assertEquals(r, var.suma(a, b));
	}
	@Test
	public void TestFloat() {
		Tipo_variables var = new Tipo_variables ();
		float a = 3.73e7f;
		float b = 1.65e4f;
		float r = 37316500;
		assertEquals(r, var.suma(a, b),5);
	}
	
}
