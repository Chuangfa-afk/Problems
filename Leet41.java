
public class Leet41 {
	public static int firstMissingPositive(int[] nums) {
		if(nums.length == 0) {
			throw new RuntimeException("Empty input provided.");
		}
		boolean isOne = false;
		int iterator = 0;
		int current = nums[iterator];
		int output = --current;
		int temp = -1;
		if(output == 0) { // {1,2,3,4,5,6,7,10,12}
			temp = 1;
			while(nums[++iterator] == iterator+1) {
				temp++;
			}
			return ++temp;
		}
		// .... //
		else {
			for(int i: nums) {
				if(i == 1) {
					isOne = true;
				}
				if(i<current && i>1) { // {2,3,4,-1,1}
					// if output == 1;
					current = i;
					output = --current; // bugs
				}
			}
		}
		if(isOne == false)
			return 1;
		return output;
		
	}
	
	public static void main(String[] args) {
		int[] a = {2,3,4,-1,1};
		System.out.println(firstMissingPositive(a));
	}
}
