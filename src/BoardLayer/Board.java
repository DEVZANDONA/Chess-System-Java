package BoardLayer;
//ESSA CLASSE NAO RETORNA MATRIZ INTEIRA � UMA PE�A POR VEZ COM SEUS M�TODOS

public class Board {
	//Tabuleiro vai ter suas linhas e colunas;
	private Integer rows;
	private Integer columns;
	
	//Ele vai ter uma Matriz de Pe�as para o Tabuleiro
	private Piece[][] pieces;
	
	//N�o peguei muito a ideia das pieces receberem LINHAS E COLUNAS?
	public Board(Integer rows, Integer columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public Integer getRows() {
		return rows;
	}
	
	public Integer getColumns() {
		return columns;
	}
	
	//M�todos
	
	//Vai retornar nossa pe�a da matrix Pe�as
	public Piece piece(int row,int column) {
		return pieces[row][column];
	}
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	//
	public void placePice(Piece piece,Position position) {
		
	}
	
	
	
	
	
	
}
