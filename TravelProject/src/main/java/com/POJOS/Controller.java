package com.POJOS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;



public class Controller {
	
	public static ArrayList<BusService> busServicesList;
	
	
	 
	public static BusService busService;

	private static Controller obj;
	
	public static Scanner sc = new Scanner(System.in);

	public static Controller getInstatance() {
		if (obj == null) {
			obj = new Controller();
		}
		return obj;
	}
	
	
	
	public void planJourney(Connection connection) throws SQLException {
		Print("Enter the Source:");
		String sourceString = sc.next();
		Print("Enter the Destination");
		String destinationString = sc.next();
		Print("Enter the Date...");
		String daString = sc.next();
		
		LocalDate date = LocalDate.parse(daString);
		LocalDate dateNowDate = LocalDate.now();
		LocalDate datOfDepture = date.plusDays(30);
		

		
		if (date.isAfter(dateNowDate) || date.isEqual(dateNowDate) || date.isBefore(datOfDepture)) {
			busList(connection, sourceString, destinationString);

		int int1 = busId(connection);
			if (int1==0) {
				throw new Exception("Bus Id DIDN'T MAtch...!");
			}
			else {
				while(true) {
					Print("Press 1: Book the Ticket");
					Print("Press 2: exit");
					Print("Enter Your Choice");
					
					int userChoice3 = sc.nextInt();
					
					switch (userChoice3) {
					case 1:
//						createBooking(date,int1,daString);
						break;

					default:
						break;
					}
				}
			}
			
			
		}
		
		
	}
//	
//	public static List<BusService> createBooking( LocalDate date, int busId, String date1) {
//		Print("Number Of Passengers:");
//		int noOfPass = sc.nextInt();
//		int refId = new Random().nextInt(100000) + 150222;
//		String dateString = date1;
//		BusService[] buseUser = new BusService[noOfPass];
//
//		for (int i = 0; i < noOfPass; i++) {
//			buseUser[i] = new BusService();
//			buseUser[i].setDateData(dateString);
//			buseUser[i].setRef_Id(refId);
//			Print("Enter passenger Name:");
//			String passengerString = sc.next();
//			Print("Enter age:");
//			int age = sc.nextInt();
//			int seatNumber = new Random().nextInt(45);
//			buseUser[i].setAge(age);
//			buseUser[i].setCustomerString(passengerString);
//			buseUser[i].setSeatNum(seatNumber);
//
//			int totalcost = actualBusC * noOfPass;
//			buseUser[i].setDateData(dateString);
//			buseUser[i].setDestinationString(dateString);
//			if (date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY) {
//				int extra = 200;
//				totalcost = totalcost + extra;
//				buseUser[i].setTotalCost(totalcost);
//
//			} else {
//				buseUser[i].setTotalCost(totalcost);
//
//			}
//			
//			busServicesList.add(buseUser[i]);
//
//		}
//
//		return busServicesList;
//	}

	
	
	

//	DB COnnceton using MYSQL
	public Connection connect() {
		try {
			Connection connection = DriverManager.getConnection(Dbusercredentials.DBURL_STRING, Dbusercredentials.USER_STRING, Dbusercredentials.PSSWORD_STRING);
			return connection;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

	

	
//	Read Operations for Bus
	public ArrayList<Bus> populationTravle(Connection connection) throws SQLException {
		
		String SQL = "select * from bus";
		
		Statement createStatement = connection.createStatement();
		
		ResultSet execute = createStatement.executeQuery(SQL);
		
		List<Bus> bus = new ArrayList<>();
		
		while(execute.next()) {
			String string = execute.getString(1);
			int noOfSeats = execute.getInt(2);
			String string3 = execute.getString(3);
			String string4 = execute.getString(4);
		    int avilbleSeats = execute.getInt(5);
			String string6 = execute.getString(6);
			int busCost = execute.getInt(7);
			int buId = execute.getInt(8);
			Bus bus1 = new Bus(string, noOfSeats, string3, string4, avilbleSeats, string6, busCost, buId);
			bus.add(bus1);
			


		}
		return null;
		

	}
	
//	Create User Operation
	
	public static void createUser(Connection connection, PersonUser user) throws SQLException {
		PreparedStatement prepareStatement = connection.prepareStatement("insert into user values(?,?,?,?,?);");
		prepareStatement.setString(1, user.getEmailIdString());
		prepareStatement.setString(2, user.getPasswordString());
		prepareStatement.setString(3, user.getFullName());
		prepareStatement.setString(4,user.getMobileNString() );
		prepareStatement.setString(5, user.getGenderString());
		prepareStatement.execute();
	}
	

	
	private void busList(Connection connection, String sourceString, String destinationString) throws SQLException {
		PreparedStatement prepareStatement = connection.prepareStatement("select * from bus");
		ResultSet executeQuery = prepareStatement.executeQuery();
		while(executeQuery.next()) {
			if (executeQuery.getString(4).equalsIgnoreCase(sourceString) && executeQuery.getString(6).equalsIgnoreCase(destinationString)) {
				Print("busname     : "+executeQuery.getString(1));
				Print("noOfseat    : "+executeQuery.getString(2));
				Print("time        : "+executeQuery.getString(3));
				Print("source      : "+executeQuery.getString(4));
				Print("avilbleSeat : "+executeQuery.getString(5));
				Print("destination : "+executeQuery.getString(6));
				Print("busCOst     : "+executeQuery.getString(7));
				Print("busId       : "+executeQuery.getString(8));
				Print("**************************************************");
			}
		}
	}

	public static int busId(Connection connection) throws SQLException {
		Print("Enter the  Bus Id :");
		int busId = sc.nextInt();
		PreparedStatement prepareStatement = connection.prepareStatement("Select * from bus where busId=?");
		prepareStatement.setInt(1, busId);
		ResultSet execute = prepareStatement.executeQuery();
		int num=0;
		while(execute.next()) {
			num = execute.getInt(8);
		}
		return num;
	}
	
	public static void Print(String printString) {
		System.out.println(printString);
	}

}
