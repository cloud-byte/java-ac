package com.deloitte.examples.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.deloitte.examples.objects.Sumas;

class SumaTest {

	Sumas s = new Sumas();
	int i;
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
		for(i = 0; i < Sumas.a.length; i++) {
			assertEquals(Sumas.r[i], s.sumaBool(Sumas.a[i], Sumas.b[i]));
		}
		//*********SUMA ARRAYS ENTEROS*********
		for(i = 0; i < Sumas.enteroA.length; i++) {
			assertEquals(Sumas.enteroR[i], s.sumaInt(Sumas.enteroA[i], Sumas.enteroB[i]));
		}
		//**********SUMA ARRAYS DOUBLE*********
		for(i = 0; i < Sumas.dobleA.length; i++) {
			assertEquals(Sumas.dobleR[i], s.sumaDouble(Sumas.dobleA[i], Sumas.dobleB[i]), 0);
		}
		//*********SUMA ARRAYS FLOAT**********
		for(i = 0; i < Sumas.flotanteA.length; i++) {
			assertEquals(Sumas.flotanteR[i], s.sumaFloat(Sumas.flotanteA[i], Sumas.flotanteB[i]), 0);
		}
		//**********SUMA ARRAYS BYTE**********
		for(i = 0; i < Sumas.byteA.length; i++) {
			assertEquals(Sumas.byteR[i], s.sumaByte(Sumas.byteA[i], Sumas.byteB[i]));
		}
		//**********SUMA ARRAYS SHORT**********
		for(i = 0; i < Sumas.shortA.length; i++) {
			assertEquals(Sumas.shortR[i], s.sumaShort(Sumas.shortA[i], Sumas.shortB[i]));
		}
		//**********SUMA ARRAYS LONG**********
		for(i = 0; i < Sumas.longA.length; i++) {
			assertEquals(Sumas.longR[i], s.sumaLong(Sumas.longA[i], Sumas.longB[i]));
		}
		//**********SUMA ARRAYS CHAR**********
		for(i = 0; i < Sumas.charA.length; i++) {
			assertEquals(Sumas.charR[i], s.sumaChar(Sumas.charA[i], Sumas.charB[i]));
		}
		
	}
}
