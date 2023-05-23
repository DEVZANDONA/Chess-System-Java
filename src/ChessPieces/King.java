package ChessPieces;

import BoardLayer.Board;
import ChessLayer.ChessPiece;
import ChessLayer.Color;

public class King extends ChessPiece{

	public King(Board board, Color color) {
		super(board, color);
	}
	
	//Representa��o no tabuleiro
	@Override
	public String toString() {
		return "K";
	}

	
}
