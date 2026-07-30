package Month1Review;

public class fleetManagementSystem {
	
	public static double calculateDriverPay(int deliveries, double ratePerDelivery) {
		
		double totalPay = deliveries * ratePerDelivery;
		
		if (deliveries >= 20) {
			
			totalPay +=50.00;
		}
		return totalPay;
	}

	public static boolean isHighPerformer(int deliveries) {
		
		if(deliveries >= 20) {
			return true;
		}else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		
		int[] deliveryCounts = {18, 25, 12, 30, 8};
		double payPerDelivery = 4.50;
				
		for (int delivery: deliveryCounts) {
			
			double driverPay = calculateDriverPay(delivery, payPerDelivery);
			boolean highPerformer = isHighPerformer(delivery);
			
			if (highPerformer) {
				System.out.println("Driver Pay: £"+ driverPay + " --> High Performer Bonus Earned!");
			}else {
				System.out.println("Driver Pay: £"+ driverPay);
			}
				
		}

	}

}
