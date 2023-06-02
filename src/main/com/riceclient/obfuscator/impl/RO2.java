package com.riceclient.obfuscator.impl;

import com.riceclient.obfuscator.StringObfuscator;

public class RO2 extends StringObfuscator {

	public RO2(int key) {
		super(key);
	}

	@Override
	protected String obfuscation(boolean reverse, String message) {
		String output = "";
		
		for(char c : message.toCharArray()) {
			if(reverse){
				c += getKey() * 2;
				c /= getKey();
			}else {
				c *= getKey();
				c -= getKey() * 2;
			}
			output += c;
		}
		
		return output;
	}
	
}
