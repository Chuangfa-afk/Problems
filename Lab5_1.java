import java.util.Scanner;
public class Lab5_1 {

	public static void main(String[] args) {

		char option;
		do {
			Scanner input = new Scanner(System.in);
			System.out.println("");
			System.out.println("A - convert pounds to kilos");
			System.out.println("B - convert kilos to pounds");
			System.out.println("C - convert kilometers to miles");
			System.out.println("D - convert miles to kilometers");
			System.out.println("E - Exit");
			System.out.println("Enter your option: ");
			option = input.next().charAt(0);
			option = Character.toUpperCase(option);
			if (option == 'E' || (option!='A' && option!='B' && option!='C' && option!='D')) {
				System.out.println("The program exit");
				continue;}
			else {
				System.out.print("Enter a value: ");
				double value = input.nextDouble();
				if (option == 'A') {
					System.out.println(value + " pounds = " + poundsToKilos(value) + " kilos");}
				else if (option == 'B')
					System.out.println(value + " kilos = " + kilosToPounds(value) + " pounds");
				else if (option == 'C')
					System.out.println(value + " kilometers = " + kmToM(value) + " miles");
				else if (option == 'D')
					System.out.println(value + " miles = " + mToKm(value) + " kilometers");
				}
			
			
		}while (option != 'E');
	

	}
	public static double poundsToKilos(double pounds) {
		return pounds * 0.453592;
	}

	public static  double kilosToPounds(double pounds) {
		return pounds / 0.453592;
	}

	public static  double kmToM(double pounds) {
		return pounds * 0.621371;
	}

	public static  double mToKm(double pounds) {
		return pounds / 0.621371;
	}

}
