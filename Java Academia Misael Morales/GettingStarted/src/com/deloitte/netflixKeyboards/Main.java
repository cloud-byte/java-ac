package com.deloitte.netflixKeyboards;

import com.deloitte.netflixKeyboards.*;
import com.deloitte.netflixKeyboards.navigation.*;


public class Main {
	
	public static String res="";
	
	public static final String EMAIL = "g!!@java.com";
	public static final String PASSWORD = "hola123";
	

	public static void main(String[] args) {
		res=DefaultEmailKB.KBNavigation(EMAIL, res);
		res=DefaultPasswordKB.KBNavigation(PASSWORD, res);
		System.out.println(res);
	}

}
