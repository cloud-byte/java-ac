package com.deloitte.examples.TESTS;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
    
    @Test
    public void TestByte() {
    	
    	for (int i =0; i< TestData.a.length; i++) {
    		assertEquals(TestData.c[i],Person.suma(TestData.a[i],TestData.b[i]));
    	}
    	}
    @Test
    public void TestInt() {
    	
    	for (int i =0; i< TestData.d.length; i++) {
    		assertEquals(TestData.f[i],Person.suma(TestData.d[i],TestData.e[i]));
    	}
    	}
    @Test
    public void Testdouble() {
    	
    	for (int i =0; i< TestData.g.length; i++) {
    		assertEquals(TestData.j[i],Person.suma(TestData.g[i],TestData.h[i]),0);
    	}
    	}
    @Test
public void Testfloat() {
    	
    	for (int i =0; i< TestData.k.length; i++) {
    		assertEquals(TestData.m[i],Person.suma(TestData.k[i],TestData.l[i]),0);
    	}
    	}
    @Test
public void Testbyte() {
    	
    	for (int i =0; i< TestData.n.length; i++) {
    		assertEquals(TestData.p[i],Person.suma(TestData.n[i],TestData.o[i]));
    	}
    	}
    @Test
    public void Testshort() {
        	
        	for (int i =0; i< TestData.q.length; i++) {
        		assertEquals(TestData.s[i],Person.suma(TestData.q[i],TestData.r[i]));
        	}
        	}
    @Test
    public void Testlong() {
        	
        	for (int i =0; i< TestData.t.length; i++) {
        		assertEquals(TestData.v[i],Person.suma(TestData.t[i],TestData.u[i]));
        	}
        	}
    
    @Test
    public void Testchar() {
        	
        	for (int i =0; i< TestData.w.length; i++) {
        		assertEquals(TestData.y[i],Person.suma(TestData.w[i],TestData.x[i]));
        	}
        	}
}
