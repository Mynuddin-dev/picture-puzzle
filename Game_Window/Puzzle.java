/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game_Window;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.Timer;
import picture_puzzle_project.Launcher;

public class Puzzle extends JFrame{
	/*panels*/
	private static JPanel puzzledArea;
	private JPanel timeMoves;
	/*images and icons*/
	private Image windowIcon = ImageLoader.loadImage("puz.png");
	private BufferedImage playIcon, stopIcon, retryIcon, newGameIcon, homeIcon; 
	private static BufferedImage def = ImageLoader.loadImage("back.png");
       
	/* toolbar and its items*/
	private JToolBar toolbar = new JToolBar(); //horizontal aligment by default
	private JButton playStopButton, retryButton, newGameButton, homeIconButton;
	/*labels*/
	private JLabel time = new JLabel(" 0 : 0 : 0 ");
	private JLabel owner = new JLabel("                     Team Kingfisher");
        
	private static int moveCount = 0;
	private static JLabel moves = new JLabel(" "+moveCount+" ");
	private JLabel timeTitle = new JLabel(" Time \n");
	private JLabel movesTitle = new JLabel("\n Moves      ");
	/* final values*/
	private final int width = 670;
	private final int height = 485;
	private final int iconSize = 30;
	private final int fontSize = 35;
	private final int delay = 1000;
	/*chronometer values*/
	private int seconds = 0;
	private int minutes = 0;
	private int hours = 0;
	/*board, miniImage and timer (statics)*/
	private static JButton miniImage = new JButton(new ImageIcon(def.getScaledInstance(200, 200, Image.SCALE_DEFAULT)));
        
	private static Board board = null;
	private static Timer chronometer;
	private static Container container;
	
	public Puzzle(){
		/*set window values*/
		this.setTitle("Puzzle");
		this.setSize(width, height);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension(width, height));
		this.setMaximumSize(new Dimension(width, height));
		this.setResizable(false);
		this.setIconImage(windowIcon);
		container = this.getContentPane();
		chronometer = new Timer(delay, new IconTimerListener());
		/*load all images and icons*/
		playIcon = ImageLoader.loadImage("play-button.png");
		stopIcon = ImageLoader.loadImage("pause.jpg");
		retryIcon = ImageLoader.loadImage("replay.jpg");
		newGameIcon = ImageLoader.loadImage("add-file.png");	
                                            homeIcon = ImageLoader.loadImage("home-513.png");	
		/* Initialize all toolbar items*/
		playStopButton = new JButton(new ImageIcon(stopIcon.getScaledInstance(iconSize, iconSize, Image.SCALE_DEFAULT)));
		playStopButton.setName("stop");
		playStopButton.addActionListener(new IconTimerListener());
		
		retryButton = new JButton(new ImageIcon(retryIcon.getScaledInstance(iconSize, iconSize, Image.SCALE_DEFAULT)));
		retryButton.setName("retry");
		retryButton.addActionListener(new IconTimerListener());
		
		newGameButton = new JButton(new ImageIcon(newGameIcon.getScaledInstance(iconSize, iconSize, Image.SCALE_DEFAULT)));
		newGameButton.setName("new");
		newGameButton.addActionListener(new IconTimerListener());
                
                                            homeIconButton = new JButton(new ImageIcon(homeIcon.getScaledInstance(iconSize, iconSize, Image.SCALE_DEFAULT)));
		homeIconButton.setName("home");
		homeIconButton.addActionListener(new IconTimerListener());
                                            
		/* initialize panels*/
		puzzledArea = new JPanel();
		puzzledArea.setOpaque(true);
		puzzledArea.setBackground(new Color(247,234,247));
                puzzledArea.setBounds(10, 10, 600, 600);
                                           
		
		timeMoves = new JPanel();
		timeMoves.setLayout(new FlowLayout(FlowLayout.CENTER));
		timeMoves.setOpaque(true);
               
		timeMoves.setBackground(new Color(247,234,247));
		
