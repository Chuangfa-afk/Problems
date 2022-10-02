import java.util.Scanner;
public class lab4_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter integers (type 0 to stop): ");
		
		double sum = 0;
		int posCount = 0;
		int negCount = 0;
		
		while (true) {
			double i = input.nextDouble();
			
			if (i == 0){
				break;
			}	
			
			if (i >= 0) 
				posCount++;
			else
				negCount++;
			
			sum += i;
			
		}
		System.out.println("Positive: " + posCount);
		System.out.println("Negative: " + negCount);
		System.out.println("Average: " + (sum/(negCount + posCount)));
			
		input.close();
		
		
	}

}
