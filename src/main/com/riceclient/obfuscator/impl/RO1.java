package com.riceclient.obfuscator.impl;

import com.riceclient.obfuscator.StringObfuscator;

public class RO1 extends StringObfuscator {

	public RO1(int key) {
		super(key);
	}
	
	@Override
	protected String obfuscation(boolean reverse, String message) {
		String output = "";
		
		for(char c : message.toCharArray()) {
			if(reverse) c += getKey();
			else c -= getKey();
			output += c;
		}
		return output;
	}
	
}
