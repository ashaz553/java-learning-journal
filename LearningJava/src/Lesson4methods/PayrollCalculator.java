package Lesson4methods;

public class PayrollCalculator {
	
	public static double calculatePay(double hoursWorked, double 	hourlyRate) {
		double totalPay = hoursWorked * hourlyRate;
		return totalPay;
	}

	public static void main(String[] args) {
		double standardPay = calculatePay(40.0, 18.50);
		System.out.println("Total standard Pay: $" + standardPay);
		
	}

}
