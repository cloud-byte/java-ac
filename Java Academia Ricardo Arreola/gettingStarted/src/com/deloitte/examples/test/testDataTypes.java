package com.deloitte.examples.test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import com.deloitte.examples.objects.*;

public class testDataTypes {

	Person persona = new Person();
	

	//int 
@Test
public void testInt () {
	for (int i = 0; i < testData.bool_res.length; i++) {
		assertEquals(testData.bool_res[i], persona.suma(testData.bool_a[i], testData.bool_b[i]));
	}
}
		//boolean 
@Test
public void testboolean () {
	for (int i = 0; i < testData.bool_res.length; i++) {
		assertEquals(testData.bool_res[i], persona.suma(testData.bool_a[i], testData.bool_b[i]));
	}
}
		//double 
@Test
public void testdouble () {
	for (int i = 0; i < testData.double_res.length; i++) {
		assertEquals(testData.double_res[i], persona.suma(testData.double_a[i], testData.double_b[i]),0);
	}
}
		//float 
@Test
public void testfloat () {
	for (int i = 0; i < testData.float_res.length; i++) {
		assertEquals(testData.float_res[i], persona.suma(testData.float_a[i], testData.float_b[i]), 1);
	}
}
		//char 
@Test
public void testchar () {
	for (int i = 0; i < testData.char_res.length; i++) {
		assertEquals(testData.char_res[i], persona.suma(testData.char_a[i], testData.char_b[i]));
	}
}
		//long 
@Test
public void testlong () {
	for (int i = 0; i < testData.long_res.length; i++) {
		assertEquals(testData.long_res[i], persona.suma(testData.long_a[i], testData.long_b[i]), 1);
	}
}
		//short 
@Test
public void testshort () {
	for (int i = 0; i < testData.short_res.length; i++) {
		assertEquals(testData.short_res[i], persona.suma(testData.short_a[i], testData.short_b[i]));
	}
}

	
	
}
