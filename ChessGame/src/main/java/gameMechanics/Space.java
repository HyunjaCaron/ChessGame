package gameMechanics;

import pieces.Piece;

public class Space {
private Piece piece = null;
private char horizontal;
private int vertical;
	

	public boolean isFriendlyPiece(Piece pieceMoving) {
		if (piece.getColor().equals(pieceMoving.getColor())) {
			return true;
		}
		return false;
	}
	
	


	public void updatePieceCoordinates() {
		piece.setHorizontal(horizontal);
		piece.setVertical(vertical);
	}
	
//	public void updatePiece() {
//		
//	}
	
	
	public boolean isEmpty() {
		return piece == null;
	}
	
	@Override
	public String toString() {
		if (isEmpty()) {
			return "-";
		}
		return piece.getType();
	}
	
	public void setPiece(Piece p) {
		piece = p;		
	}
	
	public Piece getPiece() {
		return piece;		
	}

	public char getHorizontal() {
		return horizontal;
	}

	public void setHorizontal(char horizontal) {
		this.horizontal = horizontal;
	}

	public int getVertical() {
		return vertical;
	}

	public void setVertical(int vertical) {
		this.vertical = vertical;
	}
	
	

}
