
public abstract class CollegeApplicant {
	private String name;
	private String college;
	
	protected CollegeApplicant(String name, String college) {
		this.name = name;
		this.college = college;
	}
	
	public String getName() {
		return name;
	}
	public String getCollege() {
		return college;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String toString() {
		return "The student's name is: " + name + 
				"\nApply to the college of: " + college + "\n";
	}
	
	
}
