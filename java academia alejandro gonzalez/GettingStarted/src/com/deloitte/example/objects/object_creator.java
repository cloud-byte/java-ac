package com.deloitte.example.objects;

public class object_creator {

	public static void main(String[] args) {
		person persona = new person("Alejandro","Gonzalez","Castorena" ) ; 
		
		System.out.println(persona.getNombre());
		String nombre =persona.getNombre();
		 if (nombre.equals("Alejandro"))
		 {
			 System.out.println("soy alejandro");
			 
		 }else {
			 System.out.println("no soy alejandro");
		 }
	}
	public int sumaint(int a, int b) {
		return a+b;
	}
	
	public double sumadouble(double a, double b) {
		return a+b;
	}
	public char sumachar(char a, char b) {
		return ('a'+'b');
	}
	public short sumashort(short a, short b) {
		return 'a'+'b';
	}
	public long sumalong(long a, long b) {
		return a+b;
	}
	public float suma(float a, float b) {
		return a+b;
	}
	
}
