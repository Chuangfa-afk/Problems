import java.util.Scanner;
public class TicTacToe {

	public static void main(String[] args) {
		boolean playerX = true;
		boolean winner = false;
		int counts = 0;
		int m;
		String[][] board = new String[3][3];
		Scanner scanner = new Scanner(System.in);
		do {
			m = 1;
			counts++;
			while (m == 1) {
			System.out.print("What position would you like to play(1-3 values): \n");
			
			int row = scanner.nextInt() - 1;
			int column = scanner.nextInt() - 1;
			if (board[row][column] == null) {
				m = 0;}
			else
				System.out.print("The position is taken, please enter a position again. \n");
			if (m == 0) {
				if (playerX == true) {
					board[row][column] = "X";
					playerX = false;}
				else {
					board[row][column] = "O";
					playerX = true;}
		}}
		print(board);
		System.out.println();
		int w = checkBoard(board);
		if (w == 0) 
			winner = true;
		else if (w == 1)
			winner= true;
		
		
		}while ((winner == false) && (counts < 9));
		System.out.print("The game is tie, and no one wins the game.");
		scanner.close();
	}
	
	
	public static void print(String[][] m) {
		for (int i=0; i<3; i++) {
			for(int j=0; j<3; j++)
				System.out.print(m[i][j] + "\t");
			System.out.println();
		}

	}
	
	public static int checkBoard(String[][] b) {
		int s = 2;
		if ((b[0][0] == "X") && (b[0][1] =="X")  && (b[0][2] == "X")) {
			System.out.print("X player won the game."); s = 1;}
		else if ((b[1][0] == "X") && (b[1][1] =="X")  && (b[1][2] == "X")) {
			System.out.print("X player won the game."); s=1;}
		else if ((b[2][0] =="X") && (b[2][1] =="X")  && (b[2][2] == "X")) {
			System.out.print("X player won the game.");s=1;}
	
		else if ((b[0][0] =="X") && (b[1][0] =="X")  && (b[2][0] == "X")) {
			System.out.print("X player won the game.");s=1;}
		else if ((b[0][1] =="X") && (b[1][1] =="X")  && (b[2][1] == "X")) {
			System.out.print("X player won the game.");s=1;}
		else if ((b[0][2] =="X") && (b[1][2] =="X")  && (b[2][2] == "X")) {
		System.out.print("X player won the game.");s=1;}
	
		else if ((b[0][0] =="X") && (b[1][1] =="X")  && (b[2][2] == "X")) {
			System.out.print("X player won the game.");s=1;}
		else if ((b[0][2] =="X") && (b[1][1] =="X")  && (b[2][0] == "X")) {
			System.out.print("X player won the game.");s=1;}
		
		// For O checker
		else if ((b[0][0] =="O") && (b[0][1] =="O")  && (b[0][2] == "O")) {
			System.out.print("O player won the game.");s=0;}
		else if ((b[1][0] =="O") && (b[1][1] =="O")  && (b[1][2] == "O")) {
			System.out.print("O player won the game.");s=0;}
		else if ((b[2][0] =="O") && (b[2][1] =="O")  && (b[2][2] == "O")) {
			System.out.print("O player won the game.");s=0;}
	
		else if ((b[0][0] =="O") && (b[1][0] =="O")  && (b[2][0] == "O")) {
			System.out.print("O player won the game.");s=0;}
		else if ((b[0][1] =="O") && (b[1][1] =="O")  && (b[2][1] == "O")) {
			System.out.print("O player won the game.");s=0;}
		else if ((b[0][2] =="O") && (b[1][2] =="O")  && (b[2][2] == "O")) {
			System.out.print("O player won the game.");s=0;}
	
		else if ((b[0][0] =="O") && (b[1][1] =="O")  && (b[2][2] == "O")) {
			System.out.print("O player won the game.");s=0;}
		else if ((b[0][2] =="O") && (b[1][1] =="O")  && (b[2][0] == "O")) {
			System.out.print("O player won the game.");s=0;}
		
		return s;
	
			
		
	}
	
			
}
