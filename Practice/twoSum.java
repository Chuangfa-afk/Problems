package Practice;

public class twoSum {

	public static void main(String[] args) {
		int[] test = {3,7,3,9,8,2};
		// result: (0,1)
		int[] respuesta = m(test, 6);
		for(int i=0; i<respuesta.length; i++) {
			System.out.print(respuesta[i] + " ");
		}
	}
	
	public static int[] m(int[] nums, int target) {
		int[] output = new int[2];
		for(int i=0; i<nums.length-1; i++) {
				for(int j=i+1; j<nums.length; j++) {
					if(nums[i] + nums[j] == target) {
						output[0] =i;
						output[1] =j;
					}
				}
		}
		return output;
		
	}
}