package Month2OOPLesson1;

public class Main {

	public static void main(String[] args) {
		
		Package parcel1 = new Package("C5564322EPX", "Toronto", 6.9);
		Package parcel2 = new Package("P5564322RGF", "Miami");
		
		parcel1.printPackageSummary();
		parcel2.printPackageSummary();
		parcel1.markAsDelivered();
		parcel1.printPackageSummary();
	}

}
