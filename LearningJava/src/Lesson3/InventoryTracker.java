package Lesson3;

public class InventoryTracker {

	public static void main(String[] args) {
		
		int[] stocks = {15,40,8,22,3};
		
		//print out only the low stock items (quantities less than 20).
		
		for (int stock: stocks) {
			if(stock < 20) {
				System.out.println(stock);
			}
		}

	}

}
