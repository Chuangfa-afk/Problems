 
public class lab11_1 {
	public static void main(String[] args) throws Exception{
		String operand = args[1];
		String[] valid_operands = {"/", "*", "-", "+"};
		for(int i=0; i<valid_operands.length; i++) {
			if(operand.equals(valid_operands[i])) {
				break;
			}
			if(i == valid_operands.length - 1) {
				throw new Exception("Invalid Operands");
			}
		}
		double number_1 = Double.parseDouble(args[0]);
		double number_2 = Double.parseDouble(args[2]);
		
		if(operand.equals("/")){
			if(number_2 == 0) {
				throw new NumberFormatException("Division by zero is illegal");
			}
			else {
				System.out.println(number_1 / number_2);
			}
		}
		else if(operand.equals("*")) {
			System.out.println(number_1 * number_2);
		}
		else if(operand.equals("-")) {
			System.out.println(number_1 - number_2);
		}
		else if(operand.equals("+")) {
			System.out.println(number_1 + number_2);
		}
	}
}
