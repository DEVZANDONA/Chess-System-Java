package BoardLayer;

public class Piece {
	//Peça vai receber uma posicao PROTECTED para nao vazar para o pacote do Jogo de Xadrez
	protected Position position;
	
	//Associação uma peça vai receber um tabuleiro
	private Board board;

	//A peça inicial vai receber NULL pois nao tem lugar
	public Piece(Board board) {
		this.position = null;
		this.board = board;
	}

	//Somente Classes desse pacote ou heranças podem acessar o tabuleiro (USO INTERNO DA CAMADA DE TABULEIRO)
	protected Board getBoard() {
		return board;
	}
	
	
}
