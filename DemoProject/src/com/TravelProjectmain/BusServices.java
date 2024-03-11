package com.TravelProjectmain;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.TravelProject.BuseUser;
import com.TravelProject.Buses;

public class BusServices {
	public static Scanner sc = new Scanner(System.in);
	public static Map<Integer, Buses> map1 = new HashMap<>();

	public static List<Buses> DummyData() {
		Buses bus1 = new Buses("Raja Travels", 45, "6:00 PM", "Hyderbad", "Bengalore", 400, 1001);
		Buses bus2 = new Buses("Rama Travels", 45, "6:00 PM", "Hyderbad", "Chennai", 400, 1002);
		Buses bus3 = new Buses("vivek Travels", 45, "6:00 PM", "Hyderbad", "Mumbai", 400, 1003);
		Buses bus4 = new Buses("NN Travels", 45, "6:00 PM", "Bengalore", "Hyderbad", 400, 1004);
		Buses bus5 = new Buses("Mahesh Travels", 45, "6:00 PM", "Mumbai", "Hyderbad", 400, 1005);
		Buses bus6 = new Buses("NN Travels", 60, "6:00 PM", "Chennai", "Bengalore", 800, 1006);
		Buses bus7 = new Buses("NN Travels", 60, "6:00 PM", "Hyderbad", "Bengalore", 800, 1007);

		List<Buses> list = new ArrayList<>();
		list.add(bus1);
		list.add(bus2);
		list.add(bus3);
		list.add(bus4);
		list.add(bus5);
		list.add(bus6);
		list.add(bus7);
		return list;

	}

	public static List<Buses> plainJourney() {
		Print("Enter the Source:");
		String sourceString = sc.next();
		Print("Enter the Destination");
		String destinationString = sc.next();
		Print("Enter the Date...");
		String daString = sc.next();

		LocalDate date = LocalDate.parse(daString);

		LocalDate datenowDate = LocalDate.now();

		LocalDate datefutureDate = datenowDate.plusDays(30);
		List<Buses> buses = DummyData();
		List<Buses> matchingBuses = buses.stream().filter(obj -> obj.getSourceString().equalsIgnoreCase(sourceString)
				&& obj.getDestinationString().equalsIgnoreCase(destinationString)).collect(Collectors.toList());

		if ((date.isEqual(datenowDate)) || (date.isAfter(datenowDate) && date.isBefore(datefutureDate))) {

			if (matchingBuses.isEmpty()) {
				Print("Buses Not Found...!");
			} else {
				Print("Available Buses...!!");
				for (Buses buses2 : matchingBuses) {
					Print(buses2.toString());
				}

				Print("Enter Bus Id Number:");
				int busnumber = sc.nextInt();
				Buses selectedBuses = getBusId(matchingBuses, busnumber);
				if (selectedBuses != null) {
					Print(selectedBuses.toString());
					List<BuseUser> noPassengers = createBooking(sc, date, selectedBuses, daString);
					conformation(noPassengers);
					while (true) {
						Print("Press 1:You need edit the TravelDate");
						Print("Press 2: You need to print the Ticket");
						Print("Press 2:You want Exit");
						int userchoice = sc.nextInt();
						switch (userchoice) {
						case 1:
							editBusServices(noPassengers);
							break;
							
						case 2:
							printTicket(noPassengers);
						case 3:
							Services.menu();
							break;

						default:
							break;
						}
					}

				}

			}
		}

		else {
			Print("Date Is Not Valid or Bus is Not Available");
		}
		return matchingBuses;

	}

	public static List<BuseUser> createBooking(Scanner sc, LocalDate date, Buses matcBuses, String date1) {
		Print("Number Of Passengers:");
		int noOfPass = sc.nextInt();
		List<BuseUser> list = new ArrayList<>();
		int refId = new Random().nextInt(100000) + 150222;
		String dateString = date1;
		BuseUser[] buseUser = new BuseUser[noOfPass];

		for (int i = 0; i < noOfPass; i++) {
			buseUser[i] = new BuseUser();
			buseUser[i].setDateData(dateString);
			buseUser[i].setRefIdInteger(refId);
			Print("Enter passenger Name:");
			String passengerString = sc.next();
			Print("Enter age:");
			int age = sc.nextInt();
			int seatNumber = new Random().nextInt(45);
			buseUser[i].setAge(age);
			buseUser[i].setCustomerNameString(passengerString);
			buseUser[i].setSeatNInteger(seatNumber);

			int noOfseats1 = matcBuses.getNoOfSeatString();
			noOfseats1--;
			matcBuses.setNoOfSeatString(noOfseats1);
			int actualBusC = matcBuses.getBusCoString();
			int totalcost = actualBusC * noOfPass;
			if (date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY) {
				int extra = 200;
				totalcost = totalcost + extra;
				buseUser[i].setTotalCostDouble(totalcost);

			} else {
				buseUser[i].setTotalCostDouble(totalcost);

			}
			list.add(buseUser[i]);

		}

		return list;
	}

	public static BuseUser conformation(List<BuseUser> refId) {
		for (BuseUser buseUser : refId) {
			if (buseUser.getRefIdInteger() != null) {
				Print("Referance ID   : " + buseUser.getRefIdInteger());
				Print("Travel Date    : "+buseUser.getDateData());
				Print("Custtomer Name : " + buseUser.getCustomerNameString());
				Print("Seat Number    : " + buseUser.getSeatNInteger());
				Print("Customer Age   : " + buseUser.getAge());
				Print("Total Cost     : " + buseUser.getTotalCostDouble());
				Print("**************************************");
			}

		}
		Print("Booking Conformation Sucessfully");
		return null;

	}
	
	public static BuseUser printTicket(List<BuseUser> refId) {
		for (BuseUser buseUser : refId) {
			if (buseUser.getRefIdInteger() != null) {
				Print("Referance ID   : " + buseUser.getRefIdInteger());
				Print("Travel Date    : "+buseUser.getDateData());
				Print("Custtomer Name : " + buseUser.getCustomerNameString());
				Print("Seat Number    : " + buseUser.getSeatNInteger());
				Print("Customer Age   : " + buseUser.getAge());
				Print("Total Cost     : " + buseUser.getTotalCostDouble());
			}

		}
		return null;

	}

	public static Buses getBusId(List<Buses> matchingBuses, int busnu) {
		for (Buses buses : matchingBuses) {
			if (buses.getBusIDInteger() == busnu) {
				return buses;
			}

		}
		return null;
	}

	public static BuseUser editBusServices(List<BuseUser> busUser) {
		Print("Enter Your Referance Id :");
		int refId = sc.nextInt();
		Print("ENter the Travelling Date ");
		String dateString = sc.next();
		for (BuseUser busServices2 : busUser) {
			if (refId == busServices2.getRefIdInteger() && busServices2.getDateData().equals(dateString)) {
				Print("Enter the Modified the date yyyy/mm/dd");
				String datString1 = sc.next();
				busServices2.setDateData(datString1);
				Print("Modified Sucessfully");

			} else {
				throw new IllegalArgumentException("Enter Your Correct Ref ID or Date...!!");
			}

		}
		return null;
	}

	public static void Print(String print) {
		System.out.println(print);

	}

}
