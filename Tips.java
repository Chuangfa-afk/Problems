import java.util.Scanner;

public class Tips {

	public static void main(String[] args) {
		// Get user's input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the subtotal: ");
		double subtotal = scanner.nextDouble();
		System.out.print("Enter a gratuity rate (in term of %): ");
		double gratuity = scanner.nextDouble();
		// Divided into 100 in order to make calculation
		gratuity /= 100;
		
		// Printout the result
		System.out.println("The amount of gratuity is: " + subtotal * gratuity);
		System.out.println("The total is: " + (subtotal + (subtotal * gratuity)));
		
		// Close the scanner
		scanner.close();
	}

}
