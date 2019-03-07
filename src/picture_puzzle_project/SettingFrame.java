
package picture_puzzle_project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SettingFrame extends JFrame{
    private Container c;
    private JButton homeButton,gameThemButton,gameSoundButton,aboutButton;
    
   SettingFrame(){
       DesignComponent();
   
   }
   public void DesignComponent(){
       this.setBounds(400,200,1200,750);
       this.setVisible(true);
       this.setLayout(null);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       c= this.getContentPane();
       c.setBackground(new Color(104,103,105));
       
       homeButton = new JButton("Home");
       Font f = new Font("Arial",Font.BOLD,20);
       homeButton.setBounds(10,10,100,40);
       homeButton.setFont(f);
       c.add(homeButton);
       
       gameThemButton = new JButton("Choose Game Theme");
       gameThemButton.setBounds(400,150,320,50);
       gameThemButton.setFont(f);
       c.add(gameThemButton);
       
       gameSoundButton = new JButton("Choose Game Sound");
       gameSoundButton.setBounds(400,240,320,50);
       gameSoundButton.setFont(f);
       c.add(gameSoundButton);
       
       aboutButton = new JButton("About");
       aboutButton.setBounds(400,310,320,50);
       aboutButton.setFont(f);
       c.add(aboutButton);
       
       
       
       
       
       
       
       
       
       homeButton.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               NewJFrame ob = new NewJFrame();
               ob.setVisible(true);
               dispose();
           }
       
       });
       
       
   }
   public void gameType(){
       
   }
   public void choseMusic(){
       
   }
    public static void main(String[] args) {
        new SettingFrame();
    }
}
