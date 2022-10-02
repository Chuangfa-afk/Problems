import java.util.Scanner;
public class TempCelsiusToFahrenheit {

	public static void main(String[] args) {
		double c, f;
		Scanner input = new Scanner(System.in);
		System.out.print("Type a degree in Celsius: ");
		c = input.nextDouble();
		f = (9.0/5) * c + 32;
		System.out.println("Fahrenheit =" + f);

	}

}
