import java.util.Scanner;

public class ComputerDiscount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many packaged bought");
		int quantity = input.nextInt();
		double discount = 0;
		
		if (quantity >= 100) {
			discount = 0.5;
		}
		else if (quantity >= 50) {
			discount = 0.4;
		}
		else if (quantity >= 20) {
			discount = 0.3;
		}
		else if (quantity >= 10) {
			discount = 0.2;
		}
		
		if (discount != 0) {
		System.out.println("Regular price: $" + (100));
		System.out.println("Quantity: " + quantity);
		System.out.println("Discount: " + discount * 100 + "%");
		System.out.println("Discounted price: $" + (100) * (1 - discount));
		System.out.println("Discount amount per unit: $" + discount * 100);
		System.out.println("Total price: $" + (100 * quantity) * (1 - discount));
		}
		else {
			System.out.println("No discounted price and your total cost is: $" + quantity * 100);
		}
	}
}
