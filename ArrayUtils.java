
public class ArrayUtils {

	public static void main(String[] args) {
		// Part a
		int size = 100;
		int upper_limit = 21;
		int [] list = randomArray(size, upper_limit);
		
		// Part b
		print(list);
		
		// part c
		int average = (arraySum(list)) / (size);
		System.out.println("\nThe average number of the array is: " + average);
		
		// Part d
		System.out.println("The number in the array is located at the index: " + contains(list, 12));
		
		// Part e
		System.out.println("Counts of the numbers of multiple of 7 is: " + countMultiplesOf(list, 7));
		

		

	}
	
	public static int[] randomArray(int size, int range) {
		int[] output = new int[size];
		for(int i=0; i<size; i++) {
			int random = (int)(Math.random() * range);
			output[i] = random;
			}
		return output;
	}
	
	
	public static void print(int[] array) {
		for(int value: array)
			System.out.print( value + " ");
	}
	
	public static int arraySum(int[] array) {
		int output = 0;
		for(int value: array) {
			output += value;
		}
		return output;
	}
	
	public static int contains(int[] array, int a) {
		for(int i=0; i<array.length; i++) {
			if (array[i] == a)
				return i;
		}
		return -1;
	}
	
	
	public static int countMultiplesOf(int[] array, int a) {
		int counts = 0;
		for(int value: array) {
			if (value % a == 0)
				counts += 1;
		}
		return counts;
	}

	
	
	
	
	
	
	
}
