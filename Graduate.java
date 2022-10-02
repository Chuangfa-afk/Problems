
public class Graduate extends CollegeApplicant{
	private String collegeOfOrigin;
	private String gpa;
	private String sat;
	
	public Graduate(String name, String college, String sat, String gpa, String collegeOfOrigin) {
		super(name, college);
		this.collegeOfOrigin = collegeOfOrigin;
		this.sat = sat;
		this.gpa = gpa;
	}
	
	public String getCollegeOfOrigin() {
		return collegeOfOrigin;
	}
	public String getSat() {
		return sat;
	}
	public String getGpa() {
		return gpa;
	}
	
	public void setCollegeOfOrigin(String collegeOfOrigin) {
		this.collegeOfOrigin = collegeOfOrigin;
	}
	public void setSat(String sat) {
		this.sat = sat;
	}
	public void setGpa(String gpa) {
		this.gpa = gpa;
	}
	
	
	public String sameCollege() {
		if(super.getCollege().equalsIgnoreCase(collegeOfOrigin)) {
			return "from inside";
		}
		else {
			return "from outside";
		}
	}
	
	public String toString() {
		return super.toString() + "SAT: " + sat +
				"\nGPA: " + gpa +
				"\nIts college of origin is: " + collegeOfOrigin;
	}
	
}
