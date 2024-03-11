package com.System.restart.shutdown.Logoff;
import java.util.*;

public class SystemPrograme {
	
	static boolean exit = true;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		System.out.println("Enter 1 : ShutDown...");
		System.out.println("Enter 2 : Restart...");
		System.out.println("Enter 3 : LogOff...");
		int userchoice = sc.nextInt();
		while(exit) {
			switch(userchoice) {
			
			case 1:{
				String command = "shutdown -s -t 15";
				Runtime.getRuntime().exec(command);
			}
			case 2:{
				String restart = "shutdown -r -t 10";
				Runtime.getRuntime().exec(restart);
			}
			case 3:{
				String command = "shutdown -l";
				Runtime.getRuntime().exec(command);
			}
			}
			
		}
		
		
	}
	

}
