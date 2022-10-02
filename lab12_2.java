
public class lab12_2 {

	public static void main(String[] args) {
		GeometricObject[] shapeList = new GeometricObject[5];
		shapeList[0] = new Circle(3);
		shapeList[1] = new Square(5, "blue", true);
		shapeList[2] = new Square(3, "orange", false);
		shapeList[3] = new Circle(4);
		shapeList[4] = new Square(10, "black", true);
		
		Square testShape = new Square(4, "red", true);
		for(GeometricObject shape: shapeList) {
			if(shape instanceof Colorable) {
				((Colorable) shape).howToColor();
			}
			int comp = shape.compareTo(testShape);
			System.out.println(comp);
		}
	}
}
