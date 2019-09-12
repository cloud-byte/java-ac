package com.deloitte.examples.objects;

public class Arreglos {
	//Crear clase con Test data
	//2 arreglos de cada uno de los tipos de datos
	//1 arreglo de respuesta del mismo tipo de datos
	
	
	//Crear método prueba para cada tipo de suma
	//Probar con test data
	
	//BOOLEAN
	public boolean[] ab1= {true,true,false,false};
	public boolean[] ab2= {true,false,true,true};
	public boolean[] abr0= {true,false,false,false};
	public boolean[] abr1= {true,true,false,true};
	
	public boolean suma(boolean a, boolean b) {
		return a&&b ;
	}
	
	//DOOUBLE
	public double[] ad1= {1.00,2.00,3.00,4.00,5.00};
	public double[] ad2= {2.00,3.00,4.00,5.00,6.00};
	public double[] adr0= {3.00,5.00,7.00,9.00,11.00};
	public double[] adr1= {3,-6.00,7.00,-9.00,11.00};
	
	public double suma(double a, double b) {
			return a+b;
	}
	
	//FLOAT
	public float[] af1= {3.0f,4.0f,5.0f,6.0f,7.0f};
	public float[] af2= {1.0f,2.0f,3.0f,4.0f,5.0f};
	public float[] afr0= {4.0f,6.0f,8.0f,10.0f,12.0f};
	public float[] afr1= {-9.0f,6.0f,8.0f,10.0f,12.0f};
	
	public float suma(float a, float b) {
			return a+b;
	}
	
	//INT
	public int[] ai1= {1,2,3,4,5};
	public int[] ai2= {1,2,3,4,5};
	public int[] air0= {2,4,6,8,10};
	public int[] air1= {-32,4,6,8,10};
	
	public int suma(int a, int b) {
			return a+b;
	}
	
	//LONG
	public long[] al1= {1L,2L,3L,4L,5L};
	public long[] al2= {1L,2L,3L,4L,5L};
	public long[] alr0= {2L,4L,6L,8L,10L};
	public long[] alr1= {3L,5L,7L,8L,10L};
	
	public long suma(long a, long b) {
		return a+b;
	}
	
	//SHORT
	public short[] as1= {(short)1,(short)2,(short)3,(short)4,(short)5};
	public short[] as2= {(short)1,(short)2,(short)3,(short)4,(short)5};
	public short[] asr0= {(short)2,(short)4,(short)6,(short)8,(short)10};
	public short[] asr1= {(short)3,(short)5,(short)7,(short)8,(short)10};
	
	public short suma(short a, short b) {
			return (short) (a+b);
	}
	
	//CHAR
	public char[] ac1= {'a','b','c','d'};
	public char[] ac2= {'a','b','c','d'};
	public char[] acr0= {194,196,198,200};
	public char[] acr1= {140,200,250,380};
	
	public char suma(char a, char b) {
			return (char)(a+b);
	}
	
	//BYTE
	public byte[] aby1= {(byte)10,(byte)20,(byte)30,(byte)40,(byte)50};
	public byte[] aby2= {(byte)10,(byte)20,(byte)30,(byte)40,(byte)50};
	public byte[] abyr0= {(byte)20,(byte)40,(byte)60,(byte)80,(byte)100};
	public byte[] abyr1= {(byte)-20,(byte)40,(byte)60,(byte)80,(byte)100};
	
	public byte suma(byte a, byte c) { 
			 return (byte) (a+c);
	 }
}
