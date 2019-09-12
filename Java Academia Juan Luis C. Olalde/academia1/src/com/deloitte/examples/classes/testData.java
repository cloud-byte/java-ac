package com.deloitte.examples.classes;

public class testData {
	
	public static boolean a[]= {true,true,false,false};
	public static boolean b[]= {true,false,false,true};
	public static boolean res[]= {true,false,false,false};
	
	public static int a1[]= {2,3,5,7,4,1};
	public static int b1[]= {3,2,4,5,6,7};
	public static int res1[]= {5,5,9,12,10,8};
	
	public static byte a2[]= {3,4,5,7,6,6,6};
	public static byte b2[]= {8,2,2,2,2,2,2};
	public static byte res2[]= {11,6,7,9,8,8,8};
	
	public static char a3[]= {1,2,3,4,5,6,7,8,9};
	public static char b3[]= {'a','b','c','d','e','f','g','h','i'};
	public static char res3[]= {'b','d','f','h','j','l','n','p','r'};
	
	public static short a4[]= {2,3,4,5,6,7,8,7,4};
	public static short b4[]= {7,4,5,7,8,9,1,2,0};
	public static short res4[]= {9,7,9,12,14,16,9,9,4};
	
	public static long a5[]= {8,2,1,1,3,4};
	public static long b5[]= {9,4,3,2,4,5};
	public static long res5[]= {17,6,4,3,7,9};
	
	public static float a6[]= {2,4,4,3,2,2};
	public static float b6[]= {3,2,3,4,5,6};
	public static float res6[]= {5,7,7,7,7,8};
	
	public static double a7[]= {2,3,4,5,6,7,8,7,4};
	public static double b7[]= {7,4,5,7,8,9,1,2,0};
	public static double res7[]= {9,7,9,12,14,16,9,9,4};
	
	public testData() {
		
	}
	
	public boolean suma(boolean a, boolean b) {
		boolean resultado = a && b;
		return resultado;
	}
	
	public int suma(int a,int b) {
		int resultado = a+b;
		return resultado;
	}
	
	public byte suma(byte a,byte b) {
		byte resultado = (byte) (a+b);
		return resultado;
	}
	
	public char suma(char a,char b) {
		char resultado = (char) (a+b);
		return resultado;
	}
	
	public short suma(short a,short b) {
		short resultado = (short) (a+b);
		return resultado;
	}
	
	public long suma(long a,long b) {
		long resultado = a+b;
		return resultado;
	}
	
	public float suma(float a,float b) {
		float resultado = a+b;
		return resultado;
	}
	
	public double suma(double a,double b) {
		double resultado = a+b;
		return resultado;
	}
	
	
	
	
	
	
}
