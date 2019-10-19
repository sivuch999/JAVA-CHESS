import java.util.Scanner;

public class Player {

	public int turns;
	public static String players = "White";
	public String move,to;
	
//	String[] row7 = {"a8", "b8", "c8", "d8", "e8", "f8", "g8", "h8"};
//	String[] row6 = {"a7", "b7", "c7", "d7", "e7", "f7", "g7", "h7"};
//	String[] row5 = {"a6", "b6", "c6", "d6", "e6", "f6", "g6", "h6"};
//	String[] row4 = {"a5", "b5", "c5", "d5", "e5", "f5", "g5", "h5"};
//	String[] row3 = {"a4", "b4", "c4", "d4", "e4", "f4", "g4", "h4"};
//	String[] row2 = {"a3", "b3", "c3", "d3", "e3", "f3", "g3", "h3"};
//	String[] row1 = {"a2", "b2", "c2", "d2", "e2", "f2", "g2", "h2"};
//	String[] row0 = {"a1", "b1", "c1", "d1", "e1", "f1", "g1", "h1"};
//	
//	String[] col7 = {"h8", "h7", "h6", "h5", "h4", "h3", "h2", "h1"};
//	String[] col6 = {"g8", "g7", "g6", "g5", "g4", "g3", "g2", "g1"};
//	String[] col5 = {"f8", "f7", "f6", "f5", "f4", "f3", "f2", "f1"};
//	String[] col4 = {"e8", "e7", "e6", "e5", "e4", "e3", "e2", "e1"};
//	String[] col3 = {"d8", "d7", "d6", "d5", "d4", "d3", "d2", "d1"};
//	String[] col2 = {"c8", "c7", "c6", "c5", "c4", "c3", "c2", "c1"};
//	String[] col1 = {"b8", "b7", "b6", "b5", "b4", "b3", "b2", "b1"};
//	String[] col0 = {"a8", "a7", "a6", "a5", "a4", "a3", "a2", "a1"};

	public Player() {
		if(players=="White") {
			players = "Black";
		}
		if(players=="Black") {
			players = "White";
		}
	}
	
	public void move() {
		ChessBoard board = new ChessBoard();
		
		while(true) {
			Scanner position = new Scanner(System.in);
			System.out.print("Move: ");	
			move = position.next(); 	
//			System.out.print("to: ");
//			to = position.next();
			
			Coordinate from = new Coordinate(move);
			Coordinate to = new Coordinate(move);
	//		System.out.print(helper.col +" "+ helper.row);
			board.removePiece(from.row, from.col);
			board.printboard();
			
			
			
			
			
			// PawnMove
//			for(int i=0;i<8;i++) {
//				if(move.equals(row1[i])){
//					board.removePiece(new Pawn(6, i, 1));
//				}
//				if(to.equals(row2[i])) {
//					board.addPiece(new Pawn(5, i, 1));
//					board.printboard();
//				}
//				if(to.equals(row3[i])) {
//					board.addPiece(new Pawn(4, i, 1));
//					board.printboard();
//				}
//			}
			
			// RookMove
//			if(move.equals("a1")){
//				board.removePiece(new Rook(7, 0, 1));
//			}
//			if(move.equals("h1")) {
//				board.removePiece(new Rook(7, 7, 1));
//			}
//			
//			for(int i=0;i<8;i++) {
//				if(to.equals(row0[i])) {
//					board.addPiece(new Rook(7, i, 1));
//					board.printboard();
//				}
//				if(move.equals("a1") && to.equals(col0[i])) {
//					board.addPiece(new Rook(i, 0, 1));
//					board.printboard();
//				}
//				if(move.equals("h1") && to.equals(col0[i])) {
//					board.addPiece(new Rook(i, 7, 1));
//					board.printboard();
//				}
//			}
		}
	}
}
