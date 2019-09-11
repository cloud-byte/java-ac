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
	p.Suma(2.3,4.5);
	}
    @Test
	public void Testsuma2() {
	Person p = new Person(2,4);
	p.Suma(2,4);
	}
    @Test
	public void Testsuma3() {
	Person p = new Person('a','b');
	p.Suma('a','b');
	}
    @Test
	public void Testsuma4() {
	Person p = new Person('a','b');
	p.Suma4('a','b');
	}
    @Test
	public void Testsuma5() {
	Person p = new Person(32732,32732);
	p.Suma5(32732,32732);
	}
    @Test
	public void Testsuma6() {
	Person p = new Person('a','b');
	p.Suma6(13338,345435456);
	}
    @Test
	public void Testsuma7() {
	Person p = new Person(127,127);
	p.Suma7(127,128);
	}
    
    
   
    
}
