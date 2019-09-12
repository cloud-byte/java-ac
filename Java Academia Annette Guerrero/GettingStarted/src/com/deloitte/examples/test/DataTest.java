package com.deloitte.examples.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

import com.deloitte.examples.objects.Arreglos;

class DataTest {
	Arreglos arreglos =new Arreglos();
	@Test
	public void TestBoolean() {
		for(int i=0; i<arreglos.ab1.length; i++) {
			assertEquals(arreglos.abr0[i], arreglos.suma((arreglos.ab1[i]),( arreglos.ab2[i])));
		}
		
		/*
		 * for(int i=0; i<arreglos.ab1.length; i++) { assertEquals(arreglos.abr1[i],
		 * arreglos.suma((arreglos.ab1[i]),( arreglos.ab2[i]))); }
		 */
	}
	
	@Test
	public void TestDouble() {
		for(int i=0; i<arreglos.ad1.length; i++) {
			assertEquals(arreglos.adr0[i], arreglos.suma((arreglos.ad1[i]),( arreglos.ad2[i])),1);
		}
		
		/*
		 * for(int i=0; i<arreglos.ad1.length; i++) { assertEquals(arreglos.adr1[i],
		 * arreglos.suma((arreglos.ad1[i]),( arreglos.ad2[i])),1); }
		 */
	}
	
	@Test
	public void TestFloat() {
		for(int i=0; i<arreglos.af1.length; i++) {
			assertEquals(arreglos.afr0[i], arreglos.suma((arreglos.af1[i]),( arreglos.af2[i])),1);
		}
		/*
		 * for(int i=0; i<arreglos.af1.length; i++) { assertEquals(arreglos.afr1[i],
		 * arreglos.suma((arreglos.af1[i]),( arreglos.af2[i])),1); }
		 */
	}
	
	@Test
	public void TestInt() {
		for(int i=0; i<arreglos.ai1.length; i++) {
			assertEquals(arreglos.air0[i], arreglos.suma((arreglos.ai1[i]),( arreglos.ai2[i])),1);
		}
		
		/*
		 * for(int i=0; i<arreglos.ai1.length; i++) { assertEquals(arreglos.air1[i],
		 * arreglos.suma((arreglos.ai1[i]),( arreglos.ai2[i])),1); }
		 */
	}
	
	@Test
	public void TestLong() {
		for(int i=0; i<arreglos.al1.length; i++) {
			assertEquals(arreglos.alr0[i], arreglos.suma((arreglos.al1[i]),( arreglos.al2[i])));
		}
		
	
		/*
		 * for(int i=0; i<arreglos.al1.length; i++) { assertEquals(arreglos.alr1[i],
		 * arreglos.suma((arreglos.al1[i]),( arreglos.al2[i]))); }
		 */
	}
	
	@Test
	public void TestShort() {
		for(int i=0; i<arreglos.as1.length; i++) {
			assertEquals(arreglos.asr0[i], arreglos.suma((arreglos.as1[i]),( arreglos.as2[i])));
		}
		
		/*
		 * for(int i=0; i<arreglos.as1.length; i++) { assertEquals(arreglos.asr1[i],
		 * arreglos.suma((arreglos.as1[i]),(arreglos.as2[i]))); }
		 */
	}
	
	@Test
	public void TestChar() {
		for(int i=0; i<arreglos.ac1.length; i++) {
			assertEquals(arreglos.acr0[i], arreglos.suma((arreglos.ac1[i]),( arreglos.ac2[i])));
		}
		/*
		 * for(int i=0; i<arreglos.ac1.length; i++) { assertEquals(arreglos.acr1[i],
		 * arreglos.suma((arreglos.ac1[i]),( arreglos.ac2[i]))); }
		 */
	}

	@Test
	public void TestByte() {
		for(int i=0; i<arreglos.aby1.length; i++) {
			assertEquals(arreglos.abyr0[i], arreglos.suma((arreglos.aby1[i]),( arreglos.aby2[i])));
		}
		/*
		 * for(int i=0; i<arreglos.aby1.length; i++) { assertEquals(arreglos.abyr1[i],
		 * arreglos.suma((arreglos.aby1[i]),( arreglos.aby2[i]))); }
		 */
	}
}
