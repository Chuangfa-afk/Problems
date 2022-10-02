
public class reason {
	public static void main(String... args) {
		x x = new x(true);
		y y = new y(false);
		
		System.out.println(((x.reason)||(y.reason))?x:y);
		//y@182decdb
		System.out.println(x);
		System.out.println(y);
	}
}

class x{
	boolean reason;
	public x(boolean x) {this.reason = x;}
}
class y{
	boolean reason;
	public y(boolean y) {this.reason = y;}
}
