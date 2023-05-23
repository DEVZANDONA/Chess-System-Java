package BoardLayer;
//ESSA CLASSE NAO RETORNA MATRIZ INTEIRA É UMA PEÇA POR VEZ COM SEUS MÉTODOS

public class Board {
	//Tabuleiro vai ter suas linhas e colunas;
	private Integer rows;
	private Integer columns;
	
	//Ele vai ter uma Matriz de Peças para o Tabuleiro
	private Piece[][] pieces;
	
	//Não peguei muito a ideia das pieces receberem LINHAS E COLUNAS?
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
	
	//Métodos
	
	//Vai retornar nossa peça da matrix Peças
	public Piece piece(int row,int column) {
		return pieces[row][column];
	}
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	//Atribuindo uma peça na Matrix
	public void placePice(Piece piece,Position position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		//Atribuindo uma posicao para a peca tirando o null
		piece.position = position;
	}
	
	
	
	
	
	
}
