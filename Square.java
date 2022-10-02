
public class Square extends GeometricObject implements Colorable{
	private int sideLength = 0;
	
	public Square(int sideLength, String color, boolean filled) {
		super(color, filled);
		this.sideLength = sideLength;
	}
	
	public double getArea() {
		return this.sideLength * this.sideLength;
	}
	
	public double getPerimeter() {
		return this.sideLength * 4;
	}
	
	public void howToColor() {
		if(this.isFilled()) {
			System.out.println("Scribble square with a " + this.getColor() + " crayon");
		}
		else {
			System.out.println("Outline square using a " + this.getColor() + " marker");
		}
	}
}
