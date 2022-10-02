
public class Leet28 {
	public static int strStr(String hayStack, String needle) {
		if(needle.isEmpty())
			return 0;
		
		return hayStack.indexOf(needle);
	}
	
	public static void main(String... args) {
		System.out.println(strStr("aaaaa", "bba"));
	}
}
