import java.util.Scanner;

public class ISBN {
	public static void main(String[] args) {
		// Ask user information
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of ISBN: ");
		String number = scanner.nextLine();
		
		// Check is the number inserted valid or not
		while (number.length() != 9) {
			if (number.length() > 9) {
				System.out.println("You should not enter more than 9 digits, please try again");
				System.out.print("Enter the first 9 digits of ISBN: ");
				number = scanner.nextLine();
			}
			else if (number.length() < 9) {
				number = ("000000000" + number).substring(number.length()); //Leading zeros if user omits those zeroes
				
				}
		}	
		// Get every single character of the string
		char ind_0 = number.charAt(0);
		char ind_1 = number.charAt(1);
		char ind_2 = number.charAt(2);
		char ind_3 = number.charAt(3);
		char ind_4 = number.charAt(4);
		char ind_5 = number.charAt(5);
		char ind_6 = number.charAt(6);
		char ind_7 = number.charAt(7);
		char ind_8 = number.charAt(8);
		
		// Convert it from char to int
		int d1 =Character.getNumericValue(ind_0);
		int d2 =Character.getNumericValue(ind_1);
		int d3 =Character.getNumericValue(ind_2);
		int d4 =Character.getNumericValue(ind_3);
		int d5 =Character.getNumericValue(ind_4);
		int d6 =Character.getNumericValue(ind_5);
		int d7 =Character.getNumericValue(ind_6);
		int d8 =Character.getNumericValue(ind_7);
		int d9 =Character.getNumericValue(ind_8);
		
		// Using the formula to calculate the last digit, d10
		int sum = ( d1 * 1 + d2 * 2 + d3 * 3+ d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		String d10 = String.valueOf(sum);
		
		// Convert it into X if d10 equals 10
		if (d10.equals("10"))
			d10 = "X";
		
		// Display in the end the total 10 digits of ISBN
		System.out.printf("The correct ISBN number is: %d%d%d%d%d%d%d%d%d%s", d1,d2,d3,d4,d5,d6,d7,d8,d9,d10);
		
		scanner.close();
		
		
		
	}
	
}
