package com.deloitte.examples.test;

public class testData {


		// Boolean
	static boolean[] bool_a = {true, true, false, false};
	static boolean[] bool_b = {true, false, true, false};
	static boolean[] bool_res = {true, true, true, false};
	
		// Byte
	static byte[] byte_a = {127, -127, 127, 127};
	static byte[] byte_b = {1, 127, -127, 0};
	static byte[] byte_res = {-127, 0, -127, 127};
	
	 	// float
	static float[] float_a = {10.10f, -10.21f, -12.12f, 0.000001f};
	static float[] float_b = {10.011f, -0f, -12.12f,  -0.000001f};
	static float[] float_res = {20.111f, -10.21f, -24.24f, 0f};
	
	 	// short
	static short[] short_a = {(short)32767, (short)-32767, (short)123, (short)0};
	static short[] short_b = {(short)1, (short)-0, (short)234, (short)0};
	static short[] short_res = {(short)32768, (short)-32767, (short)357, (short)0};
	
		// char
	static char[] char_a = {'R', 'a', 31, '2'};
	static char[] char_b = {5, (char) -10, 33, 50};
	static char[] char_res = {'W', 'W', '@', 'd'};
	
		// long
	static long[] long_a = {10, 500000, 120000, 1};
	static long[] long_b = {101, -1, -120000, -1001};
	static long[] long_res = {111, 499999, 0, -1000};
	
		// double
	static double[] double_a = {1.1231, -2.1111111, 3.14159274};
	static double[] double_b = {0.0009, -0.8888889, 0.00000026};
	static double[] double_res = {1.1239999999999999, -3	  , 3.1415930000000003};
	
		// int
	static int[] int_a = {1, -5, -0, 99};
	static int[] int_b = {9, -15, -0, -100};
	static int[] int_res = {10, -20, 0, -1};
		
}