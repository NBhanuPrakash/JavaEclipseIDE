package com.restart;

public class Restart {
	public static void main(String[] args) throws Exception  {
		String restart = "shutdown -r -t 10";
		Runtime.getRuntime().exec(restart);
	}

}