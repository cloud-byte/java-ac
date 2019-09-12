package com.deloitte.examples.classes;

public class Tipo_variables {

	public static void main (String[] args) {
		
		boolean boolValue = true; // True or false
		byte byteValue = 127;  //-128 to 127
		char charValue = 97; //8 to 65535
		short shortValue = 32767; //-32768 to 32767
		int intValue = 2147483647; //-2147483647 to 2147483647
		long longValue = 9223372036854775807L; //-9223372036854775808 to 9223372036854775807
		float floatValue = 3.4028235e38f; //1.17549435e-38 to 3.4028235e+38
		double doubleValue = 1.7976931348623157e308; // 4.9e-324 to 1.8e308
	
		String nombre = "Alejandro";
		System.out.println(nombre);
		
		String nombre2 = "Alejandro";
		System.out.println(nombre2);
		
		
		//Definición de variables char
		if(charValue == 'a') {	//se puede dar valor numerico a char o alfabetico, solamente utilizando comillas simples
			System.out.println("Soy Alejandro");
		}
		else {
			System.out.println("No soy Alejandro");
		}
		for ( char i = 65; i <= 'z'; i++) { // funcion for para imprimir valor entre un segmento
			if ((i <= 'z' || i>= 'a')) {   //|| es un or
				System.out.println(i);
			}
		}
		char m = 'A';					//declarar variable fuera de un loop permite eficientar el uso de recursos de memoria
		do {							//do --> while
			if ( m <= 'Z') {
			System.out.println(m);
			}
			m++;
		}
		while ( m<= 'z'); 	
	
	}
		
	
	//metodos para probar en TestCase_1 y TestCase_2
		
	public byte suma (byte a1, byte b1) {
		int c =  a1 + b1;
		byte d = (byte)c;
		return d;
	}
	
	public char suma (char a, char b) {
		int c = a + b;
		char d = (char)c;
		return  d;
	}
	public short suma (short a, short b) {
		return (short) (a + b);
	}
	public int suma (int a, int b) {
		return (a + b);
	}
	public long suma (long a, long b) {
		return (a + b);
	}
	public float suma (float a, float b) {
		return (a + b);
	}
	public double suma (double a, double b) {
		return (a + b);
	}
	public boolean suma (boolean a, boolean b) {
		return true;
	}
	public String suma (String a, String b) {
		return (a + b);
	}
}
