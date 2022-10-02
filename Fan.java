
public class Fan {
	private static final int SLOW = 1;
	private static final int MEDIUM = 2;
	private static final int FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "Blue";
	
	public Fan(int speed, boolean on, double radius, String color) {
		this.speed = speed;
		this.on = on;
		this.radius = radius;
		this.color = color;
	}
	// Accessor
	public int getSpeed() {
		return speed;
	}
	public boolean isOn() {
		return on;
	}
	public double getRadius() {
		return radius;
	}
	public String getColor() {
		return color;
	}
	
	// Mutator
	public void setSpeed(int speed) {
		switch(speed) {
		case 1: this.speed = SLOW;
		break;
		case 2: this.speed = MEDIUM;
		break;
		case 3: this.speed = FAST;
		}
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return "Speed: " + speed +
				"\nis on? " + on +
				"\nRadius: " + radius +
				"\nColor: " + color;
	}
	
	// Testing program
	public static void main(String[] args) {
		Fan f1 = new Fan(3, true, 10, "Yellow");
		Fan f2 = new Fan(2, false, 5, "BLue");
		
		System.out.println("The Description of f1\n" + f1 + "\n");
		System.out.println("The Description of f2\n" + f2);
	}
	
	

	
	
	
}
