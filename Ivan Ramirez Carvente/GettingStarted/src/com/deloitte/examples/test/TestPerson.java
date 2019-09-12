package com.deloitte.examples.test;

import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.deloitte.examples.classes.Person;
import com.deloitte.examples.classes.Sumas;
import com.deloitte.examples.classes.TestData;

class TestPerson {
	
	Sumas suma = new Sumas();
	
	@Test
	public void testPerson(){
	Person p = new Person ("Ivan", "Ramirez", "Carvente");	
//	assertEquals("Ivan", p.getNombre());
//	assertEquals("Ramirez", p.getApellido_paterno());
//	assertEquals("Carvente", p.getApellido_materno());	
	}
	
	@Test
	public void Test_int(){
		int a = 5;
		int b = 7;
		int r = 12;
		assertEquals(r, suma.suma(a, b));
	}
	
	@Test
	public void Test_byte(){
		byte a = 5;
		byte b = 7;
		byte r = 12;
		assertEquals(r, suma.suma(a, b));
	}
	
	@Test
	public void Test_char() {
		char a = 3;
		char b = 5;
		char r = 8;
		assertEquals(r, suma.suma(a, b));
	}
	
	@Test
	public void Test_short() {
		short a = 1;
		short b = 8;
		short r = 9;
		assertEquals(r, suma.suma(a, b));
	}
	
	@Test
	public void Test_long() {
		long a = 3;
		long b = 3;
		long r = 6;
	assertEquals(r, suma.suma(a, b));
	}
	
	@Test 
	public void Test_float() {
		float a = 2.5f;
		float b = 7.5f;
		float r = 10f;
		assertEquals(r, suma.suma(a, b),1);
	}
	
	@Test
	public void Test_double() {
		double a = 8;
		double b = 6;
		double r = 14;
		assertEquals(r, suma.suma(a, b),1);
	}
	
	@Test
	public void Test_boolean() {
		boolean a = true;
		boolean b = false;
		boolean r = false;
		assertEquals(r, suma.suma(a,b));
	}
	@Test
	public void TestIntLoop() {			
	for (int i = 0; i < TestData.aInt.length; i++) {
					assertEquals(TestData.rInt[i], suma.suma(TestData.aInt[i], TestData.bInt[i]));
				}
		} 	
	
	@Test
	public void TestByteLoop() {			
	for (int i = 0; i < TestData.aByte.length; i++) {
					assertEquals(TestData.rByte[i], suma.suma(TestData.aByte[i], TestData.bByte[i]));
				}
		} 
	
	@Test
	public void TestCharLoop() {			
	for (int i = 0; i < TestData.aChar.length; i++) {
					assertEquals(TestData.rChar[i], suma.suma(TestData.aChar[i], TestData.bChar[i]));
				}
		} 	

	@Test
	public void TestShortLoop() {			
	for (int i = 0; i < TestData.aShort.length; i++) {
					assertEquals(TestData.rShort[i], suma.suma(TestData.aShort[i], TestData.bShort[i]));
				}
		}
	
	@Test
	public void TestLongLoop() {			
	for (int i = 0; i < TestData.aLong.length; i++) {
					assertEquals(TestData.rLong[i], suma.suma(TestData.aLong[i], TestData.bLong[i]));
				}
		} 

	@Test
	public void TestFloatLoop() {			
	for (int i = 0; i < TestData.aFloat.length; i++) {
					assertEquals(TestData.rFloat[i], suma.suma(TestData.aFloat[i], TestData.bFloat[i]),1);
				}
		} 
	
	@Test
	public void TestBoolLoop() {			
	for (int i = 0; i < TestData.aBool.length; i++) {
					assertEquals(TestData.rBool[i], suma.suma(TestData.aBool[i], TestData.bBool[i]));
				}
		} 
}