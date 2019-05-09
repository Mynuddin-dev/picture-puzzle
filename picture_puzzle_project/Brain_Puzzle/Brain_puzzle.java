
package picture_puzzle_project.Brain_Puzzle;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import picture_puzzle_project.Launcher;


public class Brain_puzzle extends JFrame{
    Container c;
    JButton jButton1,jButton2,jButton3,jButton4;
    JPanel jPanel1;
    JLabel jLabel1;

    
    public Brain_puzzle(){
        initComponents();
    }
    
    public void initComponents(){
       
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Font f = new Font("Arial",Font.BOLD,17);
       /* jButton1.setText("Start Game");
        jButton1.setFont(f);*/

        jPanel1.setLayout(null);

        jButton2.setText("Math Puzzle");
        jButton2.setFont(f);
        jPanel1.add(jButton2);
        jButton2.setBounds(640, 300, 280, 50);
        jButton2.addActionListener(new ActionListener(){
           
            public void actionPerformed(ActionEvent e) {
                new Math_WelComeFrame();
            }
            
        });

       

        jButton4.setText("Back");
        jButton4.setFont(f);
        jPanel1.add(jButton4);
        jButton4.setBounds(640, 410, 280, 50);
        jButton4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                new Launcher();
                dispose();
            }
            
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture_puzzle_project/figure-3277570_1280.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0,1200, 750);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1389, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 948, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jButton1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        this.setVisible(true);
        this.setBounds(400,200,1200,750);
        
        
    }
    public static void main(String[] args) {
        new Brain_puzzle();
       
    }
    
}
