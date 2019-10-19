
public class Knight extends ChessPiece {

	public Knight(int row, int col,Player player) {
		super(row, col,player);
		
	}

	@Override
	void printPiece() {
		System.out.print((this.player.number == 0) ? "n " : "N ");
		
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
