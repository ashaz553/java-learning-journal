package Month2OOPLesson1;

public class Package {
	
	String trackingNumber;
	String destination;
	double weightKg;
	boolean isDelivered;
	
	public Package(String trackingNumber, String destination, double weightKg) {
		this.trackingNumber = trackingNumber;
		this.destination = destination;
		this.weightKg = weightKg;
		this.isDelivered = false;
	}
	
	public Package(String trackingNumber, String destination) {
		this.trackingNumber = trackingNumber;
		this.destination = destination;
		this.weightKg = 1.0;
		this.isDelivered = false;
	}
	
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
