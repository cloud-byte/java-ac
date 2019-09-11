package com.deloitte.examples.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.deloitte.examples.objects.Sumas;

class SumaTest {

	@Test
	public void testSumas() {
		Sumas s = new Sumas();
		
		assertEquals(10, s.sumaInt(4, 6));
		assertEquals(122, s.sumaByte((byte)100, (byte)22));
		assertEquals(3.0, s.sumaDouble((double) 1.0, (double) 2.0), 0);
		assertEquals(40.0, s.sumaFloat((float) 15.0, (float) 25.0), 0);
		assertEquals(50, s.sumaShort( (short) 30 , (short) 20));
		assertEquals(500L, s.sumaLong( (long) 300, (long) 200));
		assertEquals(97, s.sumaChar( (char) 40, (char) 57));
	}
}
