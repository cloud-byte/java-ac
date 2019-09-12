package com.deloitte.examples.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.deloitte.examples.objects.Suma;


class SumaTest {

	int i;
	Suma s = new Suma(i, i);
	@Test
	public void testSumas() {
		
		assertEquals(10, s.sumaInt(4, 6));
		assertEquals(122, s.sumaByte((byte)100, (byte)22));
		assertEquals(3.0, s.sumaDouble((double) 1.0, (double) 2.0), 0);
		assertEquals(40.0, s.sumaFloat((float) 15.0, (float) 25.0), 0);
		assertEquals(50, s.sumaShort( (short) 30 , (short) 20));
		assertEquals(500L, s.sumaLong( (long) 300, (long) 200));
		assertEquals(97, s.sumaChar( (char) 40, (char) 57));
		
	}
	
	@Test
	public void testArrays() {
		
		
		//******SUMA BOOLEAN ARRAYS********
		for(i = 0; i < Suma.a.length; i++) {
			assertEquals(Suma.r[i], s.sumaBool(Suma.a[i], Suma.b[i]));
		}
		//*********SUMA ARRAYS ENTEROS*********
		for(i = 0; i < Suma.enteroA.length; i++) {
			assertEquals(Suma.enteroR[i], s.sumaInt(Suma.enteroA[i], Suma.enteroB[i]));
		}
		//**********SUMA ARRAYS DOUBLE*********
		for(i = 0; i < Suma.dobleA.length; i++) {
			assertEquals(Suma.dobleR[i], s.sumaDouble(Suma.dobleA[i], Suma.dobleB[i]), 0);
		}
		//*********SUMA ARRAYS FLOAT**********
		for(i = 0; i < Suma.flotanteA.length; i++) {
			assertEquals(Suma.flotanteR[i], s.sumaFloat(Suma.flotanteA[i], Suma.flotanteB[i]), 0);
		}
		//**********SUMA ARRAYS BYTE**********
		for(i = 0; i < Suma.byteA.length; i++) {
			assertEquals(Suma.byteR[i], s.sumaByte(Suma.byteA[i], Suma.byteB[i]));
		}
		//**********SUMA ARRAYS SHORT**********
		for(i = 0; i < Suma.shortA.length; i++) {
			assertEquals(Suma.shortR[i], s.sumaShort(Suma.shortA[i], Suma.shortB[i]));
		}
		//**********SUMA ARRAYS LONG**********
		for(i = 0; i < Suma.longA.length; i++) {
			assertEquals(Suma.longR[i], s.sumaLong(Suma.longA[i], Suma.longB[i]));
		}
		//**********SUMA ARRAYS CHAR**********
		for(i = 0; i < Suma.charA.length; i++) {
			assertEquals(Suma.charR[i], s.sumaChar(Suma.charA[i], Suma.charB[i]));
		}
		
	}
}
