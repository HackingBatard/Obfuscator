package com.riceclient.obfuscator;

public abstract class StringObfuscator {
	
	private int key;
	
	public StringObfuscator(int key) {
		this.key = key;
	}
	
	public String encode(String message) {
		return obfuscation(false, message);
	}
	
	public String decode(String message) {
		return obfuscation(true, message);
	}
	
	protected abstract String obfuscation(boolean reverse, String message);
	
	public int getKey() {
		return key;
	}
	
}
