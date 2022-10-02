
public class Staff extends Employee{
	private String title;
	
	public Staff(String name, String address, String phone_number, int age, String email, double salary, String title) {
		super(name, address, phone_number, age, email, salary);
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString() {
		return super.toString() + "\nTitle: " + title;
	}

	
}
