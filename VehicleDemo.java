package assignment_2;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleDemo {

	public static void main(String[] args) {
		//creating list of vehicle object
		ArrayList<Vehicle> listOfVehiicle = new ArrayList<>();

		//taking input from console
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of vehicles: ");
		int noOfVehicles = input.nextInt();
		for (int i = 0; i < noOfVehicles; i++) {
			try {
				System.out.println("Enter vehicle name: ");
				String name = input.next();
				System.out.println("Enter vehicle fuel type: ");
				String fuelType = input.next();
				System.out.println("Enter number of wheel: ");
				int numWheels = input.nextInt();
				System.out.println("Enter vehicle make year: ");
				int makeYear = input.nextInt();
				Vehicle vehicle = new Vehicle(name, fuelType, numWheels, makeYear);
				listOfVehiicle.add(vehicle);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//printing content of object
		for(Vehicle vehicle: listOfVehiicle) {
			System.out.println("=======Printing the object before the method is called=====");
			System.out.println(vehicle);
			System.out.println("=============================");
			vehicle.assignVehicleMaxSpeed();
			vehicle.calculateVehiclePrice();
			System.out.println("=======Printing the object after the method is called=====");
			System.out.println(vehicle);
			System.out.println("=============================");
			
		}
		

	}

}
