package com.deloitte.examples.keyboard;

public class EmailDe extends Keyboard {

	
	String key[][]= {{"1","2","3","4","5","6","7","8","9","0"},
			{"q","w","e","r","t","y","u","i","o","p"},
			{"a","s","d","f","g","h","j","k","l","-"},
			{"shift","shift","z","x","c","v","b","n","m","_"},
			{"@gmail.com","@gmail.com","@gmail.com","@yahoo.com","@yahoo.com","@yahoo.com","@yahoo.com","@hotmail.com","@hotmail.com","@hotmail.com"},
			{"!#$","!#$","@","@",".",".com",".com","backspace","backspace","backspace"},
			{"back","back","back","back","next","next","next","next","next","next"}};
	
	
	public EmailDe(int x_, int y_) {
		
		keys= this.key;
		x = x_;
		y = y_;
}
	}


