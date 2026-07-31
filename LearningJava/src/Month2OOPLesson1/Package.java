package Month2OOPLesson1;

public class Package {
	
	String trackingNumber;
	String destination;
	double weightKg;
	boolean isDelivered;
	
	public void markAsDelivered() {
		isDelivered = true;
		System.out.println("Package " + trackingNumber + " has been delivered!");
	}
	
	public void printPackageSummary() {
		System.out.println(trackingNumber);
		System.out.println(destination);
		System.out.println(weightKg);
		System.out.println(isDelivered);
	}

}
