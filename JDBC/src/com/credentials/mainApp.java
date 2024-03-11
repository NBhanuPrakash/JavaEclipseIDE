package com.credentials;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class mainApp {

	public static boolean exit = true;
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		try {
			Connection connection = DbUtilties.getDbConnection(Dbusercredentials.DBURL_STRING,
					Dbusercredentials.USER_STRING, Dbusercredentials.PSSWORD_STRING);
			Statement statement = DbUtilties.statementConnect(connection);
			String operations = menuOperations(sc);
			DbUtilties.excute(statement, operations);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String menuOperations(Scanner sc) {
		print("");
		print("0. Sql Table Creation Statement");
		print("1. Alter Table");
		print("2. Rename the Table");
		print("3. Truncate the Table");
		print("4. Drop the Table");
		print("5. Insert");
		print("6. Delete");
		print("7. Update");
		print("choice the Option...");

		while (exit) {

			int userChoice = sc.nextInt();
			sc.nextLine();

			switch (userChoice) {
			case 0:
				return tableCreation();
				
			case 1:
				return altertable();
				
			case 2:
				return renameTable();
				
			case 3:
				return truncateTable();
				
			case 4:
				return dropTable();
				
			case 5:
			default:
				break;
			}

		}
		return "";
	}

	public static String tableCreation() {

		print("Enter the Table Name:");
		String tableNString = sc.next();
		print("Enter the Number Of column:");
		int noOfcol = sc.nextInt();
		sc.nextLine();

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("create table ").append(tableNString).append(" (");

		for (int i = 1; i <= noOfcol; i++) {
			print("ENter Column " + i + " Name: ");
			String column1 = sc.nextLine();
			print("Enter Data Type: ");
			String dataTypeString = sc.nextLine();
			stringBuilder.append(column1).append(" ").append(dataTypeString);
			if (i < noOfcol) {
				stringBuilder.append(", ");

			}
		}
		stringBuilder.append(");");
		System.out.println("Sql table creation Statement ");
		String createtableQueryString = stringBuilder.toString();
		System.out.println(createtableQueryString);

		return createtableQueryString;
	}
	
//	Alter the Table //
	
	public static String altertable() {
		print("1. Add Column");
		print("2. Modify column");
		print("3. Drop column");
		print("Choice Your Option");
		
		while(exit) {
			int userChoice = sc.nextInt();
			
			switch (userChoice) {
			case 1:
				return addColumn();
				
			case 2:
				return modifyColumn();
				
			case 3:
				return dropColumn();
				
				
			default:
				break;
			}
		}
		return "";
	}
	
//	addColumn //
	
	public static String addColumn() {
		print("ENter the Table Name:");
		String tableNString = sc.next();
		print("Column Name:");
		String columnNString = sc.next();
		print("Enter the DataType:");
		sc.nextLine();
		String dataTypeString = sc.nextLine();
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("alter table ").append(tableNString).append(" add column ").append(columnNString).append(" ").append(dataTypeString).append(";");
		String addprintString = stringBuilder.toString();
		System.out.println(addprintString);
		return addprintString;
	}
	
//	modify Column //
	
	public static String modifyColumn() {
		print("ENter the Table Name:");
		String tableNString = sc.next();
		print("Column Name:");
		String columnNString = sc.next();
		print("Enter the DataType:");
		sc.nextLine();
		String dataTypeString = sc.nextLine();
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("alter table ").append(tableNString).append(" modify column ").append(columnNString).append(" ").append(dataTypeString).append(";");
		String modifyCOlumnP = stringBuilder.toString();
		System.out.println(modifyCOlumnP);
		return modifyCOlumnP;
	}
	
//	Drop Column //
	
	public static String dropColumn() {
		print("ENter the Table Name:");
		String tableNString = sc.next();
		print("Column Name:");
		String columnNString = sc.next();
		print("Enter the DataType:");
		sc.nextLine();
		String dataTypeString = sc.nextLine();
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("alter table ").append(tableNString).append(" modify column ").append(columnNString).append(" ").append(dataTypeString).append(";");
		String dropPrint = stringBuilder.toString();
		System.out.println(dropPrint);
		return dropPrint;

	}
	
//	 Rename Table //
	
	public static String renameTable() {
		print("ENter the old Table Name:");
		String tableNString = sc.next();
		
		print("ENter the New Table Name:");
		String newtableN = sc.next();
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("rename table ").append(tableNString).append(" to ").append(newtableN).append(";");
		String rename = stringBuilder.toString();
		System.out.println(rename);
		return rename;
		
		
	}
	
//	Truncate Table //
	
	public static String truncateTable() {
		print("ENter the Table Name:");
		String tableNString = sc.next();
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("truncate table ").append(tableNString).append(";");
		
		String truncate = stringBuilder.toString();
		System.out.println(truncate);
		return truncate;
		
	}
	
//	Drop Table  //
	
	
	public static String dropTable() {
		print("ENter the Table Name:");
		String tableNString = sc.next();
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("drop table ").append(tableNString).append(";");
		
		String dropString = stringBuilder.toString();
		System.out.println(dropString);
		return dropString;
	}
	
//	Insert Table //
	

	
	
	public static void print(String print) {
		System.out.println(print);
	}

}
