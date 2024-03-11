package com.TravelProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Logofile {

	public static void fileread() throws IOException {
		File file = new File("D:\\S3\\BHAnu.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		int data;
		try {

			while ((data = fileInputStream.read()) != -1) {
				System.out.print((char) data);
			}
			System.out.println(" ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		fileInputStream.close();

	}
}
