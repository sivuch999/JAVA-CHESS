
public class Knight extends ChessPiece {

	public Knight(int row, int col, int color) {
		super(row, col, color);
		
	}

	@Override
	void printPiece() {
		System.out.print((this.color == 0) ? "n " : "N ");
		
	}

	@Override
	PieceType getType() {
		return PieceType.KNIGHT;
	}

	@Override
	boolean isValidMove(ChessBoard board, int row, int col) {
		return true;
	}
	
	

}
