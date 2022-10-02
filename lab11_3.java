import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class lab11_3 {

	public static void main(String[] args) {
		String input_fileName = args[0];
		String output_fileName = "output.txt";
		
		File input_file = new File(input_fileName);
		File output_file = new File(output_fileName);
		
		Scanner scanner = null;
		try {
			scanner = new Scanner(input_file);
		}catch(Exception e) {
			System.out.println("Error reading from input file: " + e);
		}
		
		PrintWriter output = null;
		try {
			output = new PrintWriter(output_file);
		}catch(Exception e) {
			System.out.println("Error in output file: " + e);
		}
		
		while(scanner.hasNextLine()) {
			String scanner_line = scanner.nextLine();
			System.out.println(scanner_line);
			String new_output_line = scanner_line.replaceAll("Java", "HTML");
			System.out.println(new_output_line);
			output.println(new_output_line);
			
		}
		
		scanner.close();
		output.close();
	}
}
