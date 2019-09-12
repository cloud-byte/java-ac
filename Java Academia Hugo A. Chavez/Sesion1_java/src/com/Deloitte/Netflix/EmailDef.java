package com.Deloitte.Netflix;

public class EmailDef {

	public static void main(String[] args) {
	
	int i=0;
	int j=0;
	int k=0;
	int f,c;
	f=2;
	c=4;
//	for(k=0; k < Teclados.Email.length; k++) {
//		System.out.println(Teclados.Email[k]);
//	}
//	for(k=0; k < Teclados.Email.length; k++) {
//	System.out.println(Teclados.Email[k]);
	
	for (i=0; i < Teclados.EmailDef.length; i++) {
		System.out.println();
		  for (j=0; j < Teclados.EmailDef[i].length; j++) {
		    //System.out.print(Teclados.EmailDef[i][j] + " ");

			  if(Teclados.EmailDef[i][j].equals(Teclados.Email[k])) {
				System.out.print(i);
				System.out.print(j);
				
				while(i!=f) {
					if(i>f) {
						f++;
						System.out.println("Down_Arrow");
					}
					if(i<f) {
						f--;
						System.out.println("Up_Arrow ");
					}
				}
				
				if(i==f) {
					while(j!=c) {
						if(j>c) {
							c++;
							System.out.print("Right_Arrow ");
						}
						if(j<c) {
							c--;
							System.out.print("Left_Arrow ");
						}
					}
					if(j==c) {
						System.out.println("ok");
					}
				}
			  }
		  }
		}
	}
	
	}