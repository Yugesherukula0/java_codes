package Projects.mini_projects;
import java.util.Scanner;

public class tic_tac_toe {
	static Scanner sc = new Scanner(System.in);
	static char[][] board = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
	static char currentplayer = 'X';
	static int row;
	static int col;
	static int count = 0;

	static void displayboard() {
//        for(char boards[]:board){
//            for(char c:boards){
//             System.out.print("["+ c +"]"+" ");
//            }
//            System.out.println();
//        }

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print("[" + board[i][j] + "]" + " ");
			}
			System.out.println();
		}
	}

	static void playgame() {
		while (true) {
			displayboard();
			if (count == 9) {
				System.out.println("Game tie");
				break;
			}
			System.out.println("Current Player: " + currentplayer);
			System.out.println("Enter the position ");
			try {
				row = sc.nextInt();
				col = sc.nextInt();
			} catch (Exception e) {
				System.err.println("enter correct inputs");
				sc.nextLine();
				continue;
			}
			try {
				if (board[row][col] == ' ') {
					board[row][col] = currentplayer;
					
				} else {
					System.err.println("Position already occupied");
					continue;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.println("Enter the iputs btw 0 to 2");
				continue;
			}
			if (playerWon()) {
				System.out.println(currentplayer + " has won the game");
				displayboard();
				break;
			}
			currentplayer = (currentplayer == 'X') ? 'O' : 'X';
			count++;
		}
		sc.close();
	}

	static boolean playerWon() {
		for(int i=0;i<board.length;i++)
		if (board[i][0] == currentplayer && board[i][1] == currentplayer && board[i][2] == currentplayer){
			return true;
		} 
		for(int i=0;i<board.length;i++) {
            if(board[0][i] == currentplayer && board[1][i] == currentplayer && board[2][i] == currentplayer)
			return true;
		}  if ((board[0][0] == currentplayer && board[1][1] == currentplayer && board[2][2] == currentplayer)
				|| (board[2][0] == currentplayer && board[1][1] == currentplayer && board[0][2] == currentplayer)) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		playgame();
	}

}
