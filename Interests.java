import java.util.Scanner;
public class Interests {

	public static void main(String[] args) {
		// Prompt the user informations
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a loan amount: ");
		double amount = scanner.nextDouble();
		System.out.print("Enter a period in number of years: ");
		int year = scanner.nextInt();
		scanner.close();
		
		// Starting interest rate
		double interest_Rate = 5;
		
		// Output user's informations
		System.out.println("Loan amount: " + amount);
		System.out.println("Number of years: " + year);
		System.out.println("Interest Rate    Monthly Payment    Total Payment");
		
		do {
			// store formulas to calculate monthly payment as well as total payment
			double monthlyInterestRate = interest_Rate / 1200;

			double monthlyPayment = amount * monthlyInterestRate / (1 - (Math.pow(1 / (1 + monthlyInterestRate), year * 12)));

			double totalPayment = monthlyPayment * year * 12; 
			
			// Print out the the result
			System.out.printf("%.3f             %.2f            %.2f\n", interest_Rate, monthlyPayment, totalPayment); 
			
			// increment interest rate by 1/8
			interest_Rate += 0.125;
		
		// Set a condition to break the loop when the interest rate reach to 8	
		}while (interest_Rate <= 8);
		
		
		
		
	}

}
