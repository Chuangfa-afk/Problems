
public class Employee extends Person{
	private double salary;
	private myDate dateHired;
	
	public Employee(String name, String address, String phone_number, int age, String email, double salary) {
		super(name, address, phone_number, age, email);
		this.salary = salary;
		this.dateHired = new myDate();
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDateHired() {
		return dateHired.getMonth() + "/" + dateHired.getDay() + "/" + dateHired.getYear();
	}
	public int getYear() {
		return dateHired.getYear();
	}
	
	public String toString() {
		return super.toString() + 
				"\nSalary: $" + getSalary() + 
				"\nDate Hired: " + getDateHired();
	}
	
	
}
