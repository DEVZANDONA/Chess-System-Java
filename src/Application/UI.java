package Application;

import ChessLayer.ChessPiece;

public class UI {

	public static void printBoard(ChessPiece[][] pieces) {
		for (int c = 8, i = 0; pieces.length > i; i++) {
			System.out.print((c-- + " "));
			for (int j = 0; pieces[i].length > j; j++) {
				printPiece(pieces[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a  b  c  d  e  f  g  h");
	}

	public static void printPiece(ChessPiece piece) {
		if (piece == null) {
			System.out.print(" - ");
		}
		else {
			System.out.print(piece);
		}
		
	}
}
