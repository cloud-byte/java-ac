package com.deloitte.examples.keyboard;

import static org.junit.Assert.assertEquals;

import java.awt.RenderingHints.Key;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import com.deloitte.examples.TESTS.TestData;
import com.deloitte.examples.objects.Person;

public class Navegacion {

	public Navegacion() {
		
	}
	public static int[] buscar (char a,int x,int y) {
		Keyboards teclado=new Keyboards();
		 String letra= String.valueOf(a);
		 int number1 = x;
		    int number2 = y;
		    System.out.println(letra);
		    
for (int i=0 ;i<=5; i++) {
			
			for (int j=0;j<=9;j++) {
				
				if ( teclado.email_normal[j][i].contentEquals(letra)||teclado.matriz[j][i].contentEquals(letra)) {
					
					 number1 = j;
				     number2 = i;
				    				}}}
return new int[] {number1, number2};
}
	
public static void movimiento(int x,int y, int nx,int ny) {
		
		if (x<nx) {
			int pasos = (x-nx)*-1;
			System.out.println(pasos+" pasos a la derecha.");
		}
		
		if (x>nx) {
			int pasos = (nx-x)*-1;
			System.out.println(pasos+" pasos a la izquierda.");
		}
		
		if (y<ny) {
			int pasos = (y-ny)*-1;
			System.out.println(pasos+" pasos hacia abajo.");
		}
		if (y>ny) {
			int pasos = (ny-y)*-1;
			System.out.println(pasos+" pasos hacia arriba.");
		}
		
}
	
	public static void main(String[] args) {
		int iniciox= 4;
		int inicioy= 2;
		int actualx= 4;
		int actualy= 2;
		int viejox=0;
		int viejoy=0;

		String str = "gerardocasta9#@gmail.com";
		
		Keyboards teclado=new Keyboards();
		
		System.out.println("Letra");
		System.out.println(teclado.email_normal[4][2]);
		
		for (int n = 0; n <str.length (); n ++) 
		{ 
			char c = str.charAt (n); 
			int result[] = buscar(c,iniciox,inicioy);
			iniciox= result[0];
			inicioy=result[1];
			System.out.println ( "coordenadax= "+iniciox);
			System.out.println ( "coordenaday= "+inicioy);
			
			viejox=actualx;
			viejoy=actualy;
			actualx= result[0];
			actualy=result[1];
			movimiento(viejox,viejoy,actualx,actualy);



}
	}
}

