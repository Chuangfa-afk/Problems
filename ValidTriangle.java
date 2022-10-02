import java.util.Scanner;
public class ValidTriangle {

	public static void main(String[] args) {
		// Get user's input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an edge #1: ");
		double edge1 = scanner.nextDouble();
		System.out.print("Enter an edge #2: ");
		double edge2 = scanner.nextDouble();
		System.out.print("Enter an edge #3: ");
		double edge3 = scanner.nextDouble();
		
		// Check if sum of any two edges is greater than the remained edge
		if ((edge1 + edge2 > edge3) || (edge2 + edge3 > edge1) || (edge1 + edge3 > edge2))
			System.out.println("The input is valid");
		// Otherwise, return Invalid
		else
			System.out.println("Invalid input");
		
		scanner.close();
	}

}
