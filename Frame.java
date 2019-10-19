
public class Frame extends ChessPiece {

    String[] character = {"A", "B", "C", "D", "E", "F", "G", "H", "1", "2", "3", "4", "5", "6", "7", "8"};

	public Frame(int row, int col, int color) {
        // this.character = character;
		super(row, col, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	void printPiece() {
		System.out.print(this.character[this.color] + " ");
	}

	@Override
	PieceType getType() {
		return PieceType.FRAME;
	}

	@Override
	boolean isValidMove(ChessBoard board, int row, int col) {
		if(this.row != row && this.col != col) {
			System.out.println("Can't Move!");
			return false;
		}
		return true;
	}
	
	
}
