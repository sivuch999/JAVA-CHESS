
public class Rook extends ChessPiece {

	public Rook(int row, int col, int color) {
		super(row, col, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	void printPiece() {
		System.out.print((this.color == 0) ? "r " : "R ");
		
	}

	@Override
	PieceType getType() {
		return PieceType.ROOK;
	}

	@Override
	boolean isValidMove(ChessBoard board, int row, int col) {
		if(this.row != row && this.col != col) {
			System.out.println("Can't Move!");
			return false;
		}
		return true;
	}
	
	
}
