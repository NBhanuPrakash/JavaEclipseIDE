package TravelMangementSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.ResourceBundle.Control;

import com.POJOS.Controller;
import com.POJOS.Register;

public class Main {

	public static Scanner sc = new Scanner(System.in);
	public static boolean exitFlag = true;

	public static void main(String[] args) {
		Controller controller = new Controller().getInstatance();

		Connection connect = controller.connect();

		if (connect == null) {
			Print("DB COnnection Is Error..!");
		}

		try {
			controller.populationTravle(connect);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (exitFlag) {
			Print("Press :1 Craete Account");
			Print("Press :2 Login Account");
			Print("Press :3 Plan Journey");
			Print("Enter Your option");

			int userChoice = sc.nextInt();

			switch (userChoice) {
			case 1:
				try {
					Register.account(connect);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;

			case 2:
				try {
					ResultSet executeQuery = loginBoolean(connect);
					if (!executeQuery.next()) {
						Print("Your Enter Invalid credentials");
						loginBoolean(connect);
					} else {
						while (exitFlag) {
							Print("Press 1 : Plan Journey");
							Print("Press 2 : Edit Plan Journey");
							Print("Press 1 : Ticket Journey");
							Print("Press 1 : LogOut");
							Print("Enter Your option");
							
							int userChoice1 =sc.nextInt();
							
							switch (userChoice1) {
							case 1:
								controller.planJourney(connect);
								break;

							default:
								break;
							}

						}
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}

			default:
				break;
			}
		}

	}

	public static void Print(String printString) {
		System.out.println(printString);
	}

	public static ResultSet loginBoolean(Connection connection) throws SQLException {
		PreparedStatement prepareStatement = connection
				.prepareStatement("select * from user where emailid=? and password=?");
		Print("Enter Email Id :");
		String emailId = sc.next();
		Print("ENter Your Password :");
		String password = sc.next();

		prepareStatement.setString(1, emailId);
		prepareStatement.setString(2, password);

		ResultSet execute = prepareStatement.executeQuery();

		return execute;

	}
}
