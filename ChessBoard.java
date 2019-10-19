
public class ChessBoard {

	static final int BOARD_SIZE = 8;

	ChessPiece[][] board = new ChessPiece[BOARD_SIZE][BOARD_SIZE];

	// constructor
	public ChessBoard(Player player1, Player player2) {
		// place 32 pieces on board
		addPiece(new Rook(0, 0, player1));
		addPiece(new Knight(0, 1, player1));
		addPiece(new Bishop(0, 2, player1));
		addPiece(new King(0, 3, player1)); // row col color 0 = black
		addPiece(new Queen(0, 4, player1));
		addPiece(new Bishop(0, 5, player1));
		addPiece(new Knight(0, 6, player1));
		addPiece(new Rook(0, 7, player1));
		addPiece(new Pawn(1, 0, player1));
		addPiece(new Pawn(1, 1, player1));
		addPiece(new Pawn(1, 2, player1));
		addPiece(new Pawn(1, 3, player1));
		addPiece(new Pawn(1, 4, player1));
		addPiece(new Pawn(1, 5, player1));
		addPiece(new Pawn(1, 6, player1));
		addPiece(new Pawn(1, 7, player1));

		addPiece(new Rook(7, 0, player2));
		addPiece(new Knight(7, 1, player2));
		addPiece(new Bishop(7, 2, player2));
		addPiece(new King(7, 3, player2)); // row col color 1 = white
		addPiece(new Queen(7, 4, player2));
		addPiece(new Bishop(7, 5, player2));
		addPiece(new Knight(7, 6, player2));
		addPiece(new Rook(7, 7, player2));
		addPiece(new Pawn(6, 0, player2));
		addPiece(new Pawn(6, 1, player2));
		addPiece(new Pawn(6, 2, player2));
		addPiece(new Pawn(6, 3, player2));
		addPiece(new Pawn(6, 4, player2));
		addPiece(new Pawn(6, 5, player2));
		addPiece(new Pawn(6, 6, player2));
		addPiece(new Pawn(6, 7, player2));
	}

	// board setter
	void addPiece(ChessPiece piece) {
		this.board[piece.row][piece.col] = piece;
	}

	// board setter
	void switchPiece(Integer[] from,ChessPiece piece) {
		this.board[from[0]][from[1]] = null;
		this.board[piece.row][piece.col] = piece;
	}

	// board getter
	ChessPiece pieceAt(int row, int col) {
		return board[row][col];
	}

	void printBoard() {
		//System.out.flush();
		Integer indexRow = 8, row = 0, col = 0;
		System.out.println();
		System.out.println("   A B C D E F G H  ");
		System.out.println();
		for (ChessPiece[] pieceArray : board) {
			System.out.print(indexRow + "  ");
			for (ChessPiece piece : pieceArray) {
				if (piece != null)
					board[row][col].printPiece(); // polymorphism
				else
					System.out.print(". ");
				//System.out.print(row +""+ col + " ");
				col++;
			}
			col = 0;
			System.out.print("  " + indexRow);
			row++;
			indexRow--;
			System.out.println();
		}
		System.out.println();
		System.out.println("   A B C D E F G H  ");
		System.out.println();
	}

}
