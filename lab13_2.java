
public class lab13_2 {
	public static void main(String[] args) {
		for(int i=1; i<11; i++)
			System.out.println(m(i));
	}
	
	public static double m(double i) {
		if(i == 1) {
			return 1;
		}
		else {
			return 1/i + m(i-1);
		}
	}
}
