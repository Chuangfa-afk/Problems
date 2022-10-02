import java.util.ArrayList;
import java.util.List;

public class Leet3 {
	public static int lengthOfLongestSubstring(String s)  {
        if(s.length()==0)
            throw new RuntimeException("Empty String provided");
		List<String> list = new ArrayList<>();
		String substring = ""+s.charAt(0);
		for(int i=1; i<s.length(); i++) {
			boolean enter = false;
			for(int j=0; j<substring.length(); j++) {
				if(s.charAt(i) == substring.charAt(j)) {
					list.add(substring);
					substring = "" + s.charAt(i);
					enter = true;
					break;
				}
			}
			if(!enter)
				substring += ""+s.charAt(i);
		}
		if(list.isEmpty())
			return s.length();
	
	
		String output = "";
		for(String subs: list) {
			if(subs.length()>output.length()) 
				output = subs;
		}
		
		return output.length();
	}
	
	public static void main(String[] args) {
		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));
	}
}
