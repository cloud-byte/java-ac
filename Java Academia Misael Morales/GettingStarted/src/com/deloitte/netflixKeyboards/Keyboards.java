package com.deloitte.netflixKeyboards;

public class Keyboards {

	public static String c1 = "@gmail.com";
	public static String c2 = "@yahoo.com";
	public static String c3 = "@hotmail.com";

	public static String op1 = "back";
	public static String op2 = "next";

	public static String kbch1 = "SpecialEmailKB";
	public static String kbch2 = "DefaultEmailKB";
	public static String kbch3 = "SpecialPasswordKB";
	public static String kbch4 = "DefaultPasswordKB";
	public static String kbch5 = "NA";

	public static String d1 = ".com";
	public static String d2 = ".ca";
	public static String d3 = ".net";
	public static String d4 = ".edu";
	public static String d5 = ".org";
	public static String d6 = ".gov";


	public static String[][] DefaultPasswordKB = 
	{
		{"1", 		"2", 		"3", 	"4", 	"5", "6", "7", 	"8", 	"9", 	"0"},
		{"q", 		"w", 		"e", 	"r", 	"t", "y", "u", 	"i", 	"o", 	"p"},
		{"a", 		"s", 		"d", 	"f", 	"g", "h", "j", 	"k", 	"l", 	"-"},
		{"shift", 	"shift", 	"z", 	"x", 	"c", "v", "b", 	"n", 	"m", 	"'"},		
		{kbch3, 	kbch3, 		kbch5, 	kbch5, 	" ", " ", " ", 	"del", 	"del", 	"del"},		
		{op1, 		op1, 		op1, op1, op2, op2, op2, 	op2, 	op2, 	op2}
	};

	public static String[][] SpecialPasswordKB = 
	{
		{"`", 	"~", 	"!", 	"@", 	"#", 	"$", 	"%", 	"^", 	"&", 	"*"},
		{"(", 	")", 	"-", 	"_", 	"=", 	"+", 	"[", 	"]", 	"{", 	"}"},
		{"\\", 	"|", 	";", 	":", 	"'", 	"\"", 	",", 	".", 	"<", 	">"},
		{"/", 	"?", 	"¡", 	"¿", 	"ª", 	"º", 	"¢", 	"€", 	"£", 	"¥"},
		{kbch4, kbch4, 	kbch5, 	kbch5, 	" ", 	" ", 	" ", 	"del", 	"del", 	"del"},
		{op1, 	op1, 	op1, 	op1, 	op2, 	op2, 	op2, 	op2, 	op2, 	op2}
	};

	public static String[][] DefaultEmailKB = 
	{ 
		{"1", 		"2", 		"3", "4", "5", "6", "7", 	"8", 	"9", 	"0"},
		{"q", 		"w", 		"e", "r", "t", "y", "u", 	"i", 	"o", 	"p"},
		{"a", 		"s", 		"d", "f", "g", "h", "j", 	"k", 	"l", 	"-"},
		{"shift", 	"shift", 	"z", "x", "c", "v", "b", 	"n", 	"m", 	"_"},
		{c1, 		c1, 		 c1,  c2,  c2,  c2,  c2,  	c3,  	c3,  	c3},
		{kbch1, 	kbch1, 		"@", "@", ".", 	d1, d1, 	"del", 	"del", 	"del"},
		{op1, 		op1, 		op1, op1, op2, op2, op2, 	op2, 	op2, 	op2}
	};

	public static String[][] SpecialEmailKB = 
	{
		{"1", 	"2", 	"3", 	"4", 	"5", 	"6", 	"7", 	"8", 	"9", 	"0"},
		{"`", 	"~", 	"!", 	"@", 	"#", 	"$", 	"%", 	"^", 	"&", 	"*"},
		{"+", 	"-", 	"_", 	"{", 	"}", 	"|", 	"'", 	".", 	"/", 	"?"},		//duda
		{d2, 	d2, 	d3, 	d3, 	d4, 	d4, 	d5, 	d5, 	d6, 	d6},
		{c1, 	c1, 	c1,  	c2,  	c2,  	c2,  	c2,  	c3,  	c3,  	c3},
		{kbch2, kbch2, 	"@", 	"@", 	".", 	d1, 	d1, 	"del", 	"del", 	"del"},
		{op1, 	op1, 	op1, 	op1, 	op2, 	op2, 	op2, 	op2, 	op2, 	op2}
	};
	
	public static boolean CheckKeyboards(String email, String password) {
		boolean r=false;
		char c;
		int k;
		String aux="";
		for (int i = 0; i < email.length(); i++) {
			c=email.charAt(0);
			aux+=c;
			for (int j = 0; j < 7; j++) {
				for (k = 0; k < 10; k++) {
					if(DefaultEmailKB[j][k].contentEquals(aux) || SpecialEmailKB[j][k].contentEquals(aux)) {
						r=true;
						break;
					}
					else r=false;
				}
				if(DefaultEmailKB[j][k].contentEquals(aux) || SpecialEmailKB[j][k].contentEquals(aux)) break;
			}
			aux=email.substring(1);
			email=aux;
			aux="";
		}
		for (int i = 0; i < password.length(); i++) {
			c=password.charAt(0);
			aux+=c;
			for (int j = 0; j < 7; j++) {
				for (k = 0; k < 10; k++) {
					if(DefaultPasswordKB[j][k].contentEquals(aux) || SpecialPasswordKB[j][k].contentEquals(aux)) {
						r=true;
						break;
					}
					else r=false;
				}
				if(DefaultPasswordKB[j][k].contentEquals(aux) || SpecialPasswordKB[j][k].contentEquals(aux)) break;
			}
			aux=email.substring(1);
			email=aux;
			aux="";
		}
		return r;
	}

}
