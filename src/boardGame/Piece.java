package boardGame;

public class Piece {

	protected Position P;
	private Board b;
	
	
	public Piece(Board b) {
		
		this.b = b;
		P=null;
	}


	protected Board getB() {
		return b;
	}


	
	
	
}
