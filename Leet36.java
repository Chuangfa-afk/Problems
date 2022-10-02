import java.util.ArrayList;
public class Leet36 {
	public static boolean isValidSudoku(char[][] board) {
		for(int i=0; i<board.length; i++) {
			ArrayList<Integer> temp = new ArrayList<>();
			for(int j=0; j<board[i].length; j++) {
				if(board[i][j] != '.') {
					int num = Character.getNumericValue(board[i][j]);
					temp.add(num);
					}
			}
			if(!isSet(temp))
				return false;
		}
		
		for(int m=0; m<board.length; m++) {
			ArrayList<Integer> temp = new ArrayList<>();
			for(int k=0; k<board[m].length; k++) {
				if(board[k][m] != '.') {
					int num = Character.getNumericValue(board[k][m]);
					temp.add(num);
				}
			}
			if(!isSet(temp)) {
				return false;
			}
		}
		
		char[] box1 = new char[9];
		char[] box2 = new char[9];
		char[] box3 = new char[9];
		char[] box4 = new char[9];
		char[] box5 = new char[9];
		char[] box6 = new char[9];
		char[] box7 = new char[9];
		char[] box8 = new char[9];
		char[] box9 = new char[9];
		
		int counter = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				box1[counter++] = board[i][j];
			}
		}
		counter = 0;
		for(int i=0; i<3; i++) {
			for(int j=3; j<6; j++) {
				box2[counter++] = board[i][j];
			}
		}
		counter = 0;
		for(int i=0; i<3; i++) {
			for(int j=6; j<9; j++) {
				box3[counter++] = board[i][j];
			}
		}
		counter = 0;
		for(int i=3; i<6; i++) {
			for(int j=0; j<3; j++) {
				box4[counter++] = board[i][j];
			}
		}
		counter = 0;
		for(int i=3; i<6; i++) {
			for(int j=3; j<6; j++) {
				box5[counter++] = board[i][j];
			}
		}
		counter = 0;
		for(int i=3; i<6; i++) {
			for(int j=6; j<9; j++) {
				box6[counter++] = board[i][j];
			}
		}
		counter = 0;
		for(int i=6; i<9; i++) {
			for(int j=0; j<3; j++) {
				box7[counter++] = board[i][j];
			}
		}
		counter = 0;
		for(int i=6; i<9; i++) {
			for(int j=3; j<6; j++) {
				box8[counter++] = board[i][j];
			}
		}
		counter = 0;
		for(int i=6; i<9; i++) {
			for(int j=6; j<9; j++) {
				box9[counter++] = board[i][j];
			}
		}
		
		if(!valid(box1) || !valid(box2) || !valid(box3) || !valid(box4) || !valid(box5) || !valid(box6) || !valid(box7) || !valid(box8) 
				|| !valid(box9))
			return false;
		
		
		
		
		
		
		
		return true;
	}
	
	private static boolean valid(char[] a) {
		ArrayList<Integer> temp = new ArrayList<>();
		for(char i: a) {
			if(i != '.') {
				temp.add(Character.getNumericValue(i));
			}
		}
		return isSet(temp);
	}
	
	public static void print(ArrayList<Integer> list) {
		for(int i: list) {
			System.out.print(i + " ");
		}
	}
	
	
	public static boolean isSet(ArrayList<Integer> list) {
		ArrayList<Integer> temp = new ArrayList<>();
		for(int i: list) {
			if(temp.contains(i)) 
				return false;
			else 
				temp.add(i);
		}
		return true;
	}
	
	public static void main(String... args) {
		char[][] matrix = {{'5','3','.','.','7','.','.','.','.'}
						,{'6','.','.','1','9','5','.','.','.'}
						,{'.','9','8','.','.','.','.','6','.'}
						,{'8','.','.','.','6','.','.','.','3'}
						,{'4','.','.','8','.','3','.','.','1'}
						,{'7','.','.','.','2','.','.','.','6'}
						,{'.','6','.','.','.','.','2','8','.'}
						,{'.','.','.','4','1','9','.','.','5'}
						,{'.','.','.','.','8','.','.','7','9'}};
		
		
		System.out.println(isValidSudoku(matrix));
	}
}
	
