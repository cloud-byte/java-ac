package com.deloitte.netflixKeyboards.navigation;

import com.deloitte.netflixKeyboards.Keyboards;

public class SpecialEmailKB extends Keyboards {

	private static int initialPosX = 0;
	private static int initialPosY = 5;
	
	public String[] KBNavigation(String email, String res) {
		String[] valores = null;
		
		valores[0]=email;
		valores[1]=res;
		return valores;
	}

}
