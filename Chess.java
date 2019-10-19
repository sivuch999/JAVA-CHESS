import java.util.Scanner;

public class Chess {
	public static int turns = 0;
	public static Player[] players = { null, null };
	public static String moves;
	public String to;
	static ChessBoard board;
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		Integer[] from, to;

		players[0] = new Player(0);
		players[1] = new Player(1);

		board = new ChessBoard(players[0], players[1]);

		board.printBoard();

		while (true) {
			
			System.out.print("Player " + (players[turns].number) + " move: ");

			moves = scn.next();

			from = toCoord(moves.substring(0, 2));
			to = toCoord(moves.substring(2, 4));

			move(players[turns], from, to);

			board.printBoard();
			System.out.println("---------------------------------------------------------");
		}
	}

	private static Integer[] toCoord(String position) {
		position = position.toLowerCase();
		Integer[] coord = { 8 - Character.getNumericValue(position.charAt(1)), position.charAt(0) - 'a' };
		return coord;
	}

	public static void move(Player player, Integer[] from, Integer[] to) {

		System.out.println();

		ChessPiece pieceFrom = board.pieceAt(from[0], from[1]);

		if (pieceFrom != null && pieceFrom.player == players[turns] &&  pieceFrom.isValidMove(board, to[0], to[1])) {

			System.out.println("move[" + from[0] + from[1] + "=>" + to[0] + to[1] + "]");

			pieceFrom.row = to[0];
			pieceFrom.col = to[1];
			
			board.switchPiece(from,pieceFrom);

			turns = turns == 0 ? 1 : 0;

		} else {
			System.out.println("can't move[" + from[0] + from[1] + "=>" + to[0] + to[1] + "]");
		}
	}

}
