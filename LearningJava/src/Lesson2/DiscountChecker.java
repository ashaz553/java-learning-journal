package Lesson2;

public class DiscountChecker {

	public static void main(String[] args) {
		double originalPrice = 59.99;
		int age = 60;
		boolean isStudent = false;
		double finalPrice;
		
		if (isStudent) {
			finalPrice = originalPrice * 0.80;
			System.out.println("Student discount applied.");
		}else if (age > 65) {
			finalPrice = originalPrice * 0.90;
			System.out.println("Senior citizen discount applied.");
		}else {
			finalPrice = originalPrice;
			System.out.println("Standard pricing.");
		}
		
		System.out.printf("Final Price: £%.2f%n", finalPrice);

	}

}
