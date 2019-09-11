package com.deloitte.example.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.deloitte.example.objects.TestData;
import com.deloitte.example.objects.suma;

class prueba_suma {
	
	
	@Test
	void testSumaint() {
		suma aaa= new suma();
		assertEquals(50,aaa.sumas(20,30));
		
	}

	@Test
	void testSumadouble() {
		suma bbb= new suma();
		assertEquals(51.2,bbb.sumas(20.5,30.7));	}

	@Test
	void testSumachar() {
		suma ccc = new suma();
		assertEquals('Z',ccc.sumas(34,56));
	}

	@Test
	void testSumashort() {
		suma ddd= new suma();
		assertEquals(30000,ddd.sumas(15000,15000));	}

	@Test
	void testSumalong() {
		suma eee= new suma();
		assertEquals(7666,eee.sumas(2344,5322));	}

	@Test
	void testSumafloat() {
		suma fff= new suma();
		assertEquals(3.4,fff.sumas(1.4,2));	}
	@Test
	void testSumabool() {
		suma hhh= new suma();
		assertEquals(false,hhh.sumas(true,false));	}
	
	
	@Test	
	public void Testbyte() {
		suma ggg=new suma();
		for (int i=0; i< TestData.a.length ;i++)
			assertEquals(TestData.r[i],ggg.sumas(TestData.a[i],TestData.b[i]));
			}
	
	@Test	
	public void Testint() {
		suma ggg=new suma();
		for (int i=0; i< TestData.c.length ;i++)
			assertEquals(TestData.f[i],ggg.sumas(TestData.c[i],TestData.d[i]));
			}
	
	@Test	
	public void Testdouble() {
		suma ggg=new suma();
		for (int i=0; i< TestData.g.length ;i++)
			assertEquals(TestData.i[i],ggg.sumas(TestData.g[i],TestData.h[i]),0);
			}
	@Test	
	public void Testfloat() {
		suma ggg=new suma();
		for (int i=0; i< TestData.j.length ;i++)
			assertEquals(TestData.l[i],ggg.sumas(TestData.j[i],TestData.k[i]),0);
			}
	
	@Test	
	public void Testlong() {
		suma ggg=new suma();
		for (int i=0; i< TestData.m.length ;i++)
			assertEquals(TestData.o[i],ggg.sumas(TestData.m[i],TestData.n[i]),0);
			}
	@Test	
	public void Testshort() {
		suma ggg=new suma();
		for (int i=0; i< TestData.p.length ;i++)
			assertEquals(TestData.s[i],ggg.sumas(TestData.p[i],TestData.q[i]),0);
			}
	
	
}
