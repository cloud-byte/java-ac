package com.deloitte.example.objects;



public class suma {
	
	private int rint;
	private double rdouble;
	private static char rchar;
	private short rshort;
	private static long rlong;
	private float rfloat;
	
	public int sumas(int a, int b) {
		return this.rint= a+b;
		}
	public boolean sumas(boolean a, boolean b)
	{
		return (a&&b);
	}

	public double sumas(double a, double b) {
		return this.rdouble=a+b;
	}
	public char sumas(char a, char b) {
		int suma= (int)(a+b);
		return (char)suma;
	}
	public short sumas(short a, short b) {
		return (short)(a+b);
	}
	public long sumas(long a, long b) {
		return a+b;
		
	}
	public float sumas(float a, float b) {
		return (float)(a+b);
	}

	/**
	 * @return the rint
	 */
	public int getRint() {
		return rint;
	}

	/**
	 * @return the rdouble
	 */
	public double getRdouble() {
		return rdouble;
	}

	/**
	 * @return the rchar
	 */
	public static char getRchar() {
		return rchar;
	}

	/**
	 * @return the rshort
	 */
	public short getRshort() {
		return rshort;
	}

	/**
	 * @return the rlong
	 */
	public long getRlong() {
		return rlong;
	}

	/**
	 * @return the rfloat
	 */
	public float getRfloat() {
		return rfloat;
	}
	
	
	
}
