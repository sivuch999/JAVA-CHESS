
public class Bishop extends ChessPiece {

	public Bishop(int row, int col,Player player) {
		super(row, col,player);
		// TODO Auto-generated constructor stub
	}

	@Override
	void printPiece() {
		System.out.print((this.player.number == 0) ? "b " : "B ");
		
	}

	@Override
	PieceType getType() {
		return PieceType.BISHOP;
	}

	@Override
	boolean isValidMove(ChessBoard board, int row, int col) {
		for(int i = 0; i < 8; i++) {
			
			if((this.row - i) == row && (this.col + i) == col)
				return true; // right up
			if((this.col - i) == col && (this.row + i) == row)
				return true; // left down	
			if((this.row + i) == row && (this.col + i) == col)
				return true; // right down
			if((this.col - i) == col && (this.row - i) == row)
				return true; // left up
		} 
		
		System.out.println("Can't Move!");
		return false;
	}
	
}
