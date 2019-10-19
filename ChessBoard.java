
public class ChessBoard {
	

	ChessPiece[][] board = new ChessPiece[COLUMN_SIZE][ROW_SIZE];
	static final int COLUMN_SIZE = 12;
	static final int ROW_SIZE = 12;

	// constructor
	public ChessBoard(){
		// place 32 pieces on board

		addPiece(new Space	(0, 0, 0));
		addPiece(new Space	(0, 1, 0));
		addPiece(new Frame	(0, 2, 0));
		addPiece(new Frame	(0, 3, 1));
		addPiece(new Frame	(0, 4, 2));
		addPiece(new Frame	(0, 5, 3));
		addPiece(new Frame	(0, 6, 4));
		addPiece(new Frame	(0, 7, 5));
		addPiece(new Frame	(0, 8, 6));
		addPiece(new Frame	(0, 9, 7));
		addPiece(new Space	(0, 10, 0));
		addPiece(new Space	(0, 11, 0));

		addPiece(new Space	(1, 0, 0));
		addPiece(new Space	(1, 1, 0));
		addPiece(new Space	(1, 2, 0));
		addPiece(new Space	(1, 3, 1));
		addPiece(new Space	(1, 4, 2));
		addPiece(new Space	(1, 5, 3));
		addPiece(new Space	(1, 6, 4));
		addPiece(new Space	(1, 7, 5));
		addPiece(new Space	(1, 8, 6));
		addPiece(new Space	(1, 9, 7));
		addPiece(new Space	(1, 10, 0));
		addPiece(new Space	(1, 11, 0));
		
		addPiece(new Frame	(2, 0, 15));
		addPiece(new Space	(2, 1, 6));
		addPiece(new Rook	(2, 2, 0));
		addPiece(new Knight	(2, 3, 0));
		addPiece(new Bishop	(2, 4, 0));
		addPiece(new King	(2, 5, 0));   // row col color 0 = black
		addPiece(new Queen	(2, 6, 0));
		addPiece(new Bishop	(2, 7, 0));
		addPiece(new Knight	(2, 8, 0));
		addPiece(new Rook	(2, 9, 0));
		addPiece(new Space	(2, 10, 0));
		addPiece(new Frame	(2, 11, 15));

		addPiece(new Frame	(3, 0, 14));
		addPiece(new Space	(3, 1, 6));
		addPiece(new Rook	(3, 2, 0));
		addPiece(new Pawn	(3, 3, 0));
		addPiece(new Pawn	(3, 4, 0));
		addPiece(new Pawn	(3, 5, 0));
		addPiece(new Pawn	(3, 6, 0));
		addPiece(new Pawn	(3, 7, 0));
		addPiece(new Pawn	(3, 8, 0));
		addPiece(new Pawn	(3, 9, 0));
		addPiece(new Space	(3, 10, 0));
		addPiece(new Frame	(3, 11, 14));

		addPiece(new Frame	(4, 0, 13));
		addPiece(new Space	(4, 1, 0));
		addPiece(new Space	(4, 10, 0));
		addPiece(new Frame	(4, 11, 13));

		addPiece(new Frame	(5, 0, 12));
		addPiece(new Space	(5, 1, 0));
		addPiece(new Space	(5, 10, 0));
		addPiece(new Frame	(5, 11, 12));

		addPiece(new Frame	(6, 0, 11));
		addPiece(new Space	(6, 1, 0));
		addPiece(new Space	(6, 10, 0));
		addPiece(new Frame	(6, 11, 11));

		addPiece(new Frame	(7, 0, 10));
		addPiece(new Space	(7, 1, 0));
		addPiece(new Space	(7, 10, 0));
		addPiece(new Frame	(7, 11, 10));
		
		addPiece(new Frame	(9, 0, 8));
		addPiece(new Space	(9, 1, 6));
		addPiece(new Rook	(9, 2, 1));
		addPiece(new Knight	(9, 3, 1));
		addPiece(new Bishop	(9, 4, 1));
		addPiece(new King	(9, 5, 1));   // row col color 1 = white
		addPiece(new Queen	(9, 6, 1));
		addPiece(new Bishop	(9, 7, 1));
		addPiece(new Knight	(9, 8, 1));
		addPiece(new Rook	(9, 9, 1));
		addPiece(new Space	(9, 10, 0));
		addPiece(new Frame	(9, 11, 8));

		addPiece(new Frame	(8, 0, 9));
		addPiece(new Space	(8, 1, 6));
		addPiece(new Pawn	(8, 2, 1));
		addPiece(new Pawn	(8, 3, 1));
		addPiece(new Pawn	(8, 4, 1));
		addPiece(new Pawn	(8, 5, 1));
		addPiece(new Pawn	(8, 6, 1));
		addPiece(new Pawn	(8, 7, 1));
		addPiece(new Pawn	(8, 8, 1));
		addPiece(new Pawn	(8, 9, 1));
		addPiece(new Space	(8, 10, 0));
		addPiece(new Frame	(8, 11, 9));

		addPiece(new Space	(10, 0, 0));
		addPiece(new Space	(10, 1, 0));
		addPiece(new Space	(10, 2, 0));
		addPiece(new Space	(10, 3, 1));
		addPiece(new Space	(10, 4, 2));
		addPiece(new Space	(10, 5, 3));
		addPiece(new Space	(10, 6, 4));
		addPiece(new Space	(10, 7, 5));
		addPiece(new Space	(10, 8, 6));
		addPiece(new Space	(10, 9, 7));
		addPiece(new Space	(10, 10, 0));
		addPiece(new Space	(10, 11, 0));

		addPiece(new Space	(11, 0, 0));
		addPiece(new Space	(11, 1, 0));
		addPiece(new Frame	(11, 2, 0));
		addPiece(new Frame	(11, 3, 1));
		addPiece(new Frame	(11, 4, 2));
		addPiece(new Frame	(11, 5, 3));
		addPiece(new Frame	(11, 6, 4));
		addPiece(new Frame	(11, 7, 5));
		addPiece(new Frame	(11, 8, 6));
		addPiece(new Frame	(11, 9, 7));
		addPiece(new Space	(11, 10, 0));
		addPiece(new Space	(11, 11, 0));
	}
	
	// board setter
	void addPiece(ChessPiece piece){
		
		board[piece.row][piece.col] = piece;
	}
	void removePiece(int row,int col) {
		board[row][col] = null;
	}
	
	void movePiece(Coordinate from,Coordinate to) {
		ChessPiece cur = board[from.row][from.col];
		if(cur.isValidMove(this, to.row, to.col)) {
			cur.col = to.col;
			cur.row = to.row;
			board[from.row][from.col] = null;
			board[to.row][to.col] = cur;	
		}
	}
	
	// board getter
	ChessPiece pieceAt(int row, int col){
		
		return board[row][col];
	}
	
	void printBoard(){
		
		for(ChessPiece[] pieceArray : board) {
			for(ChessPiece piece : pieceArray) {
				if(piece != null)
					piece.printPiece();     // polymorphism
				else
					System.out.print(". ");
			}
			System.out.println();
		}
	}
	
}
