package com.deloitte.example.netflix;

public class navegacion {

	public navegacion() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public static void movimiento(int x,int y, int nx,int ny) {
		
		if (x<nx) {
			int pasos = (x-nx)*-1;
			System.out.println(pasos+" pasos a la derecha. -->");
		}
		
		if (x>nx) {
			int pasos = (nx-x)*-1;
			System.out.println(pasos+" pasos a la izquierda. <--");
		}
		
		if (y<ny) {
			int pasos = (y-ny)*-1;
			System.out.println(pasos+" pasos hacia abajo.");
		}
		if (y>ny) {
			int pasos = (ny-y)*-1;
			System.out.println(pasos+" pasos hacia arriba.");
		}
		System.out.println("presionar boton select");
	}
	
	
	
	public static int[] buscar (char a,int x,int y) {
		Teclado_2 teclado=new Teclado_2();
		 String letra= String.valueOf(a);
		 int number1 = x;
		    int number2 = y;
		    System.out.println(letra);
		    
for (int i=0 ;i<=5; i++) {
			
			for (int j=0;j<=9;j++) {
				
				if ( teclado.email_normal[j][i].contentEquals(letra)) {	
					 number1 = j;
				     number2 = i;
				    				}
				
				
			}}
				return new int[] {number1, number2};
}
	
	public static void main(String[] args) {
		int actualx= 4;
		int actualy= 2;
		int viejox=0;
		int viejoy=0;
		String str = "gerardo@gmail.com";
		
		for (int n = 0; n <str.length (); n ++) 
		{ 
			char c = str.charAt (n); 
			int result[] = buscar(c,actualx,actualy);
			
			viejox=actualx;
			viejoy=actualy;
			actualx= result[0];
			actualy=result[1];
			movimiento(viejox,viejoy,actualx,actualy);
			
			
			//System.out.println ( "coordenadax= "+actualx);
			//System.out.println ( "coordenaday= "+actualy);
			
			
		}
		
		
	}

}
