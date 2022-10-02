
public class Triangle extends GeometricObject{

		private double side1 = 1;
		private double side2 = 1;
		private double side3 = 1;
		
		public Triangle(){
		}
		
		public Triangle(double side1, double side2, double side3, String color, boolean filled){
			super(color, filled);
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
			
		}
		
		public double getSide1() {
			return side1;
		}
		public double getSide2() {
			return side2;
		}
		public double getSide3() {
			return side3;
		}
		
		public double getArea() {
			double semiperimeter = (side1 + side2 + side3) / 2;
			double area = Math.sqrt((semiperimeter) * (semiperimeter - side1) * (semiperimeter - side2) * (semiperimeter - side3));
			return area;
		}
		
		public double getPerimeter() {
			return side1 + side2 + side3;
		}
		
		public String toString() {
			return "side1: " + side1 +
					"\nside2: " + side2 +
					"\nside3: " + side3 + 
					"\nArea: " + getArea() +
					"\nPerimeter: " + getPerimeter() + 
					"\n" + super.toString();
		}
		
		public static void main(String[] args) {
			Triangle t1 = new Triangle(1, 1.5, 1, "yellow", true);
			System.out.println(t1);
		}
		
		

	

}
