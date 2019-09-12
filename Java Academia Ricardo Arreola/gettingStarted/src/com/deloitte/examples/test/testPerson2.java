package com.deloitte.examples.test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import com.deloitte.examples.objects.*;

class testPerson2 {
	
	@Test
	public void test1 () {
		Person p = new Person("Ricardo", "Arreola", "Martínez");

		assertEquals("Ricardo", p.getNombre());
		assertEquals("Arreola", p.getApellido_paterno());
		assertEquals("Martínez", p.getApellido_materno());
	}
	
	@Test
	public void test2 () {
		
		Person t1 = new Person();
		

		assertEquals(3, t1.suma(1,2));
		assertEquals(3.54, t1.suma(1.23f, 2.31f),1);
		assertEquals((short) 200, t1.suma((short) 123, (short) 77 ));
		assertEquals(.0000000012, t1.suma(0.0000000002d, 0.000000001d),1);
		assertEquals(true, t1.suma(true, false));
		assertEquals(195, t1.suma('a', 'b'));
		assertEquals((byte) 96, t1.suma((byte) 64, (byte) 32));
		assertEquals(5000L, t1.suma(2000L, 3000L));
		
	}
	
	public void test3() {
		
		Person t3 = new Person();

		
		for (int i = 0; i <= testData.bool_res.length; i++) {
			assertEquals(testData.bool_res[i], t3.suma(testData.bool_a[i], testData.bool_b[i]));
		}

	}
}
