package Practice;
public class removeDuplicate {

	public static void main(String[] args) {
		int[] a = {1,1,2};
		int[] b =removeDuplicates(a);
		for(int value:b) {
			System.out.println(value);
		}
		
	}
	
    public static int[] removeDuplicates(int[] nums) {
        int counts = 1;
        int[] output = new int[nums.length];
        output[0] = nums[0];
        for(int i=0; i<nums.length-1; i++){
            if(nums[i+1] != nums[i]){
                output[counts++] = nums[i+1];
            }
        }
        return output;
}
	

}
