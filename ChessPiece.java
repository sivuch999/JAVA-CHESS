abstract public class ChessPiece {
	
	int row, col;
	Player player;
	
	public ChessPiece(int row, int col, Player player) {
		this.row = row;
		this.col = col;
		this.player = player;
	}
	
	abstract void printPiece();
	abstract PieceType getType();
	abstract boolean isValidMove(ChessBoard board, int row, int col);

}
