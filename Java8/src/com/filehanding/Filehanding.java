package com.filehanding;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Filehanding {

	public static void main(String[] args) throws IOException {
//		readFormatData();
//		fileexit();
		bufferreader();
	}

	public static void readFormatData() throws IOException {
		File file = new File("D:\\S3\\Hello.txt");
		FileInputStream inputStream = new FileInputStream(file);
		FileOutputStream outputStream = new FileOutputStream("D:\\S3\\Data.txt");
		int i;

		try {
			while ((i = inputStream.read()) != -1) {
				System.out.print((char) i);
				outputStream.write(i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputStream.close();
		outputStream.close();
	}
	
	public static void bufferreader() throws IOException {
		BufferedReader rdBufferedReader= new BufferedReader(new FileReader("D:\\S3\\BHANu.txt"));
		String currentlineString;
		while((currentlineString = rdBufferedReader.readLine()) != null) {
			System.out.println(currentlineString);
			
		}
		rdBufferedReader.close();
	}

	public static void fileexit() throws FileNotFoundException {
		File f1 = new File("D:\\S3\\Data.txt");
		File f2 = new File("D:\\S3\\Data1.txt");
		System.out.println("  ");
		System.out.println("**********************************************");
		System.out.println(f1.exists());
		System.out.println(f2.exists());
	}

}

