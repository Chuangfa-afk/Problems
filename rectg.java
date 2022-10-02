
public class rectg extends GeometricObject{
	private double width;
	private double height;

	
	public rectg(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}
	public double getPerimeter() {
		return 2 * (width+height);
	}
	
	public String toString() {
		return super.toString() + "\n" +
				"Width: " + width +
				"\nHeight: " + height +
				"\nArea: " + this.getArea() + 
				"\nPerimeter: " + this.getPerimeter();
	}

}
