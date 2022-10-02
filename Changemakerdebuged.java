import java.util.Scanner;

public class Changemakerdebuged {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Price to be paid: $");
		double price = input.nextDouble();
		System.out.print("From amount: $");
		double amount = input.nextDouble();
		int rem = (int)((amount - price) * 100); // cents to return
		System.out.printf("The change is: $%.2f\n", (amount - price));
		// $20, $10, $5, $1, 25c, 10c, 5c, 1c
		int twenties, tens, fives, ones, qs, ds, ns, ps;
		System.out.println("We return: ");
		
		twenties = rem / 2000;
		if(twenties != 0)
			System.out.println("\t" + twenties + " x $20 bills");
		rem = rem % 2000;
		
		tens = rem / 1000;
		if(tens != 0)
			System.out.println("\t" + tens + " x $10 bills");
		rem = rem % 1000;
		
		fives = rem / 500;
		if(fives != 0)
			System.out.println("\t" + fives + " x $5 bills");
		rem = rem % 500;
		
		ones = rem / 100;
		if(ones != 0)
			System.out.println("\t" + ones + " x $1 bills");
		rem = rem % 100;
		
		qs = rem / 25;
		if(qs != 0)
			System.out.println("\t" + qs + " x 25c coin");
		rem = rem % 25;
		
		ds = rem / 10;
		if(ds != 0)
			System.out.println("\t" + ds + " x 10c coin");
		rem = rem % 10;

		ns = rem / 5;
		if(ns != 0)
			System.out.println("\t" + ns + " x 5c coin");
		ps = rem % 5;
		if(ps != 0)
			System.out.println("\t" + ps + " x 1c coin");
		
		
		

	}

}

