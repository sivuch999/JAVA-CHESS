
public class Knight extends ChessPiece {

	public Knight(int row, int col, Player player) {
		super(row, col, player);
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

		ChessPiece pieceAt = null;

		if (row < 0 || col < 0 || row > board.BOARD_SIZE || col > board.BOARD_SIZE)
			return false;

		if ((Math.abs(this.row - row) == 2 && Math.abs(this.col - col) == 1) || (Math.abs(this.row - row) == 1 && Math.abs(this.col - col) == 2)) {
			return pieceAt != null ? (pieceAt.player != this.player) : true;
		} else {
			return false;
		}
	}

}
