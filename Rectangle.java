
public class Rectangle {
	private double width;
	private double height;
	String color;
	
	Rectangle(){
		width = 1;
		height = 1;
		color = "white";
	}
	
	Rectangle(double newWidth, double newHeight){
		this.width = newWidth;
		this.height = newHeight;
	}
	
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public String getColor() {
		return color;
	}
	
	public void setWidth(double newWidth) {
		this.width = newWidth;
	}
	public void setHeight(double newHeight) {
		this.height = newHeight;
	}
	public void setColor(String newColor) {
		this.color = newColor;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return 2*(width + height);
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		r1.setColor("Red");
		r2.setColor("Red");
		
		System.out.println("Testing program for r1");
		System.out.println("r1 width: " + r1.getWidth());
		System.out.println("r1 height: " + r1.getHeight());
		System.out.println("r1 area: " + r1.getArea());
		System.out.println("r1 perimeter: " + r1.getPerimeter());
		System.out.println("r1 color: " + r1.getColor() + "\n");
		
		
		System.out.println("Testing program for r2");
		System.out.println("r2 width: " + r2.getWidth());
		System.out.println("r2 height: " + r2.getHeight());
		System.out.println("r2 area: " + r2.getArea());
		System.out.println("r2 perimeter: " + r2.getPerimeter());
		System.out.println("r2 color: " + r2.getColor());

	}

}
