package wuhinProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Project2 {
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
		
		UnsortedDate212List unsorted = new UnsortedDate212List();
		SortedDate212List sorted = new SortedDate212List();
		
		StringTokenizer date = new StringTokenizer(dates,",");
		ArrayList<String> singleDate = new ArrayList<>();
		while(date.hasMoreTokens()) 
			singleDate.add(date.nextToken());
		
		for(int i=0; i<singleDate.size(); i++) {
			unsorted.add(singleDate.get(i));
			sorted.add(singleDate.get(i));
		}
		
		new DateGUI2(unsorted, sorted);
		
		
	}
	
		
		

		

		
		
	
	
}
