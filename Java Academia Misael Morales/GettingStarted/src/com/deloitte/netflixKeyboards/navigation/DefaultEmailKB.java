package com.deloitte.netflixKeyboards.navigation;

import com.deloitte.netflixKeyboards.Keyboards;
import com.deloitte.netflixKeyboards.navigation.SpecialEmailKB;

public class DefaultEmailKB extends Keyboards {
	
	private static int initialPosX = 4;
	private static int initialPosY = 2;
	
	public static String KBNavigation(String email, String res) {
		String aux = null, s="1";
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
						if(DefaultEmailKB[i][j].contentEquals(email)) {
							x=j;
							y=i;
							break;
						}
					}
				}
			}else if (c=='.' && email.equals(".com")) {
				//busca .com
//				System.out.println("entro");
				for (int i = 0; i < 7; i++) { //recorre Y
					for (int j = 0; j < 10; j++) { //recorre X 
						if(DefaultEmailKB[i][j].contentEquals(email)) {
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
						if(DefaultEmailKB[i][j].contentEquals(aux)) {
							x=j;
							y=i;
							break;
						}
						else {
							x=0;
							y=5;
						}
					}
					if(DefaultEmailKB[y][x].contentEquals(aux)) break;
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
				SpecialEmailKB skb = new SpecialEmailKB();
				String[] arr = skb.KBNavigation(email, res);
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
				res+="Ok \n";
				break;
			}
			 //Reduce el correo en un char 
			 aux=email.substring(1); 
			 email=aux;
			 //System.out.println(email); 
		 }
		return res+"\n";
	}

}


//public static String KBNavigation(String email, String res, int xpos, int ypos) {
//String aux = null;
//int x = 0,y = 0;
//char c;
//int ActualX=xpos,ActualY=ypos;
//int movX,movY;
//
////if(DefaultEmailKB[0][0].contentEquals(s)) {
////	System.out.println("ya jalo");
////}else {
////	System.out.println("No jala");
////}
//
//while(email.length()>0) 
//{
//	//busca el caracter en la matriz 
//	c=email.charAt(0);
//	if (c=='@' && (email.equals("@hotmail.com") || email.equals("@gmail.com") || email.equals("@yahoo.com"))) {
//		//busca los correos completos
//		for (int i = 0; i < 7; i++) { //recorre Y
//			for (int j = 0; j < 10; j++) { //recorre X 
//				if(DefaultEmailKB[i][j].contentEquals(email)) {
//					x=j;
//					y=i;
//					break;
//				}
//			}
//		}
//	}else {
//		//busca caracter por caracter
//		aux="";
//		aux+=c;
//		for (int i = 0; i < 7; i++) { //recorre Y
//			for (int j = 0; j < 10; j++) { //recorre X 
//				if(DefaultEmailKB[i][j].contentEquals(aux)) {
//					x=j;
//					y=i;
//					break;
//				}
//			}
//		}
//	}
//	
//	//System.out.println(DefaultEmailKB[y][x]);
//	
//	movX=ActualX-x;  //negativo --> der    positivo --> izq
//	movY=ActualY-y;	 //negativo --> abajo  positivo --> arriba
//	
//	ActualX=x;
//	ActualY=y;
//	
//	while(movX!=0) {
//		if(movX>0) {
//			res+="Left, ";
//			movX-=1;
//		}else if (movX<0) {
//			res+="Right, ";
//			movX++;
//		}
//	}
//	while(movY!=0) {
//		if(movY>0) {
//			res+="Up, ";
//			movY-=1;
//		}else if (movY<0) {
//			res+="Down, ";
//			movY++;
//		}
//	}
//	res+="Ok \n";
//	
//	if (email.equals("@hotmail.com") || email.equals("@gmail.com") || email.equals("@yahoo.com")) {	
//		movX=ActualX-4;  //negativo --> der    positivo --> izq
//		movY=ActualY-6;	 //negativo --> abajo  positivo --> arriba
//		
//		while(movX!=0) {
//			if(movX>0) {
//				res+="Left, ";
//				movX-=1;
//			}else if (movX<0) {
//				res+="Right, ";
//				movX++;
//			}
//		}
//		while(movY!=0) {
//			if(movY>0) {
//				res+="Up, ";
//				movY-=1;
//			}else if (movY<0) {
//				res+="Down, ";
//				movY++;
//			}
//		}
//		res+="Ok \n";
//		break;
//	}
//	 //Reduce el correo en un char 
//	 aux=email.substring(1); 
//	 email=aux;
//	 //System.out.println(email); 
// }
//return res;
//}
//