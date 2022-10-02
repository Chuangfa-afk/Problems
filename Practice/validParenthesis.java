package Practice;

public class validParenthesis {

	public static void main(String[] args) {
		String s = "([[[]{}]])";
		System.out.println(isValid(s));
	}
	
	public static boolean isValid(String s) {
		if(s.charAt(0)==')' || s.charAt(0)=='}' || s.charAt(0)==']') {
			return false;
		}
		if(s.length() % 2 != 0) {
			return false;
		}

		StringBuilder temp = new StringBuilder();
		for(int i=0; i<s.length(); i++) {
			temp.append(s.charAt(i));
		}
		boolean cont = true;
 		while(temp.length()>0 || cont) {
 			if(temp.charAt(0)=='(' ) {
 				for(int f=1; f<temp.length();f++) {
 					if(temp.charAt(f)==')') {
						temp.deleteCharAt(f);
 						temp.deleteCharAt(0);
 						break;
 					}
 				}cont = false;
					continue;
 				
 			}
 			else if(temp.charAt(0)=='[' ) {
 				for(int f=1; f<temp.length();f++) {
 					if(temp.charAt(f)==']') {
						temp.deleteCharAt(f);
 						temp.deleteCharAt(0);
 						break;
 					} 
 				}
				cont = false;
				continue;
 				
 			}
 			else if(temp.charAt(0)== '{' ) {
 				for(int f=1; f<temp.length(); f++) {
 					if(temp.charAt(f)== '}') {
						temp.deleteCharAt(f);
 						temp.deleteCharAt(0);
 						break;
 					}
 					
 				} cont = false;
 					continue;
 				
 			}
 			else {
 				temp.setLength(0);
 			}
 			
 		}
 		if(temp.length() == 0) {
 			return true;
 		}
		return false;
	}

}
