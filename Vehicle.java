package assignment_2;

public class Vehicle {
	// 1.instance variables
	private String name;
	private double price;
	private int maxSpeed;
	private String fuelType;
	private int numWheels;
	private int makeYear;

	// 2.constructor
	public Vehicle(String name, String fuelType, int numWheels, int makeYear) {
		this.name = name;
		this.fuelType = fuelType;
		this.numWheels = numWheels;
		this.makeYear = makeYear;
	}

	//3.toString
	@Override
	public String toString() {
		return "Vehicle Name is: " + name + "\nVehicle Make Year is: " + makeYear + "\nVehicle Price is: " + price
				+ "\nVehicle Max Speed is: " + maxSpeed + "\nVehicle Fuel Type is: " + fuelType
				+ "\nNumber of wheels is: " + numWheels;
	}

	//4.two methods
	public void assignVehicleMaxSpeed() {
		if (this.numWheels == 4 && this.fuelType.equals("Petrol")) {
			this.maxSpeed = 100;
		} else if (this.numWheels == 4 && this.fuelType.equals("Diesel")) {
			this.maxSpeed = 80;
		} else if (this.numWheels == 2 && this.fuelType.equals("Petrol")) {
			this.maxSpeed = 60;
		} else if (this.numWheels == 2 && this.fuelType.equals("Diesel")) {
			this.maxSpeed = 40;
		}

	}

	public void calculateVehiclePrice() {

		if (this.makeYear >= 2012 && this.numWheels == 4) {
			this.price = 50000;
		} else if (this.makeYear < 2012 && this.numWheels == 4) {
			this.price = 30000;
		} else if (this.makeYear >= 2012 && this.numWheels == 2) {
			this.price = 20000;
		} else if (this.makeYear < 2012 && this.numWheels == 2) {
			this.price = 10000;
		}
	}

}
