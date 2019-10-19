
public class Rook extends ChessPiece {

	public Rook(int row, int col, Player player) {
		super(row, col, player);
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
		if(
			row < 0 || col < 0 
			|| row > board.BOARD_SIZE || col > board.BOARD_SIZE
			|| (this.row == row && this.col == col)
		){ return false; 
		}else{
			if(this.row == row && this.col != col) {
				Integer i = this.col;
				if(this.col < col) { i = ((this.col + 1 <= 7) ? this.col + 1 : this.col ); }
				else{ i = ((this.col - 1 >= 0) ? this.col - 1 : this.col ); }
				while (i != ((this.col < col) ? col + 1 : col - 1 )) {
					pieceAt = board.pieceAt(row, i);
					if(pieceAt != null){ return false; }
					if(this.col < col){ i++; }else{ i--; }
				}
				return pieceAt != null ? this.player != pieceAt.player : true;
			} else if (this.col == col && this.row != row) {
				Integer i = 0;
				if(this.row < row) { i = ((this.row + 1 <= 7) ? this.row + 1 : this.row ); }
				else { i = ((this.row - 1 >= 0) ? this.row - 1  : this.row ); }
				while (i != ((this.row < row) ? row + 1 : row - 1 )) {
					pieceAt = board.pieceAt(i, col);
					System.out.println(pieceAt);
					if(pieceAt != null){ return false; }
					if(this.row < row){ i++; }else{ i--; }
				}
				return pieceAt != null ? this.player != pieceAt.player : true;
			}else{ return false; }
		}

	}

}
