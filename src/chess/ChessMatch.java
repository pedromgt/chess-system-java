package chess;

import boardgame.board;

public class ChessMatch {

	private board board;
	
	public ChessMatch{
		board = new board(8,8);
	}
	public ChessPiece[][]getPiece(){
		ChessPiece[] mat = new ChessPiece[board.getRow()] [board.getColumn()];
		
	}
}
