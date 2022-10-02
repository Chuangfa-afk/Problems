
public class lab12_1 {

	public static void main(String[] args) {
		Bicycle b1 = new Bicycle();
		Motorized m1 = new Motorized("Tony", 4, 3);
		System.out.println(m1.horsePow());

	}

}

abstract class Vehicle{
	protected String owner;
	protected int wheelNum;
	
	Vehicle(){
		this.owner = "";
		this.wheelNum = 0;
	}
	
	Vehicle(String owner, int wheelNum){
		this.owner = owner;
		this.wheelNum = wheelNum;
	}
}

class Bicycle extends Vehicle{
	Bicycle(){
		
	}
	Bicycle(String owner){
		this.owner = owner;
		this.wheelNum = 2;
	}
}

class Motorized extends Vehicle{
	private double engVol;
	
	public Motorized(String owner, double engVol, int wheelNum) {
		this.wheelNum = wheelNum;
		this.owner = owner;
		this.engVol = engVol;
	}
	
	public double horsePow() {
		return (double)(this.wheelNum) * (this.engVol);
	}
}



