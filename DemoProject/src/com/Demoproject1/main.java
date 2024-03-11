package com.Demoproject1;

import java.util.ArrayList;

public class main {

	public boolean isCarDriver(Travel carName) {
		return carName.getCategory().equals("Car");

	}

	public String retrivebyDriverId(ArrayList<Travel> database, int num) {
		for (Travel travel : database) {
			while (travel.getDriverId() == num) {
				if (travel != null) {
					System.out.println("Driver name is " + travel.getDriverName() + " belonging to the category "
							+ travel.getCategory() + " traveled " + travel.getTotalDistance() + " so far...");
					break;
				}

			}

		}

		return "";

	}

	public int retriveCountOfDriver(ArrayList<Travel> database, String name) {
		int count = 0;
		for (Travel travel : database) {
			if (travel.getCategory().equals(name)) {
				count++;
			} 

		}
		return count;

	}

	public ArrayList<Travel> retriveDriver(ArrayList<Travel> database, String name) {
		ArrayList<Travel> categoryArrayList = new ArrayList<>();
		for (Travel travel : database) {
			{
				if (travel.getCategory().equals(name)) {
					categoryArrayList.add(travel);

				} 
			}

		}

		return categoryArrayList;
	}

	public Travel retriveMaximumDistanceTravelledDriver(ArrayList<Travel> database) {
		Travel maxDistanceDriverTravel = null;
		int totalDistance = 0;
		for (Travel travel : database) {
			if (travel.getTotalDistance() > totalDistance) {
				totalDistance = travel.getTotalDistance();
				maxDistanceDriverTravel = travel;

			} 

		}

		return maxDistanceDriverTravel;
	}

}
