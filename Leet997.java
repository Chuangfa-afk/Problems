
public class Leet997 {
	// n=2, trust=[[1,2]]
	public static int findJudge(int n, int[][] trust) {
		int judge = trust[0][1];
		boolean fail = true;
		
		for(int i=0; i<trust.length; i++) {
//			if(trust[i][0] != judge) {
				if(trust[i][1] != judge) {
					fail = false;
				}
//			}
		}
		
		if(fail == true) 
			return judge;
			
		return -1;
	}
	
	public static void main(String... args) {
		int n = 3;
		int[][] trust = {{1,3}, {2,3}, {3,1}};
		
		System.out.println(findJudge(n, trust));
	}
}
