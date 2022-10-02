package Practice;
public class Cargar {
	
	public static void cargar() {
		int[][] matrix = new int[6][6];
		int counts = 0;
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				matrix[i][j] = counts;
				counts += 2;
		}
		}
		for (int i=0; i<6; i++) {
			for(int j=0; j<6; j++)
				System.out.print(matrix[i][j] + "\t");
			System.out.println();}
		
		System.out.println();
	}
	

	

	
	
	


}
