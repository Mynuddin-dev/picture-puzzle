
package picture_puzzle_project;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;


public class GameType extends javax.swing.JFrame {
    

    public GameType() {
        
        
        initComponents();
    }

  
   
    private void initComponents() {
        this.setBounds(400,200,1200,750);
        this.setSize(1200,750);
        this.setVisible(true);
        
        Font f = new Font("Arial",Font.BOLD,20);

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        
        jButton1.setFont(f);
        jButton2.setFont(f);
        jButton3.setFont(f);
        jButton4.setFont(f);
        
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton1.setText("Picture Puzzle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new Puzzle1();
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(410, 220, 260, 50);

        jButton2.setText("Number Puzzle");
        jPanel1.add(jButton2);
        jButton2.setBounds(410, 290, 260, 50);

        jButton3.setText("Drage-Drop Puzzle");
        jPanel1.add(jButton3);
        jButton3.setBounds(410, 360, 260, 50);

        jButton4.setText("Help");
        jPanel1.add(jButton4);
        jButton4.setBounds(410, 440, 260, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TestPackage/gameType.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20,20, 1060, 710);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jButton2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 Thread obj = new Thread(new Runnable(){
        @Override
        public void run() {
            GameMusic ob = new GameMusic();
            ob.music();
        }
        
        
    });
        obj.start();
        
        Puzzle1 game = new Puzzle1();
        game.setTitle("THE FIFTEEN PUZZLE");
        game.setVisible(true);
        game.setBounds(400,200,1200,750);
        game.scramble();
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
            }
        
        });

        
    }                       

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    }                                        

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameType();
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
}
