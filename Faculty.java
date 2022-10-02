
public class Faculty extends Employee{
	private String officeHours;
	private int rank;
	
	public Faculty(String name, String address, String phone_number, int age, String email, double salary, String officeHours, int rank) {
		super(name, address, phone_number, age, email, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public String getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int salaryRange(int rank) {
		int years = this.getYear();
		return rank*years;
	}
	public String toString() {
		return super.toString() + 
				"\nOffice hours: " + officeHours +
				"\nrank: " + rank;
	}
	
	
}
