package Month2Lesson3;

public class Main {

	public static void main(String[] args) {
		Package package1 = new Package("FRC23829389283P", "Tokyo", -5.0 );
		
		System.out.println(package1.getTrackingNumber());
		System.out.println(package1.getDestination());
		package1.markAsDelivered();
	}

}
