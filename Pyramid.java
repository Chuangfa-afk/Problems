import java.util.Scanner;
public class Pyramid {

	public static void main(String[] args) {
		// Get prompt from the user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int lines = scanner.nextInt();
		scanner.close();
		
		// iterate how many lines the user wants to build
		for (int i = 1; i <= lines; i++) {
			// Firstly, create spaces to make form of piramid
			for (int j = 1; j <= (lines - i); j++) 
				System.out.print("  ");
			// Print increasing numbers in power of 2
			for (int j = 0; j < i; j++) {
				int scal = (int) Math.pow(2, j);
				System.out.print( " " + scal);
			}
			// Print the right side of the piramid with numbers power of 2 in a decreasing order
			for (int k = i - 2; k >= 0; k--) {
				int scal = (int) Math.pow(2, k);
				System.out.print(" " + scal);
			}
			// Jump to Next line
			System.out.print("\n");
		}
	}
}