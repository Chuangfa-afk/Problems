package Practice;

public class longestCommonPrefix {
	public static void main(String[] args) {
		String[] test = {"flower", "flow", "flight"};
		System.out.println(longestCommonPrefix(test));
	}
	
	 public static String longestCommonPrefix(String[] strs) {
		    if (strs.length == 0) return "";
		    String prefix = strs[0];
		    for (int i = 1; i < strs.length; i++) {
		    	System.out.println(strs[i].indexOf(prefix));
		        while (strs[i].indexOf(prefix) != 0) {
		            prefix = prefix.substring(0, prefix.length() - 1);
		            if (prefix.isEmpty()) return "";
		        } 
		        }       
		    return prefix;
		}

}
