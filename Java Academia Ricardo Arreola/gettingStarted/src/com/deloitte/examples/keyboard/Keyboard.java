package com.deloitte.examples.keyboard;

public class Keyboard {
	
	protected String[][] keys;
	protected int x;
	protected int y;
	
	public void Keyboard (String[][] keys, int x, int y) {
		
		this.keys = keys;
		this.x = x;
		this.y = y;
		
	}

	public String[][] getKeys() {
		return keys;
	}


	public void setKeys(String[][] keys) {
		this.keys = keys;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	
}
