import java.util.Scanner;
public class lab4_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string to be reversed: ");
		String s = input.nextLine();
		
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
			
		input.close();
		}

	}

}
