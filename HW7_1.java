import java.util.Scanner;

public class HW7_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a hexadecimal number: ");
		String input = scanner.nextLine();
		int output;
		try {
			output = parseHex(input);
			System.out.println("The number in decimal is: " + output);
		}catch(HexFormatException ex) {
			System.out.println(ex);
		}
		scanner.close();

	}
	
	public static int parseHex(String s) throws HexFormatException{
		int n = 0;
		int output = 0;
		for(int i=0; i<s.length(); i++) {
			if(Character.isLetter(s.charAt(i))) {
				char temp = Character.toUpperCase(s.charAt(i));
				if(temp=='A' || temp=='B' || temp=='C' || temp=='D' || temp=='E' || temp=='F') {
					switch(temp) {
					case 'A': n = 10; break;
					case 'B': n = 11; break;
					case 'C': n = 12; break;
					case 'D': n = 13; break;
					case 'E': n = 14; break;
					case 'F': n = 15; break;
					}
				}
				else {
					throw new HexFormatException("The format is incorrect");
				}
			}
			else if(Character.isDigit(s.charAt(i))) {
				n = Character.getNumericValue(s.charAt(i));	
			}
			else {
				throw new HexFormatException("The format is incorrect");
			}
			output += n * Math.pow(16, s.length() - 1 - i);
			
		}
		return output;
	}

}
