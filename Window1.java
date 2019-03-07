
package Game_Window;

//import java.awt.ComponentOrientation;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.TransferHandler;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Window1 extends JFrame{
    private Container c;
    private ImageIcon img;
    private JLabel imgLabel,jl1,jl2,jl3;
    private JPanel panel1,panel2;
    private Color c1,c2,c3,c4,c5,c6,c7;
    private JComponent jc;
    private TransferHandler th;
    private Font f1,f2,f3;
    private JButton b1;
 Window1(){
     initComponents();
 }
 public void initComponents(){
    c = this.getContentPane();
    c3=new Color(20,80,100);
    c4=new Color(50,130,10);
    c5= new Color(50,130,250);
    c6=new Color(20,50,100);
    c7=new Color(50,130,250);
    c.setBackground(c3);
    c.setLayout(null);
    
    
   
    imgLabel = new JLabel("Image",JLabel.CENTER) ;
    imgLabel.setBounds(10,10,500,400) ;
    f3 = new Font("Arial",Font.BOLD ,20);
     imgLabel.setFont(f3);
     imgLabel.setForeground(c7);
    c.add(imgLabel);
    
    b1= new JButton("Choice an Image");
     b1.setBounds(50,580,300,50) ;
     f2 = new Font("Arial",Font.BOLD ,20);
     b1.setFont(f2);
     b1.setForeground(c5);
     b1.setBackground(c6);
    c.add(b1);
    b1.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
            JFileChooser file = new JFileChooser();
            file.setCurrentDirectory(new File(System.getProperty("user.home")));
            FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","jpeg","png");
            file.addChoosableFileFilter(filter);
            int result = file.showOpenDialog(null);
            if(result==JFileChooser.APPROVE_OPTION){
                File selectedFile= file.getSelectedFile();
                String path= selectedFile.getAbsolutePath();
                imgLabel.setIcon(ResizeImage(path));
            }
            else if(result==JFileChooser.CANCEL_OPTION){
                System.out.println("No file selected");
            }
        }
    });
    
    jl1 = new JLabel() ;
    jl1.setForeground(c4);
    jl1.setText("Moves: ");
    f1 = new Font("Arial",Font.BOLD ,50);
    jl1.setFont(f1);
    jl1.setBounds(50,470,500,400) ;
    c.add(jl1);
   
   
    jl2 = new JLabel() ;
    jl2.setForeground(c4);
    jl2.setText("Time: 00:00:00");
    f1 = new Font("Arial",Font.BOLD ,50);
    jl2.setFont(f1);
    jl2.setBounds(50,520,500,400) ;
    c.add(jl2);
    
    jl3 = new JLabel() ;
    jl3.setForeground(c4);
    jl3.setText("Score: ");
    f1 = new Font("Arial",Font.BOLD ,50);
    jl3.setFont(f1);
    jl3.setBounds(50,570,500,400) ;
    c.add(jl3);
    
    c1= new Color(50,130,10);
    c2= new Color(120,45,78);
    
    panel1 = new JPanel();
    panel1.setBounds(530, 10, 800, 800);
    panel1.setBackground(c1);
    
    
    c.add(panel1);
    
    
    }
     public ImageIcon ResizeImage(String ImagePath){
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img=MyImage.getImage();
        Image newImg = img.getScaledInstance(imgLabel.getWidth(), imgLabel.getHeight(), Image.SCALE_SMOOTH);
        
        ImageIcon image= new ImageIcon(newImg);
        return image;
}
    public static void main(String[] args) {
        Window1 frame = new Window1();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(10, 10, 1700, 1000);
        frame.setTitle("Game");
        //frame.pack();
        frame.setLocationRelativeTo(null);
        
       
        
    }

   
}
