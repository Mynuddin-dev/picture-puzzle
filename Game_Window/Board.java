
package Game_Window;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public final class Board extends JPanel{

	public static Cell[][] board;
	
	private ArrayList<Cell> completeBoard = new ArrayList<>(); // to set Images we take ArrayList
	public final int dimension;
	private int x, y;
	private final int figureWidth, figureHeight;
	private JLabel label;
	public Board(int dimension, BufferedImage puzzle){
		this.setPreferredSize(new Dimension(660, 0));// size of the board
		this.setBorder(BorderFactory.createLineBorder(new Color(110,20,110), 5));//set Border Color
		this.setBackground(Color.BLACK);// Board Background
		this.dimension = dimension;
		board = new Cell[dimension][dimension];
		x = 0;
		y = 0;
		figureWidth = puzzle.getWidth()/(dimension);//width of puzzled image
		figureHeight = puzzle.getHeight()/dimension;// height of puzzled image

		this.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
                
		/*to set subImage on the board*/
		for(int i=0; i<dimension; i++){
			for(int j=0; j<dimension; j++){
				if(i == dimension-1 && j == dimension-1 ){//(dimesion-1) removing last index			
					continue;
				}
				completeBoard.add(new Cell(i, j, new Figure(i, j, new ImageIcon(puzzle.getSubimage(x, y, figureWidth, figureHeight)), dimension)));//dividing the image into several image using geSubImage method
				
				x += figureWidth;
			}
			x = 0;
			y += figureHeight;
		}
		RandomBoard();
		
		remover();
		
	}
        /*Randomly set the subImages on the board*/
	public void RandomBoard(){
		
		Random randomGenerator = new Random();
		ArrayList<Cell> cellStore = new ArrayList<>(completeBoard);//call subImages using completeBoard 
                /*set the randomed images*/
		for(int i = 0; i<dimension; i++){
			for(int j = 0; j<dimension; j++){
				if(i == dimension-1 && j == dimension-1){//(dimesion-1) removing last index
					board[i][j] = new Cell(i, j);
					continue;
				}
				int randomIndex = randomGenerator.nextInt(completeBoard.size());//generate the randomed cell approximately 232 way with the size of board cell
				completeBoard.get(randomIndex).getFigure().setPos(i, j);
				board[i][j] = new Cell(i, j, completeBoard.get(randomIndex).getFigure());
				completeBoard.remove(randomIndex);

			}
		}
		completeBoard = cellStore;
		remover();
	}
	public void updateBoard(){
		
		for(int i = 0; i<dimension; i++){
			for(int j = 0; j<dimension; j++){	
				if(board[i][j].getFigure() == null){
					label = new JLabel();
					label.setPreferredSize(new Dimension(figureWidth, figureHeight));// creating new dimension object with specific height and width
					this.add(label);
					continue;
				}
				this.add(board[i][j].getFigure());
			}
		}
		Puzzle.getContainer().validate();
	}
        /*Remove previous view of board cell*/
	public void remover(){
		this.removeAll();
		updateBoard();
	}
}

