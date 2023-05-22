package BoardLayer;

public class Board {
	//Tabuleiro vai ter suas linhas e colunas;
	private Integer rows;
	private Integer columns;
	
	//Ele vai ter uma Matriz de Peças para o Tabuleiro
	private Piece[][] pieces;
	
	
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
	
	
	
	
}
