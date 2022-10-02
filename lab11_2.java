
public class lab11_2 {
	private double side1, side2, side3;
	public lab11_2(double side1, double side2, double side3) throws illegalTriangleException{
		if((side1 >= side2 + side3) || (side2 >= side1 + side3) || (side3 >= side1 + side2)){
			throw new illegalTriangleException(side1, side2, side3);
		}
		System.out.print("Valid Triangle");
	}
	
	
	
	public static void main(String[] args) throws illegalTriangleException{
		lab11_2 test = new lab11_2(10,4,4);

	}

}
