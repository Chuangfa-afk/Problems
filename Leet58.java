
public class Leet58 {
	public static int lengthOfLastWord(String s) {
		
		int output = 0;
		String[] s2 = s.split("\\s+");
		return s2[s2.length-1].length();
	}
	
	public static void main(String[] args) {
		// the output should be 4;
		String s = "   fly me   to   the moon  ";
		System.out.println(lengthOfLastWord(s));
		
	}
}

