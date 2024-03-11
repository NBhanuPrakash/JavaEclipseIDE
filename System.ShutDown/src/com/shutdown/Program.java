package com.shutdown;

import java.io.IOException;

public class Program {
	public static void main(String[] args) {
		String command = "shutdown -s -t 15";
		try {
			Runtime.getRuntime().exec(command);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
