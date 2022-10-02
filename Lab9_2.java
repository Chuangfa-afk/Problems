import java.util.Arrays;
public class Lab9_2 {

	public static void main(String[] args) {
		int[] counts = count("jjjewiewiofne1221128732093kdlw");
		System.out.println(Arrays.toString(counts));

	}
	
	public static int[] count(String s) {
		int[] counts = new int[10];
		for(int i=0;i<s.length(); i++) {
			char c = s.charAt(i);
			if (c>=48 && c<=57) {
				counts[c-48] += 1;
			}
		}
		return counts;
	}
	

}
