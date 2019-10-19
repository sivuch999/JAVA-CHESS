
public class Pawn extends ChessPiece {

	boolean isFirst = true;

	public Pawn(int row, int col, Player player) {
		super(row, col, player);
		// TODO Auto-generated constructor stub
	}

	@Override
	void printPiece() {
		System.out.print((player.number == 0) ? "p " : "P ");
	}

	@Override
	PieceType getType() {
		return PieceType.PAWN;
	}

	@Override
	boolean isValidMove(ChessBoard board, int row, int col) {

		if (row < 0 || col < 0 || row > board.BOARD_SIZE || col > board.BOARD_SIZE)
			return false;

		ChessPiece pieceAt = board.pieceAt(row, col);

		Integer direction = this.player.number == 0 ? 1 : -1;
		
		if (Math.abs(this.row - row) * direction <= (this.isFirst ? 2 : 1)) {
			if (this.col - col == -1 || this.col - col == 1) {
				if (pieceAt != null) {
					if (pieceAt.player != this.player) {
						isFirst = !isFirst;
						return true;
					} else {
						return false;
					}
				} else {
					return false;
				}
			} else if (this.col == col) {
				if (pieceAt != null) {
					return false;
				} else {
					isFirst = !isFirst;
					return true;
				}
			} else {
				return false;
			}
		}
		return false;
	}

}
