package Game_Window;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class StartPuzzle extends JFrame implements ActionListener{
	 JPanel main = new JPanel();
	 JButton open, start;
	 JLabel puzzleImage = new JLabel("Select an image and difficulty level");
                      
	 JFileChooser filechooser;
	JRadioButton easy, medium, hard;
	private BufferedImage image = null;
	private int level = 0;
	 Image windowIcon = ImageLoader.loadImage("back.png");//background image load
	
	public StartPuzzle(){// new image and level selection class constructor
		setTitle("New puzzle");
		setSize(600, 450);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(true);
		main.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.setIconImage(windowIcon);
		
		easy = new JRadioButton("Easy");
		medium = new JRadioButton("Medium");
		hard = new JRadioButton("Hard");
                easy.setBounds(100, 400, 100, 100);
                easy.setFont(new Font("Arial",Font.BOLD,15));
                 medium.setFont(new Font("Arial",Font.BOLD,15));
                  hard.setFont(new Font("Arial",Font.BOLD,15));
		
		ButtonGroup group = new ButtonGroup();// grouped the buttons
		group.add(easy);
		group.add(medium);
		group.add(hard);
               
		
		open = new JButton(new ImageIcon(ImageLoader.loadImage("select-icon.jpg").getScaledInstance(250, 250, Image.SCALE_SMOOTH)));//Clicking on the select-icon image to load an image
		open.setName("Open");
		open.addActionListener(this);
		start = new JButton("start");
		start.setName("Start");
		start.addActionListener(this);
		
		main.add(puzzleImage);
		main.add(open);
		
		main.add(easy);
		main.add(medium);
		main.add(hard);
		
		main.add(start);
		add(main);
		setVisible(true);
                puzzleImage.setFont(new Font("Arial", Font.BOLD, 15));
	}
	@Override
	public void actionPerformed(ActionEvent e) {//choosing an image from file
		
		JButton button = (JButton)e.getSource();
		if(button.getName().equals("Open")){
			
			filechooser = new JFileChooser();
			int action = filechooser.showOpenDialog(null);
			if(action == JFileChooser.APPROVE_OPTION){
				File file = filechooser.getSelectedFile();
				try {
					image = ImageIO.read(file);
					open.setIcon( new ImageIcon(image.getScaledInstance(250, 250, Image.SCALE_DEFAULT)));
					
				} catch (IOException e1) {
					System.out.println("You must select an image");
				}
			}
		}else if(button.getName().equals("Start")){//selecting level esay, medium and hard
			if(easy.isSelected()){
				level = 3;
			}else if(medium.isSelected()){
				level = 4;
			}else if(hard.isSelected()){
				level = 5;
			}else{
				return;
			}
			if(image == null)
				return;
			BufferedImage puzzledImage = ImageResizer.resizeImage(image, 650, 650);//size of the puzzledImage
			BufferedImage miniImage = ImageResizer.resizeImage(image, 400, 400);//size of the miniImage
			
			Puzzle.start(puzzledImage, level, miniImage);
			this.dispose();
		}
		
	}
}

