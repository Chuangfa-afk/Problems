import java.util.Scanner;
public class lab13_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		long input = scanner.nextLong();
		System.out.println("The sum of the digits is: " + sumDigits(input));
		scanner.close();
	}
	
	public static long sumDigits(long n) {
		if(n < 10) {
			return n;
		}
		return (n%10 + sumDigits(n/10));
	}
}
