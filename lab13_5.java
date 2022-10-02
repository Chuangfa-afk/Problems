import java.util.Scanner;
public class lab13_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int input = scanner.nextInt();
		System.out.println(reverse(input));
		scanner.close();
	}
	
	public static String sum = "";
	
	public static String reverse(int value) {
		if(value < 10) {
			sum += Integer.toString(value);
		}
		else {
			sum += Integer.toString(value % 10);
			value /= 10;
			reverse(value);
		}
		return sum;
		
	}
}
