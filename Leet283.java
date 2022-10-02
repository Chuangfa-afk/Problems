
public class Leet283 {
	public static void moveZeroes(int[] nums) {
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == 0) {
				for(int j=i; j<nums.length; j++) {
					if(nums[j] != 0) {
						nums[i] = nums[j];
						nums[j] = 0;
						break;
					}
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		// Input: nums = [0,1,0,3,12]
		// Output: [1,3,12,0,0]
		
		int[] nums = {0,1,0,3,12};
		print(nums);
		moveZeroes(nums);
		System.out.println();
		print(nums);
		
		
	}
	
	public static void print(int[] n) {
		for(int i: n) {
			System.out.print(i + ", ");
		}
	}
}
