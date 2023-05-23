package ChessLayer;

import BoardLayer.Board;
import BoardLayer.Piece;

//Peça de Xadrez é uma peça
public class ChessPiece extends Piece {

	//Cor da Peça de xadrez e Contagem de Movimentos dela
	private Color color;
	private Integer moveCount;
	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}


	
}
