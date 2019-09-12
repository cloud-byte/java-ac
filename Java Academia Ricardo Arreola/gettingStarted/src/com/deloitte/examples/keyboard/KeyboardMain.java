package com.deloitte.examples.keyboard;

import static org.junit.Assert.assertArrayEquals;

public class KeyboardMain {
	
	public static String movimientos = "";

	
	public static void main(String[] args) {

		System.out.println("Ejecutando Email-Default: ");
		EmailDe keyboardEmailDefault = new EmailDe(4,2);
		EmailSp keyboardEmailSpecial = new EmailSp();

		//printKeyboard(keyboardEmailDefault);
		//printKeyboard(keyboardEmailSpecial);

		String email = "r/^a%7r5@gmail.com";
		System.out.println("Correo: "+email);
		
		keyboardEmailDefault.getX();
		keyboardEmailDefault.getY();
		
		for (int i = 0; i < email.length(); i++) {
			String letra = String.valueOf(email.charAt(i));
			if (letra.equals("@")) {
				String[] paginaWeb = email.split("@");
				if(paginaWeb[1].equals("gmail.com")||paginaWeb[1].equals("yahoo.com")||paginaWeb[1].equals("hotmail.com")) {
				
					letra = "@"+paginaWeb[1];
					i = email.length();
				}
			}
			int[] coordenadas = findCoord(letra, keyboardEmailDefault, keyboardEmailSpecial);//enviamos la letra, el teclado default y el teclado especial y nos regresa en que coordenadas esta.
			//System.out.println("Las coordenadas de la letra "+letra+" son "+ coordenadas[1] +"," + coordenadas[0]);
			movimientos += findPath(keyboardEmailDefault.getX(),keyboardEmailDefault.getY(),coordenadas[1],coordenadas[0],keyboardEmailDefault);//llamamos la funcion que nos regresa el camino a tomar segun 2 coordenadas
			keyboardEmailDefault.setX(coordenadas[1]);
			keyboardEmailDefault.setY(coordenadas[0]);
			if	(coordenadas[2]==1) { System.out.println("Teclado de caracteres especiales----------------------------");}
		}
		movimientos += findPath(keyboardEmailDefault.getX(),keyboardEmailDefault.getY(),9,7,keyboardEmailDefault);// camino a "next"

		
		System.out.println("los movimientos son: \n\n"+movimientos);
	}	
	
	public static String findPath(int iniciox,int inicioy, int finx, int finy, Keyboard teclado) {
		String resultado = "";
		int sumaX = finx - iniciox;
		int sumaY = finy - inicioy;
		//System.out.println("movimiento: "+sumaX+" , "+ sumaY);
		// si las coordenadas no son las mismas ...
			
			if (sumaX>0) {
				for (int i = 0; i < sumaX; i++) {
					resultado += "right_arrow, ";
				}
			}else {
				for (int i = 0; i > sumaX; i--) {
					resultado += "left_arrow, ";
				}
			}
			
			if (sumaY>0) {
				for (int i = 0; i < sumaY; i++) {
					resultado += "down_arrow, ";
				}
			}else {
				for (int i = 0; i > sumaY; i--) {
					resultado += "up_arrow,";
				}
			}
			// -----------------------------------------:
		
		return resultado+ "select, \n";
	}
	
	public static int[] findCoord(String letra, Keyboard teclado1, Keyboard teclado2) {
		int tec;
		Keyboard[] teclados = {teclado1, teclado2};
		for (tec = 0; tec <= 1; tec++) {
			
			for (int i = 0; i < teclados[tec].getKeys().length; i++) {
				for (int j = 0; j < teclados[tec].getKeys()[0].length; j++) {
					
					if (teclado1.getKeys()[i][j].equals(letra)) {//si la letra es igual regresa las coordenadas
						
						return new int[] {i,j,tec};
					}
				}
			}
		}
		
		return new int[] {0,5,tec};
				
	}

	public static void printKeyboard(Keyboard keyboardEmailDefault) {
		
		System.out.print("\n");
		System.out.println("------------------- Imprimiendo teclado -------------------");
		System.out.println("coordenadas del puntero: ("+keyboardEmailDefault.getX()+","+keyboardEmailDefault.getY()+")");
		for (int i = 0; i < keyboardEmailDefault.getKeys().length; i++) {
			for (int j = 0; j < keyboardEmailDefault.getKeys()[0].length; j++) {
				
				if ((j==keyboardEmailDefault.getX())&&(i==keyboardEmailDefault.getY())) {
					System.err.print(keyboardEmailDefault.getKeys()[i][j]+" ");
//					System.out.println(j+","+i);
				}else {
					System.out.print(keyboardEmailDefault.getKeys()[i][j]+" ");
//					System.out.println(j+","+i);
				}

			}
			System.out.print("\n");
		}
		System.out.print("\n");

	}

}
