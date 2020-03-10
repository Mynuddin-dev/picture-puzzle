
package picture_puzzle_project;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class Launcher extends javax.swing.JFrame {

    public Launcher() {
        this.setResizable(false);
        initComponents();
        this.setBounds(400,200,1200,750);
    }

                         
    private void initComponents() {
     
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Font f = new Font("Arial",Font.BOLD,17);
        jPanel1.setLayout(null);

        jButton2.setText("Choose Game");
        jButton2.setFont(f);
        jPanel1.add(jButton2);
        jButton2.setBounds(640, 300, 280, 50);

        jButton3.setText("Setting");
        jButton3.setFont(f);
        jPanel1.add(jButton3);
        jButton3.setBounds(640, 380, 280, 50);

        jButton4.setText("Exit");
        jButton4.setFont(f);
        jPanel1.add(jButton4);
        jButton4.setBounds(640, 470, 280, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture_puzzle_project/figure-3277570_1280.jpg")));
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
        jButton3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                new SettingFrame();
                dispose();
            }
            
        });
        jButton4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
                }
            
            
        });
        
        jButton2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               new GameType();
               dispose();
      
            }
        
        
        });

        pack();
    }                      

    
    public static void main(String args[]) {
        
        
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Launcher().setVisible(true);
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
