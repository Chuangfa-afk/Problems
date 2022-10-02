
public abstract class GeometricObject implements Cloneable, Comparable{
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}
	protected GeometricObject(String color, boolean filled) {
		this();
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	
	public String toString() {
		return "Created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
	public int compareTo(Object o) {
		if(this.getArea() > ((GeometricObject)o).getArea()) {
			return 1;
		}
		else if (this.getArea() < ((GeometricObject)o).getArea()){
			return -1;
		}
		else {
			return 0;
		}
	}
	
//	public Object clone() {
//		try {
//			GeometricObject g = (GeometricObject)(super.clone());
//			g.setFilled(this.isFilled());
//			g.setColor(this.getColor());
//			return g;
//		}catch (CloneNotSupportedException ex) {
//			return null;
//		}
//	}
	public Object clone() throws CloneNotSupportedException{
		GeometricObject g = (GeometricObject)(super.clone());
		g.setFilled(this.isFilled());
		g.setColor(this.getColor());
		return g;

	}
	
	public static GeometricObject max(GeometricObject g1, GeometricObject g2) {
		if(g1.compareTo(g2) > 0) {
			return g1;
		}
		else if(g1.compareTo(g2) < 0) {
			return g2;
		}
		return null;
	}


	
	
	
	
	
}
