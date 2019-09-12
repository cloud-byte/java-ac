package com.netflix.examples.keyboards;
import java.util.Scanner;



public class Main {
	
	static String mail;
	static String password;
	static boolean paso1=true;
	static boolean charact=false;
	static boolean find=false;
	static String matrizActual[][]= Keyboards.defaultEmail;
	
	
	public static void main (String []args) {
		Scanner lee=new Scanner(System.in);
		EmailDefaultNavig p=new EmailDefaultNavig();
		EmailCharactersNavig q=new EmailCharactersNavig();
		EmailDefaultNavig r=new EmailDefaultNavig();
		EmailDefaultNavig s=new EmailDefaultNavig();
		
		System.out.println("Ingresa el mail: ");
		String mail = lee.nextLine();
		System.out.println("Ingresa la contraseña");
		String password = lee.nextLine();
		
		/*El punto inicial del teclado es la g en el teclado de letras
			defaultEmail[4][2];
		*/
		
		String izq="left_arrow";
		String der="right_arrow";
		String arr="up_arrow";
		String aba="down_arrow";
		
		int lastI=2;//	Determina la posición i inicial en nuestro teclado
		int lastJ=4; // Determina la posición j inicial en nuestro teclado
		int k=0; // Determina la posición de nuestro array inicial
		int i=0;
		int j=0;
		int encI=0, encJ=0; //Sirve para nuestras coordenadas i y j del caracter encontrado
		
		//p.PosicionDefault(matrizActual,k,lastI,lastJ);
		
		/*for (int i=0; i<EmailDefaultNavig.posicion.length;i++) {
			System.out.println(EmailDefaultNavig.posicion[i]);
		}*/
		
	//for(k=0; k<mail.length();k++) {	
		for (i=0; i<matrizActual.length;i++) {
			for (j=0; j<matrizActual[i].length; j++) {
				if(mail.charAt(k) == matrizActual[i][j].charAt(k)) {
					System.out.print(mail.charAt(k)+"   ");
					find=true;
					encI=i;
					encJ=j;
				}
				
				if((i==matrizActual.length-1)&&(j==matrizActual[i].length-1)&&(find==false)&&(charact==false)) {
					matrizActual=Keyboards.charactersEmail;
					i=0;
					j=0;
				}
				if((i==matrizActual.length-1)&&(j==matrizActual[i].length-1)&&(find==false)&&(charact==false)) {
					matrizActual=Keyboards.defaultEmail;
					i=0;
					j=0;
				}
			}
			
		}
		System.out.print(encI+"  ");
		System.out.print(encJ+"  ");
//	}	
		
			
	
	}

}
