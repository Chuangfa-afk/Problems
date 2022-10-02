import java.util.ArrayList;
public class Leet312 {
    public static int maxCoin(int[] nums) {
    	ArrayList<Integer> x = new ArrayList<>();
        int min = 0;
        int output =0;
        
        for(int i=0; i<nums.length; i++) {
        	if(i == 0) {
        		output = nums[i] + nums[i+1];
        	}
        	else if(i == nums.length-1) {
        		output = nums[i] + nums[i-1];
        	}
        	else {
        		output = nums[i-1] + nums[i] + nums[i+1];
        	}
        }
        
        
//        while(!isEmpty(nums)){
//            for(int i:nums){
//                if(i<min){
//                    min = i;
//                    x.add(min);
//                }
//            }
            
        return output;
    
}
    

        public static int maxCoins(int[] nums) {
            int n = nums.length;
            int arr[] = new int[n+2];
            arr[0] = arr[n+1] = 1;   // Giving padding of 1 to the corner elements
            for(int i=1;i<=n;i++){
                arr[i] = nums[i-1];   //final padded array
            }
            
            int dp[][] = new int[n+2][n+2];
            
            for(int window = 1;window<=n;window++){     // window size
    		
                for(int left = 1;left<=n-window+1;left++){    // left pointer
    			
                    int right = left+window-1;               // right pointer
    				
                    for(int i=left;i<=right;i++){           // iterate from left to right
    				
                        dp[left][right] = Math.max(dp[left][right], (arr[left-1]*arr[i]*arr[right+1]) + dp[left][i-1] + dp[i+1][right]);
                                        
                    }
                }
            }
            return dp[1][n];
        
    }
    
    
    public static boolean isEmpty(int[] n){
        if(n.length == 0){
            return true;
            
        }
        return false;
    }
    
    public static void main(String... args) {
    	int[] example = {1,5};
    	System.out.println(maxCoins(example));
    }
}

