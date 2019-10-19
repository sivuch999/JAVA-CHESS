
public class Space extends ChessPiece {

	public Space(int row, int col, int color) {
		super(row, col, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	void printPiece() {
		System.out.print("  ");
		
	}

	@Override
	PieceType getType() {
		return PieceType.SPACE;
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
