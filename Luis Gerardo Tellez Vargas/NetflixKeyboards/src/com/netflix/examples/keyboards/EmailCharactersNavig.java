package com.netflix.examples.keyboards;

public class EmailCharactersNavig {

	public int[] PosicionCharacters (String matrizActual [][], int k, int lastI, int lastJ){
		int posicion[]= {};
		int i=0;
		int j=0;
		
		for (i=0; i<matrizActual.length;i++) {
			for (j=0; j<matrizActual[i].length; j++) {
				if(Main.mail.charAt(k) == matrizActual[i][j].charAt(k)) {
					//System.out.print(Main.mail.charAt(k));
					posicion[0]=i;
					posicion[1]=j;
					posicion[2]=lastI;
					posicion[3]=lastJ;
				}
			}
		}
		return posicion;
	}

}
