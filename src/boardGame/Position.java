package boardGame;

public class Position {

	private int row;
	private int col;
	
	
	public Position(int row, int col) {
		
		this.row = row;
		this.col = col;
		
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public int getLin() {
		return row;
	}

	public void setLin(int lin) {
		this.row = lin;
	}

	@Override
	public String toString() {
		return row+","+col; 
	}
	
	
	
	
}
