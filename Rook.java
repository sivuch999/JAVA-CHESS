
public class Rook extends ChessPiece {

	public Rook(int row, int col,Player player) {
		super(row, col,player);
		// TODO Auto-generated constructor stub
	}

	@Override
	void printPiece() {
		System.out.print((this.player.number == 0) ? "r " : "R ");
		
	}

	@Override
	PieceType getType() {
		return PieceType.ROOK;
	}

	@Override
	boolean isValidMove(ChessBoard board, int row, int col) {
		ChessPiece pieceAt = null;

		//System.out.println(this.row + "," + this.col + "=>" + row + "," + col);

		if (row < 0 || col < 0 || row > board.BOARD_SIZE || col > board.BOARD_SIZE)
			return false;

		if (this.row == row) {
			if (this.col > col) {
				for (int i = this.col - 1; i >= col; i--) {
					pieceAt = board.pieceAt(row, i);
					if (pieceAt != null)
						return pieceAt.player != this.player;
				}
			} else {
				for (int i = this.col + 1; i <= col; i++) {
					pieceAt = board.pieceAt(row, i);
					if (pieceAt != null)
						return pieceAt.player != this.player;
				}
			}
			return pieceAt != null ? (pieceAt.player != this.player) : true;
		} else if (this.col == col) {
			if (this.row > row) {
				for (int i = this.row - 1; i >= row; i--) {
					pieceAt = board.pieceAt(i, col);
					if (pieceAt != null)
						return pieceAt.player != this.player;
				}
			} else {
				for (int i = this.row + 1; i <= row; i++) {
					pieceAt = board.pieceAt(i, col);
					if (pieceAt != null)
						return pieceAt.player != this.player;
				}
			}
			return pieceAt != null ? (pieceAt.player != this.player) : true;
		} else {
			return false;
		}
	}

}
