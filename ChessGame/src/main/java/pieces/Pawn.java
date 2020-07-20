package pieces;

import gameMechanics.Space;

public class Pawn implements Piece {
	private char horizontal;
	private int vertical;
	private String color;
	private String type = "p";

	public String getType() {
		return type;
	}

	public boolean isLegalMove(Space space) {
		char horizontalMove = space.getHorizontal();
		int verticalMove = space.getVertical();
		if ((horizontalMove == horizontal) && (verticalMove == vertical + 1)) {
			return true;
		}
		return false;

	}

	public boolean isLegalKill(Space space) {
		char horizontalMove = space.getHorizontal();
		int verticalMove = space.getVertical();
		if ((horizontalMove == horizontal +1  && verticalMove == vertical + 1) || (horizontalMove == horizontal -1 && verticalMove == vertical +1)) {
			return true;
		}
			return false;
		

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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

}
