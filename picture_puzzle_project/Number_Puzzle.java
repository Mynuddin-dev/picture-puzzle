
package picture_puzzle_project;
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.JButton;
import javax.swing.JFrame;
    import javax.swing.JOptionPane;  
    public class Number_Puzzle extends JFrame implements ActionListener{  
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,Back;
    Container c;
    Number_Puzzle(){
        this.setBounds(400,200,1200,750);
        this.setResizable(true);
        c = this.getContentPane();
        c.setBackground(new Color(247, 234, 247));
        this.setBackground(Color.yellow);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Back = new Button("Exit");
        Back.setBounds(10,10,100,35);
        Back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Do you want to exit the game","Exit window",JOptionPane.QUESTION_MESSAGE);
                Launcher obj = new Launcher();
                obj.setVisible(true);
                dispose();
            }
            
        });
        b1=new Button("1");  
        b1.setBounds(310,50,200,200);  
        b2=new Button("2");  
        b2.setBounds(520,50,200,200);  
        b3=new Button("3");  
        b3.setBounds(730,50,200,200);  
        b4=new Button("4");  
        b4.setBounds(310,260,200,200);  
        b5=new Button("5");  
        b5.setBounds(520,260,200,200);  
        b6=new Button("");  
        b6.setBounds(730,260,200,200);  
        b7=new Button("7");  
        b7.setBounds(310,470,200,200);  
        b8=new Button("6");  
        b8.setBounds(520,470,200,200);  
        b9=new Button("8");  
        b9.setBounds(730,470,200,200);
        
        Font f = new Font("Arial",Font.BOLD,140);
        
        b1.setFont(f);
        b1.setForeground(Color.GREEN);
        b2.setFont(f);
        b2.setForeground(Color.GREEN);
        b3.setFont(f);
        b3.setForeground(Color.GREEN);
        b4.setFont(f);
        b4.setBackground(Color.red);
        b5.setFont(f);
        b5.setBackground(Color.red);
        b6.setFont(f);
        b6.setBackground(Color.red);
        b7.setFont(f);
        b7.setForeground(Color.GREEN);
        b8.setFont(f);
        b8.setForeground(Color.GREEN);
        b9.setFont(f);
        b9.setForeground(Color.GREEN);
          
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        b3.addActionListener(this);  
        b4.addActionListener(this);  
        b5.addActionListener(this);  
        b6.addActionListener(this);  
        b7.addActionListener(this);  
        b8.addActionListener(this);  
        b9.addActionListener(this);  
          
        add(Back);add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);  
        
        setLayout(null);  
        setVisible(true);  
    }  
    public void actionPerformed(ActionEvent e){  
        if(e.getSource()==b1){  
            String label=b1.getLabel();  
            if(b2.getLabel().equals("")){  
                b2.setLabel(label);  
                b1.setLabel("");  
            }  
            if(b4.getLabel().equals("")){  
                b4.setLabel(label);  
                b1.setLabel("");  
            }  
        }  
        if(e.getSource()==b2){  
            String label=b2.getLabel();  
            if(b1.getLabel().equals("")){  
                b1.setLabel(label);  
                b2.setLabel("");  
            }  
            if(b3.getLabel().equals("")){  
                b3.setLabel(label);  
                b2.setLabel("");  
            }  
            if(b5.getLabel().equals("")){  
                b5.setLabel(label);  
                b2.setLabel("");  
            }  
        }  
        if(e.getSource()==b3){  
            String label=b3.getLabel();  
            if(b2.getLabel().equals("")){  
                b2.setLabel(label);  
                b3.setLabel("");  
            }  
            if(b6.getLabel().equals("")){  
                b6.setLabel(label);  
                b3.setLabel("");  
            }  
        }  
        if(e.getSource()==b4){  
            String label=b4.getLabel();  
            if(b1.getLabel().equals("")){  
                b1.setLabel(label);  
                b4.setLabel("");  
            }  
            if(b7.getLabel().equals("")){  
                b7.setLabel(label);  
                b4.setLabel("");  
            }  
            if(b5.getLabel().equals("")){  
                b5.setLabel(label);  
                b4.setLabel("");  
            }  
        }  
        if(e.getSource()==b5){  
            String label=b5.getLabel();  
            if(b2.getLabel().equals("")){  
                b2.setLabel(label);  
                b5.setLabel("");  
            }  
            if(b6.getLabel().equals("")){  
                b6.setLabel(label);  
                b5.setLabel("");  
            }  
            if(b4.getLabel().equals("")){  
                b4.setLabel(label);  
                b5.setLabel("");  
            }  
            if(b8.getLabel().equals("")){  
                b8.setLabel(label);  
                b5.setLabel("");  
            }  
        }  
        if(e.getSource()==b6){  
            String label=b6.getLabel();  
            if(b9.getLabel().equals("")){  
                b9.setLabel(label);  
                b6.setLabel("");  
            }  
            if(b3.getLabel().equals("")){  
                b3.setLabel(label);  
                b6.setLabel("");  
            }  
            if(b5.getLabel().equals("")){  
                b5.setLabel(label);  
                b6.setLabel("");  
            }  
        }  
        if(e.getSource()==b7){  
            String label=b7.getLabel();  
            if(b4.getLabel().equals("")){  
                b4.setLabel(label);  
                b7.setLabel("");  
            }  
            if(b8.getLabel().equals("")){  
                b8.setLabel(label);  
                b7.setLabel("");  
            }  
        }  
        if(e.getSource()==b8){  
            String label=b8.getLabel();  
            if(b9.getLabel().equals("")){  
                b9.setLabel(label);  
                b8.setLabel("");  
            }  
            if(b7.getLabel().equals("")){  
                b7.setLabel(label);  
                b8.setLabel("");  
            }  
            if(b5.getLabel().equals("")){  
                b5.setLabel(label);  
                b8.setLabel("");  
            }  
        }  
        if(e.getSource()==b9){  
            String label=b9.getLabel();  
            if(b6.getLabel().equals("")){  
                b6.setLabel(label);  
                b9.setLabel("");  
            }  
            if(b8.getLabel().equals("")){  
                b8.setLabel(label);  
                b9.setLabel("");  
            }  
        }  
          
        //congrats code  
        if(b1.getLabel().equals("1")&&b2.getLabel().equals("2")&&b3.getLabel()    
                .equals("3")&&b4.getLabel().equals("4")&&b5.getLabel().equals("5")    
                &&b6.getLabel().equals("6")&&b7.getLabel().equals("7")&&b8.getLabel()    
                .equals("8")&&b9.getLabel().equals("")){     
                JOptionPane.showMessageDialog(this,"Congratulations! You won.");    
        }    
    }  
    public static void main(String[] args) {  
        new Number_Puzzle();  
    }  
    }  