
public class Circle2D {

	private double x;
	private double y;
	private double radius;
	
	Circle2D(){
		this(0,0,1);
	}
	
	Circle2D(double x, double y, double radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	public boolean contains(double x, double y) {
		return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) < this.radius;
	}
	
	public boolean contains(Circle2D circle) {
		return Math.sqrt(Math.pow(circle.getX() - this.x, 2) + Math.pow(circle.getY() - this.y, 2)) <= Math.abs(radius - circle.getRadius());
	}
	
	public boolean overlaps(Circle2D circle) {
		return Math.sqrt(Math.pow(circle.getX() - this.x, 2) + Math.pow(circle.getY() - this.y, 2)) <= Math.abs(radius - circle.getRadius());
	}
	
	
	
	public static void main(String[] args) {
		
		Circle2D c1 = new Circle2D(1,1,2);
		Circle2D c2 = new Circle2D(2,2,2);
		
		System.out.println("Testing program for Circle1 (x=1, y=1, radius=2)");
		System.out.println("Circle1 x: " + c1.getX());
		System.out.println("Circle1 y: " + c1.getY());
		System.out.println("Circle1 radius: " + c1.getRadius());
		System.out.println("Circle1 area: " + c1.getArea());
		System.out.println("Circle1 perimeter: " + c1.getPerimeter());
		System.out.println("Circle1 contains point (2,2): " + c1.contains(2,2));
		System.out.println("Circle1 contains circle (2,2,2): " + c1.contains(new Circle2D(2,2,2)));
		System.out.println("Circle1 overlaps the circle (2,2,2): " + c1.overlaps(new Circle2D(2,2,2)) + "\n");
		

		System.out.println("Testing program for Circle2 (x=2, y=2, radius=2)");
		System.out.println("Circle2 x: " + c2.getX());
		System.out.println("Circle2 y: " + c2.getY());
		System.out.println("Circle2 radius: " + c2.getRadius());
		System.out.println("Circle2 area: " + c2.getArea());
		System.out.println("Circle2 perimeter: " + c2.getPerimeter());
		System.out.println("Circle2 contains point (1,1): " + c2.contains(1,1));
		System.out.println("Circle2 contains circle (1,1,2): " + c2.contains(new Circle2D(1,1,2)));
		System.out.println("Circle2 overlaps the circle (1,1,2): " + c2.overlaps(new Circle2D(1,1,2)));
	}

}
