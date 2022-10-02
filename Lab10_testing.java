
public class Lab10_testing {

	public static void main(String[] args) {
		Person p1 = new Person("Tony", "Stonybrook University, Lond island", "929-509-1234", 29, "Tony1234@gmail.com");
		Student p2 = new Student("Tony", "Stonybrook University, Lond island", "929-509-1234", 29, "Tony1234@gmail.com", 2);
		Employee p3 = new Employee("Tony", "Stonybrook University, Lond island", "929-509-1234", 29, "Tony1234@gmail.com", 40000);
		Faculty p4 = new Faculty("Tony", "Stonybrook University, Lond island", "929-509-1234", 29, "Tony1234@gmail.com", 40000, "Wednesday, Friday", 7);
		Staff p5 = new Staff("Tony", "Stonybrook University, Lond island", "929-509-1234", 29, "Tony1234@gmail.com", 40000, "Doctor");
		
		
		System.out.println(p1);
		System.out.println();
		System.out.println(p2);
		System.out.println();
		System.out.println(p3);
		System.out.println();
		System.out.println(p4);
		System.out.println();
		System.out.println(p5);
		
		
		
	}

}
