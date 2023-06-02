package com.riceclient.utils;

public class Logger {
	
	private String program;
	
	public Logger(String program) {
		this.program = program;
	}
	
	private void log(String message, String type) {
		System.out.println("[" + program + "]" + "[" + type + "]: " + message);
	}
	
	public void info(String message) {
		log(message, "INFO");
	}
	
	public void warn(String message) {
		log(message, "WARNING");
	}
	
	public void error(String message) {
		log(message, "ERROR");
	}
	
}
