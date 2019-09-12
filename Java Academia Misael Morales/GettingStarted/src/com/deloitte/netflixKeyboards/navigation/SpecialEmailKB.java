package com.deloitte.netflixKeyboards.navigation;

import com.deloitte.netflixKeyboards.Keyboards;

public class SpecialEmailKB extends Keyboards {

	private static int initialPosX = 0;
	private static int initialPosY = 5;
	
	public String[] KBNavigation(String email, String res) {
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

		while(email.length()>0) 
		{
			//busca el caracter en la matriz 
			c=email.charAt(0);
			if (c=='@' && (email.equals("@hotmail.com") || email.equals("@gmail.com") || email.equals("@yahoo.com"))) {
				//busca los correos completos
				for (int i = 0; i < 7; i++) { //recorre Y
					for (int j = 0; j < 10; j++) { //recorre X 
						if(SpecialEmailKB[i][j].contentEquals(email)) {
							x=j;
							y=i;
							break;
						}
					}
				}
			}else if (c=='.' && (email.equals(".com") || email.equals(".ca") ||
					email.equals(".net") || email.equals(".edu") || 
					email.equals(".gov") || email.equals(".org"))) {
				//busca .com
//				System.out.println("entro");
				for (int i = 0; i < 7; i++) { //recorre Y
					for (int j = 0; j < 10; j++) { //recorre X 
						if(SpecialEmailKB[i][j].contentEquals(email)) {
//							System.out.println(DefaultEmailKB[i][j]);
							x=j;
							y=i;
							break;
						}
					}
				}
			}else {
				//busca caracter por caracter
				aux="";
				aux+=c;
				for (int i = 0; i < 7; i++) { //recorre Y
					for (int j = 0; j < 10; j++) { //recorre X 
						if(SpecialEmailKB[i][j].contentEquals(aux)) {
							x=j;
							y=i;
							break;
						}
						else {
							x=0;
							y=5;
						}
					}
					if(SpecialEmailKB[y][x].contentEquals(aux)) break;
				}
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
			
			if (email.equals("@hotmail.com") || email.equals("@gmail.com") || email.equals("@yahoo.com") || email.equals(".com")) {	
				movX=ActualX-4;  //negativo --> der    positivo --> izq
				movY=ActualY-6;	 //negativo --> abajo  positivo --> arriba
				
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
				res+="Ok "+SpecialEmailKB[y][x]+"\n";
				break;
			}
			 //Reduce el correo en un char 
			 aux=email.substring(1); 
			 email=aux;
			 //System.out.println(email); 
		 }
		
		
		valores[0]=email;
		valores[1]=res;
		return valores;
	}

}
