import java.util.Scanner;
public class Lab7_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the dimensions of an n x m matrix: ");
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		System.out.printf("Enter the matrix of %d x %d: ", n, m);
		double [][] matrix = new double[n][m];
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		scanner.close();
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
		
		System.out.println("\nThe sum of the columns are: ");
		for (int t=0; t<m; t++) {
			System.out.print(sumColumn(matrix, t) + " ");
		}
			
	}
	
	public static double sumColumn(double[][] m, int c) {
		double sum = 0;
		for(int i=0; i<m.length; i++) {
			sum += m[i][c];
		}
		return sum;
	}

}
