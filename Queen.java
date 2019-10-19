
public class Queen extends ChessPiece {

	public Queen(int row, int col, int color) {
		super(row, col, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	void printPiece() {
		System.out.print((this.color == 0) ? "q " : "Q ");
		
	}

	@Override
	PieceType getType() {
		return PieceType.QUEEN;
	}

	@Override
	boolean isValidMove(ChessBoard board, int row, int col) {
		for(int i = 0; i < 8; i++) {
			
			if((this.row - i) == row && (this.col + i) == col)
				return true;
			if((this.col - i) == col && (this.row + i) == row)
				return true;		
			if((this.row + i) == row && (this.col + i) == col)
				return true;
			if((this.col - i) == col && (this.row - i) == row)
				return true;
			if(this.col == col)
				return true;
			if(this.row == row)
				return true;
		}	
		System.out.println("Can't Move!");
		return false;
	}
}
