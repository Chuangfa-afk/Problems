
public class EliminateDuplicates {

	public static void main(String[] args) {
		System.out.println(eliminateDuplicates("abracadabra"));
		
		System.out.println(eliminateDuplicates("Stony Brook University"));

		System.out.println(eliminateDuplicates("This is a test sentence."));
		
		System.out.println(eliminateDuplicates("EliminateDuplicate......"));
		
		System.out.println(eliminateDuplicates("Method of testing Circuits"));
	}
	
	
	public static String eliminateDuplicates(String str) {
		String new_str = "";
		for(int i=0; i<str.length(); i++) {
			char character = str.charAt(i);
			if (!(new_str.contains(Character.toString(character)))) {
				new_str += character;
			}
			
		}
		return new_str;
		
	}

}
