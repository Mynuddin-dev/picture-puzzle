
package picture_puzzle_project.Brain_Puzzle;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import picture_puzzle_project.Launcher;


public class Math_WelComeFrame extends javax.swing.JFrame {

   
    public Math_WelComeFrame() {
        initComponents();
        this.setResizable(false);
        this.setBounds(400,200,1200,750);
        this.setVisible(true);
    }

    
    
                            
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Font f = new Font("Arial",Font.BOLD,17);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton1.setText("Go To Math Game");
        jButton1.setFont(f);
        jPanel1.add(jButton1);
        jButton1.setBounds(540, 445, 280, 40);
        jButton1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                new Brain_puzzle1();
                dispose();
            }
            
        });

        jButton2.setText("I am Not Interested");
        jButton2.setFont(f);
        jPanel1.add(jButton2);
        jButton2.setBounds(540, 515, 280, 40);
        jButton2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                new Launcher();
                new noMusic();
                
                dispose();
            }
            
        });
        
     

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TestPackage/Math.png")));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 10, 1190, 770);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }                        

    
    public static void main(String args[]) {
        
        new Math_WelComeFrame();
    }

                        
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
                  
}
