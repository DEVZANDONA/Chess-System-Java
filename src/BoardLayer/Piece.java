package BoardLayer;

public class Piece {
	//Pe�a vai receber uma posicao PROTECTED para nao vazar para o pacote do Jogo de Xadrez
	protected Position position;
	
	//Associa��o uma pe�a vai receber um tabuleiro
	private Board board;

	//A pe�a inicial vai receber NULL pois nao tem lugar
	public Piece(Board board) {
		this.position = null;
		this.board = board;
	}

	//Somente Classes desse pacote ou heran�as podem acessar o tabuleiro (USO INTERNO DA CAMADA DE TABULEIRO)
	protected Board getBoard() {
		return board;
	}
	
	
}
