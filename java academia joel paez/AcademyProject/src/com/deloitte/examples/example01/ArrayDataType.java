package com.deloitte.examples.example01;

public class ArrayDataType {
	
	int[] arrayInt1 = {-2,4,5,900000000,7};
	int[] arrayInt2 = {8,5,5,900000000,0};
	int[] arrayIntRes = {6,9,10,1800000000,7};
	
	short[] arrayShr1 = {(short)-2,(short)4,(short)5,(short)9000,(short)7};
	short[] arrayShr2 = {(short)8,(short)5,(short)5,(short)9000,(short)0};
	short[] arrayShrRes = {(short)6,(short)9,(short)10,(short)18000,(short)7};
	
	long[] arrayLon1 = {-1000000000L,(long)1000000000,(long)1000000000,(long)-2000000000,(long)1000000000};
	long[] arrayLon2 = {(long)1000000000,(long)1000000000,(long)1100000000,(long)1000000000,(long)1000000001};
	long[] arrayLonRes = {(long)0,(long)2000000000,(long)2100000000,(long)-1000000000,(long)2000000001};
	
	byte[] arrayByt1 = {(byte)3,(byte)5,(byte)7,(byte)2,(byte)-1};
	byte[] arrayByt2 = {(byte)-3,(byte)5,(byte)7,(byte)12,(byte)-1};
	byte[] arrayBytRes = {(byte)0,(byte)10,(byte)14,(byte)14,(byte)-2};
	
	double[] arrayDob1 = {-12.1,0.1,10.2,24.8,4.5};
	double[] arrayDob2 = {-12.1,0.1,-10.2,24.8,4.5};
	double[] arrayDobRes = {-24.2,0.2,0,49.6,9};
	
	float[] arrayFlo1 = {(float)-3.5,(float)0.2,(float)9.0,(float)-12.1,(float)100.9};
	float[] arrayFlo2 = {(float)-3.5,(float)0.2,(float)9.0,(float)12.1,(float)100.9};
	float[] arrayFloRes = {(float)-7,(float)0.4,(float)18.0,(float)0,(float)201.8};
	//float arrayFloRes[] = new Float[3.5,0.2,9.0,-12.1,100.9];
	
	boolean[] arrayBol1 = {false,true,false,true,true};
	boolean[] arrayBol2 = {false,true,true,false,true};
	boolean[] arrayBolRes = {false,true,false,false,true};
	
	char[] arrayCha1 = {'A','d',12,'@',33};
	char[] arrayCha2 = {3,1,53,':','+'};
	char[] arrayChaRes = {'D','e','A','z','L'};
	

	
	public ArrayDataType() {
		
	}

}
