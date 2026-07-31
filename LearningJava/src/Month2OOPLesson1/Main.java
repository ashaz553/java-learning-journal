package Month2OOPLesson1;

public class Main {

	public static void main(String[] args) {
		
		Package parcel1 = new Package();
		Package parcel2 = new Package();
		
		parcel1.trackingNumber = "C5564322EPX";
		parcel1.destination = "Toronto";
		parcel1.weightKg = 5.4;
		
		parcel2.trackingNumber = "P5564322RGF";
		parcel2.destination = "Miami";
		parcel2.weightKg = 3.5;
		

		parcel1.printPackageSummary();
		parcel1.printPackageSummary();
		parcel1.markAsDelivered();
		parcel1.printPackageSummary();
	}

}
