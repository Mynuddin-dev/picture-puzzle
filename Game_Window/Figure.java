/*To see the solution by get exact positions*/
package Game_Window;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Figure extends JButton implements ActionListener{
	private int posX;
	private int posY;
	private final int solutionPosX;
	private final int solutionPosY;
	private final int dimension;
	
	public Figure(int solPosX, int solPosY, ImageIcon figure, int dimension){
		this.dimension = dimension;
		this.solutionPosX = solPosX;
		this.solutionPosY = solPosY;
		this.posX = solPosX;
		this.posY = solPosY;
		
		this.setIcon(figure);
		this.setPreferredSize(new Dimension(figure.getIconWidth(), figure.getIconHeight()));
		this.addActionListener(this);
		
	}

	public int getPosX() {
		return posX;
	}

	public void setPos(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}

	public int getPosY() {
		return posY;
	}

	public int getSolutionPosX() {
		return solutionPosX;
	}

	public int getSolutionPosY() {
		return solutionPosY;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Move();
	}
	private void Move(){
		Cell[][] board = Board.board;
		try{
		if(board[posX][posY +1].getFigure() == null){ //move to Y+ axis
			Board.board[posX][posY +1].setFigure(this);
			Board.board[posX][posY].setFigure(null);// Set the position default
			posY ++;
			Puzzle.getBoard().removeAll();
			Puzzle.getBoard().updateBoard();
			CheckAnswer();
			Puzzle.add();
			return;

		}
		}catch(ArrayIndexOutOfBoundsException e){
			
		}
		try{
		if(board[posX+1][posY].getFigure() == null){ //Move to X+ axis
			Board.board[posX+1][posY].setFigure(this);
			Board.board[posX][posY].setFigure(null);// Set the position default
			posX ++;
			Puzzle.getBoard().remover();
			CheckAnswer();
			Puzzle.add();
			return;

		}
		}catch(ArrayIndexOutOfBoundsException e){
			
		}
		try{
		if(board[posX-1][posY].getFigure() == null){ // Move to X- axis
			Board.board[posX-1][posY].setFigure(this);
			Board.board[posX][posY].setFigure(null);// Set the position default
			posX --;
			Puzzle.getBoard().remover();
			CheckAnswer();
			Puzzle.add();
			return;
		}
		}catch(ArrayIndexOutOfBoundsException e){
			
		}
		try{
		if(board[posX][posY-1].getFigure() == null){ 
			Board.board[posX][posY-1].setFigure(this);//Move to Y- axis
			Board.board[posX][posY].setFigure(null);// Set the position default
			posY --;
			Puzzle.getBoard().remover();
			CheckAnswer();
			Puzzle.add();
		}
		}catch(ArrayIndexOutOfBoundsException e){
			
		}
	}
	private void CheckAnswer(){
		Figure figure = null;
		for(int i = 0; i<dimension; i++){
			for(int j = 0; j<dimension; j++){
				
				figure = Board.board[i][j].getFigure();
				if(figure == null)// Match the puzzle successfully and will be show a message
					continue;
				
				if(figure.getPosX() != figure.getSolutionPosX() || figure.getPosY() != figure.getSolutionPosY()){//Matching unsuccessfull
					return;
				}
			}	
		}
		Puzzle.getTimer().stop();// Time stopped
		JOptionPane.showMessageDialog(new JPanel(), "Congratulations", "Puzzle completed", JOptionPane.INFORMATION_MESSAGE);// After matching the puzzle the message will be shown
	}
}

