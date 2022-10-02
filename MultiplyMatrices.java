import java.util.Scanner;
public class MultiplyMatrices {

	public static void main(String[] args) {
		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first 3x3 matrix (9 numbers): ");
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++)
				matrix1[i][j] = scanner.nextDouble();
		}
		System.out.print("Enter the second 3x3 matrix (9 numbers): ");
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++)
				matrix2[i][j] = scanner.nextDouble();
		}
		scanner.close();
		System.out.println("\nThe First 3x3 matrix is: ");
		print(matrix1);
		System.out.println("\nThe Second 3x3 matrix is: ");
		print(matrix2);
		System.out.println("\nThe Product of these matrices is: ");
		print(multiplyMatrix(matrix1, matrix2));

	}
	
	
	public static double[][] multiplyMatrix(double[][] a, double[][] b){
		double[][] output = new double[3][3];
		output[0][0] = (a[0][0] * b[0][0]) + (a[0][1] * b[1][0]) + (a[0][2] * b[2][0]);
		output[0][1] = (a[0][0] * b[0][1]) + (a[0][1] * b[1][1]) + (a[0][2] * b[2][1]);
		output[0][2] = (a[0][0] * b[0][2]) + (a[0][1] * b[1][2]) + (a[0][2] * b[2][2]);
		
		output[1][0] = (a[1][0] * b[0][0]) + (a[1][1] * b[1][0]) + (a[1][2] * b[2][0]);
		output[1][1] = (a[1][0] * b[0][1]) + (a[1][1] * b[1][1]) + (a[1][2] * b[2][1]);
		output[1][2] = (a[1][0] * b[0][2]) + (a[1][1] * b[1][2]) + (a[1][2] * b[2][2]);
		
		output[2][0] = (a[2][0] * b[0][0]) + (a[2][1] * b[1][0]) + (a[2][2] * b[2][0]);
		output[2][1] = (a[2][0] * b[0][1]) + (a[2][1] * b[1][1]) + (a[2][2] * b[2][1]);
		output[2][2] = (a[2][0] * b[0][2]) + (a[2][1] * b[1][2]) + (a[2][2] * b[2][2]);
		
		return output;
	}
	
	public static void print(double[][] m) {
		for (int i=0; i<3; i++) {
			for(int j=0; j<3; j++)
				System.out.print(m[i][j] + " ");
			System.out.println();
		}
		
	}

}
