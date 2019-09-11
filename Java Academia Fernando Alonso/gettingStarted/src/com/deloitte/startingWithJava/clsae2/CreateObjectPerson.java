package com.deloitte.startingWithJava.clsae2;

public class CreateObjectPerson {

	public static void main(String[] args) {
		Person objectPerson = new Person("Luis Fernando","Alonso","Velazquez");
		Person objectPerson2 = new Person("Luis Fernando","Alonso","Velazquez");
		System.out.println(
				objectPerson.getNombre()+" "+
				objectPerson.getApellidoP()+" "+
				objectPerson.getApellidoM()
				);	
		if(objectPerson.getNombre().equals("Luis Fernando")) {
			System.out.println("IGUAL");
		}else {	
			System.out.println("NO SOY IGUAL");
		}
		char i;
		
		for(i = 65; i<='z';i++) {	
			if(i<='Z' || i>='a') {
				System.out.println(i);
			}
			
		}
		System.out.println("---------------------------");
		Person sumaObject = new Person();
		System.out.println("Boolean: "+sumaObject.suma(false,true));
		System.out.println("Byte: "+sumaObject.suma(0x31,0x32));	
		System.out.println("Chart: "+sumaObject.suma('a', 'C'));
		short num1=23; 
		short num2=23;
		System.out.println("Short: "+sumaObject.suma(num1,num2));
		System.out.println("Int: "+sumaObject.suma(10,20));
		long num3=2300; 
		long num4=2300;
		System.out.println("Long: "+sumaObject.suma(num3,num4));
		float num5 = 23;
		float num6 = 24;
		System.out.println("Float: "+sumaObject.suma(num5,num6));
		System.out.println("DOuble: "+sumaObject.suma(2.3,4.3));
	}

}
