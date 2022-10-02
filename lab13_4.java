import java.util.Scanner;
public class lab13_4 {
	public static void main(String[] agrs) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an interger: ");
		int input = scanner.nextInt();
		reverseDisplay(input);
		scanner.close();
	}
	
	public static void reverseDisplay (int value) {
		if(value < 10) {
			System.out.print(value);
		}
		else {
			System.out.print(value % 10);
			reverseDisplay(value / 10);
		}
	}
}
