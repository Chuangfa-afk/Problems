
public class UnderGraduate extends CollegeApplicant{
	private String sat;
	private String gpa;
	
	public UnderGraduate(String name, String college, String SAT, String GPA) {
		super(name, college);
		this.sat = SAT;
		this.gpa = GPA;
	}
	
	public String getSat() {
		return sat;
	}
	public String getGpa() {
		return gpa;
	}
	public void setSat(String sat) {
		this.sat = sat;
	}
	public void setGpa(String gpa) {
		this.gpa = gpa;
	}
	public String toString() {
		return super.toString() + "SAT: " + sat + 
				"\nGPA: " + gpa;
	}
}
