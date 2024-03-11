package com.LibraryManagement_user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Library_main_System {

	static Scanner scanner = new Scanner(System.in);
	static boolean exit = true;
	static Map<String, Book_User> map = new HashMap<>();
	static Map<String, Library_User> map2 = new HashMap<>();
	static Map<Integer, Member_User> map3 = new HashMap<>();

	public static void main(String[] args) {
		while (exit) {
			print("");
			print("Press :- 1 Create a MemberShip.....");
			print("Press :- 2 Login TO The Library");
			int userChioce = scanner.nextInt();

			switch (userChioce) {
			case 1: {
				createAccount();

				break;
			}
			case 2: {
				print("Enter Your Library Number..");
				int number = scanner.nextInt();
				Member_User memeber1 = map3.get(number);

				if (memeber1 == null) {
					System.out.println("please Enter Your Valid Id Number...:)");

				} else {
					while (exit) {
						print("");
						print("Press :- 1 Add Book.....");
						print("Press :- 2 Display Book.....");
						print("Press :- 3 Search Book.....");
						print("Press :- 4 Issue Book.....");
						print("Press :- 5 Return Book.....");
						print("Press :- 6 LogOut.....");

						int userchioce1 = scanner.nextInt();

						switch (userchioce1) {

						case 1:
							addBook();

							break;

						case 2:
							List<Book_User> book_Users = libraryBooks();

							System.out.println(book_Users);
							break;
							
						case 3:
							System.out.println("Enter the Book Name");
							String booknameString= scanner.next();
							List<Book_User> searchBook_Users=libraryBooks();
							boolean result=searchBook_User(searchBook_Users, booknameString);
							System.out.println(result);

						}
						

					}

				}

			}

			}

		}
	}

	public static void createAccount() {
		String nameString = captureName();
		Integer idNumberInteger = captureId();
		Member_User member = new Member_User(nameString, idNumberInteger, null);
		map3.put(idNumberInteger, member);
		List<Member_User> list = new ArrayList<>();
		list.add(member);

	}

	public static String captureName() {
		System.out.println("Enter Your Name");
		String nameString = scanner.next();

		return nameString;

	}

	public static Integer captureId() {
		System.out.println("Enter Your New Library Number");
		int idNumber = scanner.nextInt();
		return idNumber;

	}

	public static List<Book_User> libraryBooks() {
		Book_User book1 = new Book_User("Java Coders", "James gasling", "ISBN-001", 40, 40);
		Book_User book2 = new Book_User("SQL Coders", "James gasling", "ISBN-001", 50, 50);
//		Book_User book3 = new Book_User("JDBC Coders", "James gasling", "ISBN-001", 80, 80);
//		Book_User book4 = new Book_User("Hibernet Coders", "James gasling", "ISBN-001", 200, 200);
//		Book_User book5 = new Book_User("Spring FrameWorks", "James gasling", "ISBN-001", 40, 40);
//		Book_User book6 = new Book_User("Spring Boot Coders", "James gasling", "ISBN-001", 420, 420);
//		Book_User book7 = new Book_User("MicroServices Coders", "James gasling", "ISBN-001", 40, 40);
//		Book_User book8 = new Book_User("JSP Servlet", "James gasling", "ISBN-001", 40, 40);
//		Book_User book9 = new Book_User("W3C Books", "James gasling", "ISBN-001", 20, 20);
//		Book_User book10 = new Book_User("How to Build a Logic", "James gasling", "ISBN-001", 20, 20);
		List<Book_User> booklistBook = new ArrayList<>();
		booklistBook.add(book1);
		booklistBook.add(book2);
//		booklistBook.add(book3);
//		booklistBook.add(book4);
//		booklistBook.add(book5);
//		booklistBook.add(book6);
//		booklistBook.add(book7);
//		booklistBook.add(book8);
//		booklistBook.add(book9);
//		booklistBook.add(book10);
		

		return booklistBook;

	}

	public static List<Book_User> addBook() {
		System.out.println("Enter Book Name");
		String booknameString = scanner.next();
		System.out.println("Enter the Book Author");
		String authornameString = scanner.next();
		System.out.println("Enter the ISBN Number");
		String isbnNumberString = scanner.next();
		System.out.println("Enter Number Of Copies");
		int numberOfCopies = scanner.nextInt();
		System.out.println("Enter Number Of Copies Availbale");
		int availbleCopies = scanner.nextInt();

		Book_User addboooks = new Book_User(booknameString, authornameString, isbnNumberString, numberOfCopies,
				availbleCopies);
		List<Book_User> booklist = new ArrayList<>();
		booklist.add(addboooks);
		return booklist;
	}
	
	public static boolean searchBook_User(List<Book_User> database, String title) {
		for (Book_User book_User : database) {
			if (title.equals(book_User.getTitileString())) {
				System.out.println("Titile Name"+book_User.getTitileString()); 
				System.out.println("Author Name"+book_User.getAuthorString()); 
				System.out.println("ISBN Number"+book_User.getIsbnString()); 
				System.out.println("Availble Copies"+book_User.getAvilableCopiesInteger()); 
				
			}
			else {
				System.out.println("In this Name There Is No Book...");
			}
			
		}
		
		return false;
	}

	public static void print(String msg) {
		System.out.println(msg);
	}

}
