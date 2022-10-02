
public class HW7_3{
	public static void main(String[] args) {
		//Testing for finding the larger Circle
		GeometricObject g1 = new Circle(13);
		GeometricObject g2 = new Circle(4);
		System.out.println("The larger Geometric Object is:\n" + GeometricObject.max(g1, g2) +"\n\n");
		
		//Testing for finding the larger rectangle
		GeometricObject r1 = new rectg(13,16);
		GeometricObject r2 = new rectg(4,2);
		System.out.println("The larger Geometric Object is:\n" + GeometricObject.max(r1, r2));


	}
}
