
public class lab13_1 {
	public static void main(String[] args) {
		System.out.println(factorial(13));
	}
	
	public static long factorial(long n) {
		long output = 1;
		for(long i=1; i<=n; i++) {
			output *= i;
		}
		return output;
	}
}
