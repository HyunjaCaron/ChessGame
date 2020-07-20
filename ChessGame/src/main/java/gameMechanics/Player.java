package gameMechanics;

import pieces.Piece;

public class Player {
	
	public Piece selectPiece(char horizontal, int vertical, Board board) {
		Space space = board.getBoardGrid()[horizontal][vertical];
		Piece piece = space.getPiece();
		return piece;
	}
	
	public Space selectSpace(char horizontal, int vertical, Piece piece, Board board) {
		Space space = board.getBoardGrid()[horizontal][vertical];
		return space;

	}
	
	//check if space is occupied by a different piece, and if it's your own piece or enemies
	//if it is enemies, kill and end turn, if it's yours you cannot move there and turn isn't ended
	public boolean movePiece(Piece piece, Space space) {
		
		if (space.isEmpty() && piece.isLegalMove(space)) {
			space.setPiece(piece);
			return true;
		}
		
		else if (!space.isFriendlyPiece(piece) && piece.isLegalKill(space)) {
			//may want to store piece about to be killed
			space.setPiece(piece);
			return true;
			
		}
		
		return false;
	}

}
