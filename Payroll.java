import java.util.Scanner;

public class Payroll {

	public static void main(String[] args) {
		// Get user's input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the name of the employee: ");
		String name = scanner.nextLine();
		System.out.print("Number of hours worked in a week: ");
		double hours = scanner.nextDouble();
		System.out.print("Waht is the hourly pay rate: ");
		double pay = scanner.nextDouble();
		System.out.print("Federal tax withholding rate (in term of %): ");
		double ftax = scanner.nextDouble();
		System.out.print("State tax withholding rate (in term of %): ");
		double stax = scanner.nextDouble();
		// Assign taxes, gross and net as a double type variable
		double taxes, gross_payment, net_payment;
		// Sum of federal and state taxes
		taxes = ftax + stax;
		// Divided into 100 to be able to make calculation
		taxes /= 100;
		
		// Calculation of gross payment as well as net payment
		gross_payment = hours * pay;
		net_payment = (hours * pay) * (1 - taxes);
		
		// Print out outcome
		System.out.printf("The gross payment for %s is: %.2f\n", name, gross_payment);
		System.out.printf("The net payment for %s is: %.2f\n", name, net_payment);
		System.out.println(name + "'s payed taxes is: " + (taxes * 100) + "%");
		
		scanner.close();
		
	}

}
