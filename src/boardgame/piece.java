package boardgame;

public class piece {

	protected position position;
	private board board;
	
	public piece(board board) {
		
		this.board = board;
	}

	protected board getBoard() {
		return board;
	}

}
