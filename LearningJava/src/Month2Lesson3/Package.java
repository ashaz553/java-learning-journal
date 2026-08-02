package Month2Lesson3;

public class Package {
	private String trackingNumber;
	private String destination;
	private double weightKg;
	private boolean isDelivered;
	
	public Package(String trackingNumber, String destination, double weightKg) {
		this.trackingNumber = trackingNumber;
		this.destination = destination;
		setWeightKg(weightKg);
		this.isDelivered = false;
	}

	public String getTrackingNumber() {
		return trackingNumber;
	}
	
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		if(destination != null && !destination.isEmpty()) {
			this.destination = destination;
		}
	}
	public double getWeightKg() {
		return weightKg;
	}
	public void setWeightKg(double weightKg) {
		if(weightKg > 0) {
			this.weightKg = weightKg;
		}else {
			System.out.println("Error in weight");
			this.weightKg = 1.0;
		}
	}
	public void markAsDelivered() {
		isDelivered = true;
		System.out.print("Parcel has been delivered");
	}
	
}
