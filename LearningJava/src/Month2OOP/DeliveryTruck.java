package Month2OOP;

public class DeliveryTruck {

	String truckId;
	String driverName;
	double currentFuel;
	int cargoCapacity;
	
	//Methods
	
	public void  drive(double distanceMiles) {
		double fuelUsed = distanceMiles * 0.2;
		currentFuel -= fuelUsed;
		System.out.println("Truck " + truckId +" drove " + distanceMiles + " miles ");
	}
	
	public void  displayTruckDetails() {
		System.out.println("---------------------------");
        System.out.println("Truck ID: " + truckId);
        System.out.println("Driver: " + driverName);
        System.out.println("Fuel Level: " + currentFuel + "L");
        System.out.println("---------------------------");
	}
}
