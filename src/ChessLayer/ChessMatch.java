package ChessLayer;

import BoardLayer.Board;
import BoardLayer.Position;
import ChessPieces.King;
import ChessPieces.Rook;

//PARTIDA DE XADREZ, TODA LÓGICA DA PARTIDA AQUI
public class ChessMatch {

	//Associação pois uma partida de xadrez tem um tabuleiro
	private Board board;
	
	
	public ChessMatch() {
		//Quem tem q saber a dimensao de um xadrez é a classe ChessMatch
		board = new Board(8,8);
		initialSetup();
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
	
	//Método Responsavel por começar a partida colocando as peças no tabuleiro
	private void initialSetup() {
		board.placePice(new Rook(board,Color.BLACK), new Position(2,1));
		
		board.placePice(new King(board,Color.WHITE), new Position(4,2));
	}
	
	
}
