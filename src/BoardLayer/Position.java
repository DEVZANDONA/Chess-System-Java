package BoardLayer;

public class Position {

	//Coluna e Linha
	private Integer row;
	private Integer column;
	
	public Position(Integer row, Integer column) {
		this.row = row;
		this.column = column;
	}

	public Integer getRow() {
		return row;
	}


	public Integer getColumn() {
		return column;
	}

	
	//Mudar Coluna e Linha
	public void setValues(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	@Override
	public String toString(){
		return row+", "+column;
	}
	
	
}
