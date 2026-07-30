package Month2OOP;

public class Main {

	public static void main(String[] args) {
		
		DeliveryTruck truck1 = new DeliveryTruck();
		truck1.truckId = "PK-TRK-1";
		truck1.driverName = "Aamar Shahzad";
		truck1.currentFuel = 80.00;
		truck1.cargoCapacity = 150;
		
		DeliveryTruck truck2 = new DeliveryTruck();
        truck2.truckId = "UK-TRK-02";
        truck2.driverName = "Jordan";
        truck2.currentFuel = 60.0;
        truck2.cargoCapacity = 100;
        
        truck1.displayTruckDetails();
        truck1.drive(50);
        truck1.displayTruckDetails();
        
        truck2.displayTruckDetails();

	}

}
