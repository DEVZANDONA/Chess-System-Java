package ChessLayer;

import BoardLayer.Board;

//PARTIDA DE XADREZ, TODA LÓGICA DA PARTIDA AQUI
public class ChessMatch {

	//Associação pois uma partida de xadrez tem um tabuleiro
	private Board board;
	
	
	public ChessMatch() {
		//Quem tem q saber a dimensao de um xadrez é a classe ChessMatch
		board = new Board(8,8);
	}
	
	public ChessPiece[][] getPieces() {
		 ChessPiece[][] chesspiece = new ChessPiece[board.getRows()][board.getColumns()];
		
		 for(int i = 0;chesspiece.length>i;i++) {
			 for(int j = 0;chesspiece[i].length>j;j++) {
				 chesspiece[i][j] = (ChessPiece) board.piece(i, j);
			 }
		 }
		 return chesspiece;
		
	}
	
	
}
