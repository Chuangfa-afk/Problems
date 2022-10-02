import java.util.ArrayList;

public class Leet48 {
	public static void rotate(int[][] matrix) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int m=0; m<matrix.length; m++) {
			for(int n=0; n<matrix[m].length; n++) {
				list.add(matrix[m][n]);
			}
		}
		
		int counter = 0;
		for(int i=matrix.length-1; i>=0; i--) {
			for(int j=0; j<matrix.length; j++) {
				matrix[j][i] = list.get(counter++);
			}
		}
		
	}
	
	public static void print(int[][] n) {
		for(int i=0; i<n.length; i++) {
			for(int j=0; j<n[i].length; j++) {
				System.out.print(n[i][j] + " ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
		print(input);
		rotate(input);
		print(input);
		
	}
}
