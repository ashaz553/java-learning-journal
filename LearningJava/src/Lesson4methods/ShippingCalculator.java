package Lesson4methods;

public class ShippingCalculator {
	
	public static double calculateShippingFee(double weightKg, boolean isExpress) {
		
		double baseFare = weightKg * 2.50;
		
		if(isExpress) {
			
			baseFare +=10.00; //Extra $10 for Express delivery
		}
		
		return baseFare;
	}
	
	public static void main(String[] args) {
		double parcel1 = calculateShippingFee(2.5, false);
		double parcel2 = calculateShippingFee(4.5, true);
		double parcel3 = calculateShippingFee(4.5, false);
		double parcel4 = calculateShippingFee(2.5, true);
		
		System.out.println("Parcel 1 Fee: $"+ parcel1);
		System.out.println("Parcel 2 Fee: $"+ parcel2);
		System.out.println("Parcel 3 Fee: $"+ parcel3);
		System.out.println("Parcel 4 Fee: $"+ parcel4);
	}

}
