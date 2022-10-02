
public class HW7_4 {

	public static void main(String[] args) {
		GeometricObject r1 = new rectg(4,5);
		try {
		GeometricObject clone = (GeometricObject) r1.clone();
		System.out.println(r1.compareTo(clone)); //The result is 0, meaning that they are exactly the same
		}catch(CloneNotSupportedException ex) {
			System.exit(0);
		}
	}

}
