package pieces;

import gameMechanics.Board;
import gameMechanics.Space;

public interface Piece {
	String getType();
	boolean isLegalMove(Space space);
	boolean isLegalKill(Space space);
	void setHorizontal(char horizontal);
	void setVertical(int vertical);
	String getColor();
}
