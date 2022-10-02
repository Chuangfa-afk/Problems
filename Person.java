
public class Person {
	private String name = "unkown";
	private String address = "unknown";
	private String phone_number = "unknown";
	private int age = -1;
	private String email ="unknown";
	
	public Person(){
	}
	public Person(String name, String address, String phone_number, int age, String email) {
		this.name = name;
		this.address = address;
		this.phone_number = phone_number;
		this.age = age;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getPhoneNumber() {
		return phone_number;
	}
	public int getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhoneNumber(String phone_number) {
		this.phone_number = phone_number;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "Name: " + name +
				"\nAddress: " + address + 
				"\nPhone Number: " + phone_number + 
				"\nAge: " + age + 
				"\nEmail: " + email;
	}
	
	
	
	
	
	
}
