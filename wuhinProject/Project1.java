package wuhinProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Project1 {
	public static void main(String... args) {
		File input = new File("test");
		Scanner scanner = null;
		try {
			scanner = new Scanner(input);
		}catch(FileNotFoundException E) {
			System.out.println("Error reading from the input file " + E);
		}
		String dates = "";
		while(scanner.hasNextLine()) {
			dates += scanner.nextLine() + ",";
		}
		
		new DateGUI(dates);
		
		
	}
	
		
		

		

		
		
	
	
}
