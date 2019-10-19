
public class Queen extends ChessPiece {

	public Queen(int row, int col, Player player) {
		super(row, col, player);
		// TODO Auto-generated constructor stub
	}

	@Override
	void printPiece() {
		System.out.print((this.player.number == 0) ? "q " : "Q ");

	}

	@Override
	PieceType getType() {
		return PieceType.QUEEN;
	}

	@Override
	boolean isValidMove(ChessBoard board, int row, int col) {
		if (row < 0 || col < 0 || row > board.BOARD_SIZE || col > board.BOARD_SIZE
				|| (this.row == row && this.col == col))
			return false;

		if (this.row == row) {
			if (this.col < col) {
				for (int i = this.col; i <= col; i++) {
					ChessPiece pieceAt = board.pieceAt(row, i);
					if (pieceAt != null) {
						return false;
					}
				}
			} else {
				for (int i = this.col; i >= col; i--) {
					ChessPiece pieceAt = board.pieceAt(row, i);
					if (pieceAt != null) {
						return false;
					}
				}
			}
			return true;
		} else if (this.col == col) {
			if (this.row < row) {
				for (int i = this.row + 1; i <= row; i++) {
					ChessPiece pieceAt = board.pieceAt(i, col);
					if (pieceAt != null) {
						return false;
					}
				}
			} else {
				for (int i = this.row - 1; i >= row; i--) {
					ChessPiece pieceAt = board.pieceAt(i, col);
					if (pieceAt != null) {
						return false;
					}
				}
			}
			return true;
		} else {
			return false;
		}
	}
}
