import java.lang.Math;
public class Lab6_2 {


	public static int[] random(int size, int upRange) {
		int[] list = new int[size];
		for(int i=0; i< list.length; i++) {
			list[i] = (int)Math.random() * upRange;
		}
		return list;
	}
	
	public static int linearSearch(int[] list, int key) {
		for(int i=0; i< list.length; i++) {
			if (key == list[i])
				return i;
			}
		return -1;
	}
	
	public static void selectionSort(int[] list) {
		for(int i=0; i< list.length; i++) {
			int currentMin = list[i];
			int currentMinIndex = i;
			for(int j = i+1; j<list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
	
	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		while (high >= low) {
			int mid = (low + high) / 2;
			if(key < list[mid])
				high = mid - 1;
			else if (key == list[mid])
				return mid;
			else
				low = mid + 1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] list = random(1000000, 1000);
		
		// Linear Search
		long startTime = System.nanoTime();
		System.out.println(linearSearch(list, 64));
		long endTime = System.nanoTime();
		double executionTime = (endTime - startTime) / 1000000000.0;
		System.out.println("Time for linear search: " + executionTime);
		
		// Selection sort
		startTime = System.nanoTime();
		selectionSort(list);
		endTime = System.nanoTime();
		executionTime = (endTime - startTime) / 1000000000.0;
		System.out.println("time for selection sort: " + executionTime);
		
		// Binary Search
		startTime = System.nanoTime();
		System.out.println(binarySearch(list, 64));
		endTime = System.nanoTime();
		executionTime = (endTime - startTime) / 1000000000.0;
		System.out.println("Time for binary search: " + executionTime);
		
		
	}
	
	
	
	
	
	
}
