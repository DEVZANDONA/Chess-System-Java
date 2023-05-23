package ChessPieces;

import BoardLayer.Board;
import ChessLayer.ChessPiece;
import ChessLayer.Color;

public class Rook extends ChessPiece{

	public Rook(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	//Representa��o no tabuleiro
	public String toString() {
		return "R";
	}

}
