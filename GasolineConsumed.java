import java.util.Scanner;
public class GasolineConsumed {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		double minutes = input.nextDouble();
		System.out.print("Enter the constant speed of the car (m/h): ");
		double constant_speed = input.nextDouble();
		System.out.print("Enter the fuel efficiency of the car (m/g): ");
		double fuel_efficiency = input.nextDouble();
		

		double answer = minutes / 60 * constant_speed * 1 / fuel_efficiency;
		System.out.println("Consumed gas for the period (in gallons): " + answer);

	}

}
