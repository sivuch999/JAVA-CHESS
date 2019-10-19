
public class King extends ChessPiece {

	public King(int row, int col, Player player) {
		super(row, col, player);
	}

	@Override
	void printPiece() {
		System.out.print((this.player.number == 0) ? "k " : "K ");
	}

	@Override
	PieceType getType() {
		return PieceType.KING;
	}

	@Override
	boolean isValidMove(ChessBoard board, int row, int col) {

		if (row < 0 || col < 0 || row > board.BOARD_SIZE || col > board.BOARD_SIZE)
			return false;

		ChessPiece pieceAt = board.pieceAt(row, col);

		if (Math.abs(this.row - row) == 1 || Math.abs(this.col - col) == 1) {
			return pieceAt != null ? (pieceAt.player != this.player) : true;
		} else {
			return false;
		}
	}

}
