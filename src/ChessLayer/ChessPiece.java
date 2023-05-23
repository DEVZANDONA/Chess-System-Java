package ChessLayer;

import BoardLayer.Board;
import BoardLayer.Piece;

//Pe�a de Xadrez � uma pe�a
public class ChessPiece extends Piece {

	//Cor da Pe�a de xadrez e Contagem de Movimentos dela
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
