package com.deloitte.examples.objects;

public class Suma {

	public static boolean[] a = {true, true, false, false};
	public static boolean[] b = {true, false, false, true};
	public static boolean[] r = {true, false, false, false};
	
	public static int[] enteroA = {1, 2, 3, 4, 5};
	public static int[] enteroB = {2, 3, 5, 6, 7};
	public static int[] enteroR = {3, 5, 8, 10, 12};
	
	public static double[] dobleA = {2.0, 3.0, 4.0, 5.0};
	public static double[] dobleB = {3.0, 4.0, 5.0, 6.0};
	public static double[] dobleR = {5.0, 7.0, 9.0, 11.0};
	
	public static float[] flotanteA = {1.2F, 3.4F, 5.6F, 7.8F};
	public static float[] flotanteB = {1.0F, 2.0F, 3.0F, 4.0F};
	public static float[] flotanteR = {2.2F, 5.4F, 8.6F, 11.8F};
	
	public static byte[] byteA = {3, 4, 5, 6, 7};
	public static byte[] byteB = {1, 2, 3, 4, 5};
	public static byte[] byteR = {4, 6, 8, 10, 12};
	
	public static short[] shortA = {1, 2, 3, 4, 5};
	public static short[] shortB = {1, 2, 3, 4, 5};
	public static short[] shortR = {2, 4, 6, 8, 10};
	
	public static long[] longA = {100L, 200L, 300L, 400L, 500L};
	public static long[] longB = {200L, 300L, 100L, 500L, 400L};
	public static long[] longR = {300L, 500L, 400L, 900L, 900L};
	
	public static char[] charA = {45, 40, 23, 50, 62};
	public static char[] charB = {1, 2, 3, 4, 5};
	public static char[] charR = {46, 42, 26, 54, 67};
			
		
	public Suma(int i, int j) {
		
	}
	
	public int sumaInt(int a, int b) {
		return a + b;
	}
	
	
	public byte sumaByte(byte a, byte b) {
		return (byte) (a + b);
	}
	
	public double sumaDouble(double a, double b) {
		return (double) (a + b);
	}
	
	public float sumaFloat(float a, float b) {
		return (float) (a + b);
	}
	
	public short sumaShort(short a, short b ) {
		return (short) (a + b);
	}
	
	public long sumaLong(long a, long b) {
		return (long) (a + b);
	}
	
	public char sumaChar(char a, char b) {
		return (char) (a + b);
	}
	
	public boolean sumaBool( boolean a, boolean b) {
		return (boolean) (a && b);
	}
}
