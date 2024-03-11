package com.Loops;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		emailvalidation();
//		dateofJourney(scanner);
		LocalDate date = null;
		System.out.println("Enter Your Travel Date yyyy-mm-dd");
		date = LocalDate.parse(scanner.next());
		System.out.println("Enter Number Of Passengers");
		int noPassengers = 0;
		noPassengers = Integer.parseInt(scanner.next());
		while (noPassengers <= 0) {
			System.out.println("In Valid Passengers List");
			noPassengers = Integer.parseInt(scanner.nextLine());

		}
		final double BASE_FARE = 1000.0;
		final double WEEKEND_SURGE = 200.0;
		final double GST_RATE = 0.18;
		double totalfare;

		if (date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY) {
			totalfare = (BASE_FARE + WEEKEND_SURGE + GST_RATE) * (noPassengers);
			System.out.println(totalfare);

		} else {
			double normalfare = (BASE_FARE + GST_RATE)*(noPassengers);
			System.out.println(normalfare);

		}
	}

	private static void dateofJourney(Scanner scanner) {
		System.out.print("Enter the year:");
        int birthyear = scanner.nextInt();
        System.out.print("Enter the month 01-12:");
        int birthmonth = scanner.nextInt();
        System.out.print("Enter the date :");
        int birthdate = scanner.nextInt();
        LocalDate dateofJourneyString = LocalDate.of(birthyear, birthmonth, birthdate);
		
		
        DayOfWeek dayOfWeek = dateofJourneyString.getDayOfWeek();
        int dayof =dayOfWeek.getValue();
		if (dayof>=5) {
			System.out.println("Its a Staurday");		
			
		}
	}

	private static void emailvalidation() {
		String emailString = "bhanu@gmail.com";
		
		String string = "^[A-Za-z0-9+_.-]+@(.+)$"; 
		Pattern pattern = Pattern.compile(string);
		Matcher mathcherMatcher =pattern.matcher(emailString);
		if (mathcherMatcher.matches()) {
			System.out.println(emailString);
			
		}
		else {
			System.out.println("Its not valid");
		}
	}

}
