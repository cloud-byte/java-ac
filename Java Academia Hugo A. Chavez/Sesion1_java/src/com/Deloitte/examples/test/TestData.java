package com.Deloitte.examples.test;

public class TestData {
	
	public static boolean a[]= {true, true, false, false};
	public static boolean b[]= {true, false, false, true};
	public static boolean c[]= {true, false, false, false};
	
	public static byte d[]= {1,2,3,4,5,6,7,8,9};
	public static byte e[]= {1,2,3,4,5,6,7,8,9};
	public static byte f[]= {2,4,6,8,10,12,14,16,18};
	
	public static char g[]= {'a','b','c','d','e','f','g','h','i'};
	public static char h[]= {1,2,3,4,5,6,7,8,9};
	public static char i[]= {'b','d','f','h','j','l','n','p','r'};
	
	public static short j[]= {1,2,3,4,5,6,7,8,9};
	public static short k[]= {1,2,3,4,5,6,7,8,9};
	public static short l[]= {2,4,6,8,10,12,14,16,18};
	
	public static int m[]= {1,2,3,4,5,6,7,8,9};
	public static int n[]= {1,2,3,4,5,6,7,8,9};
	public static int o[]= {2,4,6,8,10,12,14,16,18};
	
	public static long p[]= {1,2,3,4,5,6,7,8,9};
	public static long q[]= {1,2,3,4,5,6,7,8,9};
	public static long r[]= {2,4,6,8,10,12,14,16,18};
	
	public static float s[]= {1.500f,2.500f,3.500f,4.500f,5.500f,6.500f,7.500f,8.500f,9.500f};
	public static float t[]= {1.500f,2.500f,3.500f,4.500f,5.500f,6.500f,7.500f,8.500f,9.500f};
	public static float u[]= {3.000f,5.000f,7.000f,9.000f,11.000f,13.000f,15.000f,17.000f,19.000f};
	
	public static double v[]= {1.6,2.6,3.6,4.6,5.6,6.6,7.6,8.6,9.6};
	public static double w[]= {1.6,2.6,3.6,4.6,5.6,6.6,7.6,8.6,9.6};
	public static double x[]= {3.2,5.2,7.2,9.2,11.2,13.2,15.2,17.2,19.2};
	
public TestData() {
		
}
	public byte suma(byte m, byte n) {
		return (byte) (m+n);
	}	

	public int suma(int e, int f) {
		return (int) (e+f);
	}
	
	public float suma(float i, float j) {
		return (float) (i+j);
	}
	
	public double suma(double k, double l) {
		return (double) (k+l);
	}
	
	public long suma(long g, long h) {
		return (long) (g+h);
	}
	
	public char suma(char a, char b) {
		return (char) (a+b);
	}
	
	public short suma(short c, short d) {
		return (short) (c+d);
	}
	
	public boolean suma(boolean o, boolean p) {
		return (boolean) (o && p);
	}
}
	

