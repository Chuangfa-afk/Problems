
public class illegalTriangleException extends Exception{
	public illegalTriangleException(double side1, double side2, double side3) {
		super("These sides dont make up a valid triangle: " + side1 + ", " + side2 + ", " + side3);
		
	}
}
