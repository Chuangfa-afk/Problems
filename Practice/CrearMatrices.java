package Practice;
import java.util.Scanner;
public class CrearMatrices {
	public static void crear(int m, int n) {
		double[][] matrix = new double[m][n];
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the numbers for your matrix: ");
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				matrix[i][j] = scanner.nextDouble();
			}
		}
		for(int i=0; i<matrix[0].length; i++) {
			for(int j=0; j<matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		int row = 0;
		int column = 0;
		double[][] transpuesta = new double[n][m];
		for(int i=0; i<matrix[0].length; i++) {
			column = 0;
			for(int j=0; j<matrix.length; j++) {
				transpuesta[j][i] = matrix[row][column];
				column++;
				}
			row++;
			}
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				System.out.print(transpuesta[i][j] + " ");
			}
			System.out.println();
		}
		scanner.close();
		
		
		
		
		
	}
}
