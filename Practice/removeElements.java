package Practice;

public class removeElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,2,3};
		int[] answer = removeElement(nums, 3);
		for(int i:answer) {
			System.out.print(i +" ");
		}
	}
	
    public static int[] removeElement(int[] nums, int val) {
        int[] output = new int[nums.length];
        int counts = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                output[counts++] = nums[i];
            }
        }
        return output;
    }

}
