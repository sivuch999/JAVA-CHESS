import java.util.Scanner;

public class Chess {

	public static int turns = 0;
	public static Player[] players = { null, null };
	public static String moves;
	public String to;
	static ChessBoard board;
	static Scanner scn = new Scanner(System.in);
	static PieceType pType;

	public static void main(String[] args) {

		Integer[] from, to;

		players[0] = new Player(0);
		players[1] = new Player(1);

		board = new ChessBoard(players[0], players[1]);

		board.printBoard();

		boolean isEnd = false;

		ChessPiece pieceTo = null, pieceFrom = null;

		while (!isEnd) {

			System.out.print("Player " + (players[turns].number) + " move: ");

			moves = scn.next();

			from = toCoord(moves.substring(0, 2));
			to = toCoord(moves.substring(2, 4));

			pieceTo = board.pieceAt(to[0], to[1]);

			if (move(players[turns], from, to)) {

				pieceFrom = board.pieceAt(to[0], to[1]);

				if (pieceFrom != null && pieceFrom.getType() == PieceType.PAWN
						&& (pieceFrom.row == 7 || pieceFrom.row == 0)) {
					ChessPiece newType = transform(pieceFrom.row, pieceFrom.col, players[turns]);
					board.addPiece(newType);
				}

				if (pieceTo != null && pieceTo.player != players[turns] && pieceTo.getType() == PieceType.KING) {
					isEnd = true;
					System.out.println("--------------- End game winner is player" + (turns) + " --------------------");
				}

				turns = turns == 0 ? 1 : 0;
			}

			board.printBoard();
		}
	}

	private static Integer[] toCoord(String position) {
		position = position.toLowerCase();
		Integer[] coord = { 8 - Character.getNumericValue(position.charAt(1)), position.charAt(0) - 'a' };
		return coord;
	}

	public static Boolean move(Player player, Integer[] from, Integer[] to) {

		System.out.println();

		ChessPiece pieceFrom = board.pieceAt(from[0], from[1]);

		if (pieceFrom != null) {
			System.out.println("type: " + pieceFrom.getType());
		}

		if (pieceFrom != null && pieceFrom.player == players[turns] && pieceFrom.isValidMove(board, to[0], to[1])) {

			System.out.println("move[" + from[0] + from[1] + "=>" + to[0] + to[1] + "]");

			pieceFrom.row = to[0];
			pieceFrom.col = to[1];

			board.switchPiece(from, pieceFrom);

			return true;
		} else {
			System.out.println("can't move[" + from[0] + from[1] + "=>" + to[0] + to[1] + "]");

			return false;
		}
	}

	private static ChessPiece transform(int row, int col, Player player) {
		System.out.println("Please select 1-4 !");
		System.out.println("1.Rook");
		System.out.println("2.Queen");
		System.out.println("3.Knight");
		System.out.println("4.King");
		String i = scn.next();
		switch (i) {
		case "1":
			return new Rook(row, col, player);
		case "2":
			return new Queen(row, col, player);
		case "3":
			return new Knight(row, col, player);
		case "4":
			return new King(row, col, player);
		default:
			return transform(row, col, player);
		}
	}

}
