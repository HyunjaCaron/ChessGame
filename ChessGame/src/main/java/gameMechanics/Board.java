package gameMechanics;

import pieces.Bishop;
import pieces.King;
import pieces.Knight;
import pieces.Pawn;
import pieces.Queen;
import pieces.Rook;

public class Board {
	
private Space[][] boardGrid  = new Space[8][8];
	
	public void populateChessBoard() {
		
		for (int i=0; i<boardGrid.length; i++) {
			for (int j=0; j<boardGrid[i].length; j++) {
				boardGrid[i][j] = new Space();
			}
		}
		blackPlayerBoard();
		whitePlayerBoard();
	}
	private void blackPlayerBoard() {
		
		boardGrid[7][1].setPiece(new Knight());
		boardGrid[7][6].setPiece(new Knight());
		boardGrid[7][0].setPiece(new Rook());
		boardGrid[7][7].setPiece(new Rook());
		boardGrid[7][2].setPiece(new Bishop());
		boardGrid[7][5].setPiece(new Bishop());
		boardGrid[7][4].setPiece(new Queen());
		boardGrid[7][3].setPiece(new King());
		for (int i=0; i<boardGrid[6].length; i++) {
			boardGrid[6][i].setPiece(new Pawn());
			
		}
	}
	
	private void whitePlayerBoard() {
		boardGrid[0][1].setPiece(new Knight());
		boardGrid[0][6].setPiece(new Knight());
		boardGrid[0][0].setPiece(new Rook());
		boardGrid[0][7].setPiece(new Rook());
		boardGrid[0][2].setPiece(new Bishop());
		boardGrid[0][5].setPiece(new Bishop());
		boardGrid[0][4].setPiece(new Queen());
		boardGrid[0][3].setPiece(new King());
		for (int i=0; i<boardGrid[1].length; i++) {
			boardGrid[1][i].setPiece(new Pawn());
		}
	}
		
	public void printChessBoard() {
		for (int i=0; i<boardGrid.length; i++) {
			for (int j=0; j<boardGrid[i].length; j++) {
			System.out.print(boardGrid[i][j]+ " ");	
			}
			System.out.println("");
		}
	}
	public Space[][] getBoardGrid() {
		return boardGrid;
	}
	public void setBoardGrid(Space[][] boardGrid) {
		this.boardGrid = boardGrid;
	}
	
	public boolean isCheckMate() {
		return false;
	}


}
