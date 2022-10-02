class Leet26 {
    public static int[] removeDuplicates(int[] nums) {
    	
        int[] temp = new int[nums.length];
        temp[0] = nums[0];
        int counter = 1;
        boolean ex = false;
        for(int i=1; i<nums.length;i++){
            for(int j=0; j<temp.length; j++){
                if(nums[i] == temp[j]){
                    ex = true;
                } 
            }
            if(!ex)
            	temp[counter++] = nums[i];
            ex = false;
        }
        return temp;
    }
    
    public static void main(String... args) {
    	int[] x = {1};
    	int[] y = removeDuplicates(x);
    	
    	for(int i: y) {
    		System.out.print(i + " ");
    	}
    }
}