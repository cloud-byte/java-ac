package com.deloitte.netflixKeyboards.navigation;

import com.deloitte.netflixKeyboards.Keyboards;

public class SpecialPasswordKB extends Keyboards {

	private static int initialPosX = 0;
	private static int initialPosY = 4;
	
	public String[] KBNavigation(String password, String res) {
		String[] valores = new String [2];
		
		String aux = null;
		int x = 0,y = 0;
		char c;
		int ActualX=initialPosX,ActualY=initialPosY;
		int movX,movY;
		
//		if(DefaultEmailKB[0][0].contentEquals(s)) {
//			System.out.println("ya jalo");
//		}else {
//			System.out.println("No jala");
//		}

		while(password.length()>0) 
		{
			//busca el caracter en la matriz 
			c=password.charAt(0);
			
			//busca caracter por caracter
			aux="";
			aux+=c;
			for (int i = 0; i < 7; i++) { //recorre Y
				for (int j = 0; j < 10; j++) { //recorre X 
					if(SpecialPasswordKB[i][j].contentEquals(aux)) {
						x=j;
						y=i;
						break;
					}
					else {
						x=0;
						y=4;
					}
				}
				if(SpecialPasswordKB[y][x].contentEquals(aux)) break;
			}
			
			
			//System.out.println(DefaultEmailKB[y][x]);
			
			movX=ActualX-x;  //negativo --> der    positivo --> izq
			movY=ActualY-y;	 //negativo --> abajo  positivo --> arriba
			
			ActualX=x;
			ActualY=y;
			
			while(movX!=0) {
				if(movX>0) {
					res+="Left, ";
					movX-=1;
				}else if (movX<0) {
					res+="Right, ";
					movX++;
				}
			}
			while(movY!=0) {
				if(movY>0) {
					res+="Up, ";
					movY-=1;
				}else if (movY<0) {
					res+="Down, ";
					movY++;
				}
			}
			res+="Ok \n";
			
			if(x==0 && y==5) {
				break;
			}
			
			 //Reduce el correo en un char 
			 aux=password.substring(1); 
			 password=aux;
			 //System.out.println(email); 
		 }
		
		
		valores[0]=password;
		valores[1]=res;
		return valores;
	}
}
