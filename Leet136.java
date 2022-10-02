import java.util.ArrayList;

public class Leet136 {
	public static int singleNumber(int[] nums) {
		ArrayList<Integer> output = new ArrayList<>();
		for(int i: nums) {
			if(output.contains(i)) {
				output.remove(output.indexOf(i));
			}else {
				output.add(i);
			}
		}
		return output.get(0);
	}
	
	public static void main(String[] args) {
		int[] nums = {2,2,1};
		System.out.println(singleNumber(nums));
	}
}
