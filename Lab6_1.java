import java.util.Scanner;


public class Lab6_1 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		double[] list = new double[10];
		
		for(int i=0; i<10;i++)
			list[i] = Double.NaN;
		
		System.out.print("Enter 10 numbers: ");
		
		for (int i=0; i<10; i++) {
			double inputNumber = scanner.nextDouble();
			boolean same = false;
			
			for (int j=0; j<10; j++) {
				if (list[j] == inputNumber)
					same = true;
			}
			
			if (same == false) {
				list[i] = inputNumber;
				System.out.print(list[i] + " ");
			}
		}

		scanner.close();
	}

}
