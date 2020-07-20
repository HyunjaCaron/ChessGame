package gameMechanics;

public class GameManager {
	
	public void run() {
		Board playBoard = new Board();
		playBoard.populateChessBoard();
		playBoard.printChessBoard();
		
		while (playBoard.isCheckMate()== false) {
			
		}
		
		
	}
	
	


}
