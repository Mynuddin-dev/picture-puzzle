
package picture_puzzle_project.Brain_Puzzle;
import java.awt.*;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
    import javax.swing.*;  
      
    public class Brain_puzzle1{  
    JFrame f;  
    int count=0;
    Brain_puzzle1(){  
        f=new JFrame();  
        f.setBounds(400,200,1200,750);  
        f.setVisible(true); 
        f.setLayout(new GridLayout(20,20));  
         JButton[] button = new JButton[400];
        for(int i=0;i<400;i++){
            String k =  String.valueOf(i);
            String b = "b";
            
           button[i] = new JButton(k);   
            f.add(button[i]);   
        }
        
       double n = Math.random()*4;
       int choice=(int)n;
       if(choice==1){
           long time1= System.currentTimeMillis();
           JOptionPane.showMessageDialog(f,"If x=10,y=23,z=123  What will be sum of them?");
           for(int i=0;i<400;i++)
            {
            
            button[i].addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource()==button[156])
                    {
                        for(int i=0;i<400;i++)
                        {
                            button[i].setBackground(Color.GREEN);
                            
                            
                           
                            
                        }
                        long time2 = System.currentTimeMillis();
                        long time =(time2-time1)/1000;
                        int pointHelper=(int)time;
                                
                        count=1000/pointHelper;
                        new yesMusic();
                        JOptionPane.showMessageDialog(null,"your Answer is corect and your totalTime is "+time+" Second And you point is "+count);
                        
                        f.dispose();
                        new Brain_puzzle1();   
                    }
                    else{
                        for(int i =0;i<400;i++)
                        {
                            button[i].setBackground(Color.red);
                            count=0;
                            long solve1 = System.currentTimeMillis();
                            long time = (solve1-time1)/1000;
                            new noMusic();
                            JOptionPane.showMessageDialog(null,"your Answer is incorect and your totalTime is "+time+" Second And you point is "+count);
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException ex) {
                            }
                            f.dispose();
                            
                            break;
                        }
                    }
        
                }
                
            });
        }
       }
       else if(choice==2)
        {
           long time2= System.currentTimeMillis();
           JOptionPane.showMessageDialog(f,"Which one is the correct prime number after 75");
           for(int i=0;i<400;i++)
            {
            
            button[i].addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource()==button[79])
                    {
                        for(int i=0;i<400;i++)
                        {
                            button[i].setBackground(Color.GREEN); 
                        }
                        long solve2 = System.currentTimeMillis();
                        long time =(solve2-time2)/1000;
                        int pointHelper=(int)time;
                                
                        count=1000/pointHelper;
                        new yesMusic();
                        JOptionPane.showMessageDialog(null,"your Answer is corect and your totalTime is "+time+" Second And you point is "+count);
                        
                        f.dispose();
                        new Brain_puzzle1();
                    }
                    else{
                        for(int i =0;i<400;i++)
                        {
                            button[i].setBackground(Color.red);
                            count=0;
                            long solve2 = System.currentTimeMillis();
                            long time = (solve2-time2)/1000;
                            new noMusic();
                            JOptionPane.showMessageDialog(null,"your Answer is incorect and your totalTime is "+time+" Second And you point is "+count);
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException ex) {
                            }
                            f.dispose();
                            break;
                        }
                    }
        
                }
                
            });
        } 
        }
        else if(choice==3)
        {
           long time3= System.currentTimeMillis();
           JOptionPane.showMessageDialog(f,"Find the Correct Answer . Remember that the math is exact 1 + 4 = 5 , 2 + 5 = 12 ,3 + 6 = 21 then 5 + 8 will be What?");
           for(int i=0;i<400;i++)
            {
            
            button[i].addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource()==button[13])
                    {
                        for(int i=0;i<400;i++)
                        {
                            button[i].setBackground(Color.GREEN);
                            
                        }
                        long solve3 = System.currentTimeMillis();
                        long time =(solve3-time3)/1000;
                        int pointHelper=(int)time;
                                
                        count=1000/pointHelper;
                        new yesMusic();
                        JOptionPane.showMessageDialog(null,"your Answer is corect and your totalTime is "+time+" Second And you point is "+count);
                        
                        f.dispose();
                        new Brain_puzzle1();
                    }
                    else{
                        for(int i =0;i<400;i++)
                        {
                            button[i].setBackground(Color.red);
                            count=0;
                            long solve3 = System.currentTimeMillis();
                            long time = (solve3-time3)/1000;
                            new noMusic();
                            JOptionPane.showMessageDialog(null,"your Answer is incorect and your totalTime is "+time+" Second And you point is "+count);
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException ex) {
                            }
                            f.dispose();
                            break;
                        }
                    }
        
                }
                
            });
        } 
        }
        
        else if(choice==4)
        {
           long time4= System.currentTimeMillis();
           JOptionPane.showMessageDialog(f,"What is The 10th Fibonacci Number ?");
           for(int i=0;i<400;i++)
            {
            
            button[i].addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource()==button[55])
                    {
                        for(int i=0;i<400;i++)
                        {
                            button[i].setBackground(Color.GREEN);
                        }
                        long solve3 = System.currentTimeMillis();
                        long time =(solve3-time4)/1000;
                        int pointHelper=(int)time;
                                
                        count=1000/pointHelper;
                        new yesMusic();
                        JOptionPane.showMessageDialog(null,"your Answer is corect and your totalTime is "+time+" Second And you point is "+count);
                        
                        f.dispose();
                        new Brain_puzzle1();
                    }
                    else{
                        for(int i =0;i<400;i++)
                        {
                            button[i].setBackground(Color.red);
                            count=0;
                            long solve4 = System.currentTimeMillis();
                            long time = (solve4-time4)/1000;
                            new noMusic();
                            JOptionPane.showMessageDialog(null,"your Answer is incorect and your totalTime is "+time+" Second And you point is "+count);
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException ex) {
                            }
                            f.dispose();
                            break;
                        }
                    }
        
                }
                
            });
        } 
        }
        else if(choice==0)
        {
           long time4= System.currentTimeMillis();
           JOptionPane.showMessageDialog(f,"Which is  an auspicious number in ancient cultures?");
           for(int i=0;i<400;i++)
            {
            
            button[i].addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource()==button[7])
                    {
                        for(int i=0;i<400;i++)
                        {
                            button[i].setBackground(Color.GREEN);
                            
                        }
                        long solve3 = System.currentTimeMillis();
                        long time =(solve3-time4)/1000;
                        int pointHelper=(int)time;
                                
                        count=1000/pointHelper;
                        new yesMusic();
                        JOptionPane.showMessageDialog(null,"your Answer is corect and your totalTime is "+time+" Second And you point is "+count);
                        
                        f.dispose();
                        new Brain_puzzle1();
                    }
                    else{
                        for(int i =0;i<400;i++)
                        {
                            button[i].setBackground(Color.red);
                            count=0;
                            long solve4 = System.currentTimeMillis();
                            long time = (solve4-time4)/1000;
                            new noMusic();
                            JOptionPane.showMessageDialog(null,"your Answer is incorect and your totalTime is "+time+" Second And you point is "+count);
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException ex) {
                            }
                            f.dispose();
                            break;
                        }
                    }
        
                }
                
            });
        } 
           
       }
      
        f.setBounds(400,200,1200,750);  
        f.setVisible(true); 
        f.setLayout(new GridLayout(20,20));  
        //setting grid layout of 3 rows and 3 columns  
    }  
    public static void main(String[] args) {  
        new Brain_puzzle1();  
        
    }  
    }  
