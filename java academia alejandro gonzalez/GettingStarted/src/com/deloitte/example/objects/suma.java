package com.deloitte.example.objects;



public class suma {
	
	private int rint;
	private double rdouble;
	private static char rchar;
	private short rshort;
	private static long rlong;
	private float rfloat;
	
	public suma(int a, int b) {
		this.rint= a+b;
		}
	
	public suma(double a, double b) {
		this.rdouble=a+b;
	}
	public static char suma2(char a, char b) {
		
		return rchar='a'+'b';
	}
	public suma(short a, short b) {
		this.rshort='a'+'b';
	}
	public suma(long a, long b) {
		suma.rlong =a+b;
		
	}
	public suma(float a, float b) {
		this.rfloat=a+b;
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
