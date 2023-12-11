package boardgame;

public class board {
	
	private int row;
	private int column;
	private piece[][] pieces;
	
	public board(int rows, int columns) {
	
		this.row = rows;
		this.column = columns;
		pieces = new piece [rows][columns];
		
	}

	public int getRow() {
		return row;
	}

	public void setRow(int rows) {
		this.row = rows;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	

	public  piece piece(int row,int column) {
		return pieces [row][column];
				}
}
