package com.logoff;

public class LogOff {
	public static void main(String[] args) throws Exception {
		String command = "shutdown -l";
		Runtime.getRuntime().exec(command);
	}

}