		/*add buttons to the toolbar*/
		toolbar.add(newGameButton);
		toolbar.add(playStopButton);
		toolbar.add(retryButton);
                                            toolbar.add(homeIconButton);
		
		owner.setFont(new Font("Arial", Font.BOLD, fontSize));
		owner.setForeground(new Color(110,20,110));
		
		toolbar.add(owner);
		/*set labels properties*/
		time.setForeground(new Color(210,20,110));
		time.setFont(new Font("Arial", Font.BOLD, fontSize));
		
		moves.setForeground(new Color(210,20,110));
		moves.setFont(new Font("Arial", Font.BOLD, fontSize));
		
		timeTitle.setFont(new Font("Arial", Font.BOLD, fontSize));
		timeTitle.setForeground(new Color(110,20,110));
		
		movesTitle.setFont(new Font("Arial", Font.BOLD, fontSize));
		movesTitle.setForeground(new Color(110,20,110));
                
                owner.setFont(new Font("Arial",Font.BOLD,fontSize));
		
		/* add components to panels*/
		puzzledArea.add(new JLabel(new ImageIcon(def)));
              
		
		timeMoves.add(miniImage);

		timeMoves.add(timeTitle);
		timeMoves.add(time);
		timeMoves.add(movesTitle);
		timeMoves.add(moves);
		
		container.add(toolbar, BorderLayout.PAGE_START);
		container.add(puzzledArea, BorderLayout.WEST);
		container.add(timeMoves);
	}
	class IconTimerListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Object comp = e.getSource();
			if(comp instanceof JButton){
				JButton button = (JButton)comp;
				if(button.getName().equals("stop")){//Action on stop button
					if(board != null){
						chronometer.stop();//stopping time
						button.setIcon(new ImageIcon(playIcon.getScaledInstance(iconSize, iconSize, Image.SCALE_DEFAULT)));//Showing playIcon
						button.setName("play");
						board.setVisible(false);//The puzzle board will be hide
					}
					

				}
                                
                               
                                else if(button.getName().equals("play")){
					if(board != null){
						chronometer.start();//Time starting
						button.setIcon(new ImageIcon(stopIcon.getScaledInstance(iconSize, iconSize, Image.SCALE_DEFAULT)));
						button.setName("stop");
						board.setVisible(true);//The puzzle board will be shown
					}

				}
                                else if(button.getName().equals("home")){//go to home 
                                   Launcher ob = new Launcher();
                                 ob.setVisible(true);
                                 dispose();
                                }
                                else if(button.getName().equals("retry")){//retrying the game again 
					moveCount = 0;
					seconds = 0;
					minutes = 0;
					hours = 0;
					time.setText(" "+hours+" : "+minutes+" : "+seconds+" ");
					moves.setText(" "+moveCount+" ");
					if(board != null)
						board.RandomBoard();//puzzle board cell will be randomed				
				}else if(button.getName().equals("new")){// new game selecting
					StartPuzzle start = new StartPuzzle();//Calling startPuzzle class
				}
			}else if(comp instanceof Timer){
				seconds ++;
				if(seconds == 60){
					seconds = 0;
					minutes ++;
					if(minutes == 60){
						minutes = 0;
						hours ++;
					}
				}
				time.setText(" "+hours+" : "+minutes+" : "+seconds+" ");
				
			}
                        
                    
		}
                
		
	}
        
	public static void start(BufferedImage img, int level, BufferedImage mini){
		miniImage.setIcon(new ImageIcon(mini));// miniImage showing on the right side
		if(board != null)
			container.remove(board);
		board = new Board(level, img);
		chronometer.start();//time counting will be started
		container.remove(puzzledArea);// Removing puzzle Area
		container.add(board, BorderLayout.WEST);// the puzzle board will be shown at the place of puzzleArea
		container.validate();//To layout  subcomponents again
	}
	public static Board getBoard() {
		return board;
	}
	public static void add(){
		moveCount ++;//Counting moves
		moves.setText(" "+moveCount+" ");
	}
	public static Timer getTimer(){
		return chronometer;
	}
	public static Container getContainer(){
		return container;
	}
}
