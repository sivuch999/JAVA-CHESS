
public class Pawn extends ChessPiece {

	public Pawn(int row, int col, int color) {
		super(row, col, color);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void printPiece() {
		System.out.print((this.color == 0) ? "p " : "P ");
	}

	@Override
	PieceType getType() {
		return PieceType.PAWN;
	}
	
	@Override
	boolean isValidMove(ChessBoard board, int row, int col) {
		
		return true;
	}

}
