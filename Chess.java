import java.util.Scanner;
public class Chess {
    public ChessBoard board;
	  public int turns;
	  public static String players;
	  public static String move;
	  public String to;
	
	  public static void main(String[] args) {
		  ChessBoard board = new ChessBoard();
		  board.printBoard();
		  Player player1, player2 = new Player();
		
		while(true) {
			Scanner position = new Scanner(System.in);
			System.out.print("move: ");
			move = position.next();
			Coordinate from = new Coordinate(move.substring(0,2));
			Coordinate to = new Coordinate(move.substring(2,4));
//		System.out.print(helper.col+" "+helper.row);
			board.movePiece(from,to);
			board.printBoard();
		}
	}
	
	public void move(int color, String from, String to) {	
	}
    
}
