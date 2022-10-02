
public class Lab7_2 {

	public static void main(String[] args) {
		int[][] matrix = new int[8][8];
		int sumRow, sumColumn, sumMajorDiagonal, sumMinorDiagonal;
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++)
				matrix[i][j] = ( int)(Math.random() * 2);
		}
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++)
				System.out.print(matrix[i][j]);
			System.out.println();
			}
		
		
		sumMajorDiagonal = 0;
		sumMinorDiagonal = 0;
		
		for(int i=0; i<matrix.length; i++) {
			sumRow = 0;
			sumColumn = 0;
			for(int j=0; j<matrix[i].length; j++) {
				sumRow += matrix[i][j];
				sumColumn += matrix[j][i];
				
				if (i==j)
					sumMajorDiagonal +=  matrix[i][j];
				if(i+j == 7)
					sumMinorDiagonal += matrix[i][j];
			}
			if (sumRow == 0) 
				System.out.println("Row " + (i+1) + " has all 0s");
			else if (sumRow == 8)
				System.out.println("Row " + (i+1) + " has all 1s");
			
			if (sumColumn == 0) 
				System.out.println("Column " + (i+1) + " has all 0s");
			else if (sumColumn == 8)
				System.out.println("Column " + (i+1) + " has all 1s");
			
		}
		if (sumMajorDiagonal == 0) 
			System.out.println("All 0s in Major diagonal");
		else if (sumMajorDiagonal == 8)
			System.out.println("All 1s in Major diagonal");
		
		if (sumMinorDiagonal == 0) 
			System.out.println("All 0s in Minor diagonal");
		else if (sumMinorDiagonal == 8)
			System.out.println("All 1s in Minor diagonal");
			
				
		
	}
}	
