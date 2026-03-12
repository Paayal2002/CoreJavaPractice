package Controlflow.switcj;

public class VehicleType {

	public static void main(String[] args) {

		int vehicle = 2;

		switch (vehicle) {
		case 1:
			System.out.println("Bike");
			break;

		case 2:
			System.out.println("Car");
			break;

		case 3:
			System.out.println("Bus");
			break;

		case 4:
			System.out.println("Truck");
			break;

		default:
			System.out.println("Invalid Vehicle");
		}
	}
}
