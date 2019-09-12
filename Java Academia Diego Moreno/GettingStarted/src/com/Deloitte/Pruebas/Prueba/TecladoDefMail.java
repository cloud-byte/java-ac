package com.Deloitte.Pruebas.Prueba;
import com.Deloitte.Pruebas.Prueba.Teclados;

public class TecladoDefMail 
{
	Netflix n = new Netflix("diego@hotmail.com","diego99");

	
	
	public static void main(String[] args)
	{
		int i=0;
		int j=0;
		int k=0;
		int f,c;
		int Email=0;
		f=2;
		c=4;
		
		
		for (  i = 0; i < Teclados.TecDefMail.length; i++)
		{
			System.out.println();
			for ( j = 0; j < Teclados.TecDefMail[i].length; j++) 
			{
				//System.out.print(Teclados.TecDefMail[i][j].toString() + " " );
				
				if (Teclados.TecDefMail[i][j].equals("d")) 
				{
					System.out.println(i);
					System.out.println(j);
				while(i!=f ) 
				{
					if(i>f ) 
					{
						f++;
						
							System.out.println("Down_Arrow");
					}if(i<f ) 
					{
						f--;
						
						System.out.println("Up_Arrow");
					}
				}
					
				}
			}
			
			
		}
		
		

	}

}
