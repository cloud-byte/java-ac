package com.deloitte.startinWithJava.personTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import com.deloitte.startingWithJava.clsae2.*;

import org.junit.jupiter.api.Test;

class SumaTest {
	Person sumaObject = new Person();
	int i;
//	public void TestPerson() {
//		
//		short num1=23; 
//		short num2=23;
//		long num3=2300; 
//		long num4=2300;
////		assertEquals(true,sumaObject.suma(true, true));
////		assertEquals(99,sumaObject.suma(0x31, 0x32));
////		assertEquals('¤',sumaObject.suma('a', 'C'));
////		assertEquals(46,sumaObject.suma(num1, num2));
////		assertEquals(30,sumaObject.suma(10, 20));
////		assertEquals(4600,sumaObject.suma(num3, num4));
//			
//	}
	@Test
	public void booleanSuma() {
		for (i = 0; i < DataPrimitives.arrayBooleanA.length; i++) {
			assertEquals(
					DataPrimitives.arrayBooleanC[i],
					sumaObject.suma(
							DataPrimitives.arrayBooleanA[i],
							DataPrimitives.arrayBooleanB[i]
									)
					);
		}
	}
	@Test
	public void charSuma() {
		for (i = 0; i < DataPrimitives.arrayCharA.length; i++) {
			assertEquals(
					DataPrimitives.arrayCharC[i],
					sumaObject.suma(
							DataPrimitives.arrayCharA[i],
							DataPrimitives.arrayCharB[i]
									)
					);
		}
	}
	@Test
	public void byteSuma() {
		for (i = 0; i < DataPrimitives.arrayByteA.length; i++) {
			assertEquals(
					DataPrimitives.arrayByteC[i],
					sumaObject.suma(
							DataPrimitives.arrayByteA[i],
							DataPrimitives.arrayByteB[i]
									)
					);
		}
	}
	@Test
	public void shortSuma() {
		for (i = 0; i < DataPrimitives.arrayShortA.length; i++) {
			assertEquals(
					DataPrimitives.arrayShortC[i],
					sumaObject.suma(
							DataPrimitives.arrayShortA[i],
							DataPrimitives.arrayShortB[i]
									)
					);
		}
	}
	@Test
	public void intSuma() {
		for (i = 0; i < DataPrimitives.arrayIntA.length; i++) {
			assertEquals(
					DataPrimitives.arrayIntC[i],
					sumaObject.suma(
							DataPrimitives.arrayIntA[i],
							DataPrimitives.arrayIntB[i]
									)
					);
		}
	}
	@Test
	public void longSuma() {
		for (i = 0; i < DataPrimitives.arrayLongA.length; i++) {
			assertEquals(
					DataPrimitives.arrayLongC[i],
					sumaObject.suma(
							DataPrimitives.arrayLongA[i],
							DataPrimitives.arrayLongB[i]
									)
					);
		}
	}
//	@Test
//	public void floatSuma() {
//		for (i = 0; i < DataPrimitives.arrayFloatA.length; i++) {
//			assertEquals(
//					DataPrimitives.arrayFloatC[i],
//					sumaObject.suma(
//							DataPrimitives.arrayFloatA[i],
//							DataPrimitives.arrayFloatB[i]
//									),
//					
//					);
//		}
//	}
//	@Test
//	public void doubleSuma() {
//		for (i = 0; i < DataPrimitives.arrayDoubleA.length; i++) {
//			assertEquals(
//					DataPrimitives.arrayDoubleC[i],
//					sumaObject.suma(
//							DataPrimitives.arrayDoubleA[i],
//							DataPrimitives.arrayDoubleB[i]
//									)
//					);
//		}
//	}
//	
	
	
	
}
