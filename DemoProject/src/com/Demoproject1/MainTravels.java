package com.Demoproject1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainTravels  {
	public static void main(String[] args) {
		
		
		Travel num = new Travel("Car", 24256, "Rajesh", 4587);
		ArrayList<Travel> dataArrayListt = DummyData();
		main shjMain = new main();
		System.out.println(shjMain.isCarDriver(num));
		System.out.println(shjMain.retrivebyDriverId(dataArrayListt, 24256));
		System.out.println(shjMain.retriveCountOfDriver(dataArrayListt, "SuvCar"));
		System.out.println(shjMain.retriveDriver(dataArrayListt, "MiniCar"));
		System.out.println(shjMain.retriveMaximumDistanceTravelledDriver(dataArrayListt));

	}

	private static ArrayList<Travel> DummyData() {
		Travel driver1 = new Travel("Car", 24256, "Rajesh", 4587);
		Travel driver2 = new Travel("MiniCar", 24257, "Bhanu", 4200);
		Travel driver3 = new Travel("SuvCar", 24258, "Dheeru", 2567);
		Travel driver4 = new Travel("Eicher", 24259, "Ramseh", 8500);
		ArrayList<Travel> adding = new ArrayList<Travel>();
		adding.add(driver4);
		adding.add(driver3);
		adding.add(driver2);
		adding.add(driver1);
		Comparator<Travel> Length = new Comparator<Travel>() {

			@Override
			public int compare(Travel name1, Travel name2) {
				return name1.getDriverName().compareTo(name2.getDriverName());
			}
		};
		Collections.sort(adding,Length);
		System.out.println(adding);
		Comparator<Travel> lengthcComparator = new Comparator<Travel>() {

			@Override
			public int compare(Travel name1, Travel name2) {
				return name1.getCategory().length()>name2.getCategory().length()?1:-1;
			}
		};
		Collections.sort(adding,lengthcComparator);
		System.out.println(adding);
		return adding;
	}

	

	

}
