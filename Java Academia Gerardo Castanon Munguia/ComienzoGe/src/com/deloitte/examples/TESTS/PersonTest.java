package com.deloitte.examples.TESTS;
import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.deloitte.examples.objects.*;
class PersonTest {
    
	@Test
	public void TestPerson() {
	Person p = new Person("Gerardo","Castañon","Munguía");
	assertEquals("Gerardo", p.getNombre());
	assertEquals("Castañon", p.getApellido_pa());
	assertEquals("Munguía", p.getApellido_mat());
	}
    
    @Test
	public void Testsuma() {
	Person p = new Person(2.3,4.5);
	assertEquals(2.3,4.5, p.Suma(2.3,4.5));
	}
    @Test
	public void Testsuma2() {
	Person p = new Person(2,4);
	assertEquals(6, p.Suma(2,4));
	}
    @Test
	public void Testsuma3() {
	Person p = new Person('a','b');
	assertEquals('a','b', p.Suma('a','b'));
	}
    @Test
	public void Testsuma4() {
	Person p = new Person('a','b');
	assertEquals('a','b', p.Suma('a','b'));
	}
    @Test
	public void Testsuma5() {
	Person p = new Person(32732,32732);
	assertEquals(65464, p.Suma(32732,32732));
	}
    @Test
	public void Testsuma6() {
	Person p = new Person(13338,345435456);
	assertEquals(345448794, p.Suma(13338,345435456));
	}
    @Test
	public void Testsuma7() {
	Person p = new Person(127,128);
	assertEquals(255, p.Suma(127,128));
	}
    
    
   
    
}
