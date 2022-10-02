
public class CSE114{
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder();
		s.append("h");
		s.append("u");
		s.append("y");
		s.append("a");

		System.out.println(s.length());
		for(int i=0; i<4;i++) {
			s.deleteCharAt(0);
			System.out.println(s);
		}
		System.out.print(s);

	}

}