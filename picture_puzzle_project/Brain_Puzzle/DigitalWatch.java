
package picture_puzzle_project.Brain_Puzzle;

    import javax.swing.*;  
    import java.awt.*;  
    import java.text.*;  
    import java.util.*;  
    public class DigitalWatch implements Runnable{  
    JInternalFrame f;  
    Thread t=null;  
    int hours=0, minutes=0, seconds=0;  
    String timeString = "";  
    JButton b;  
      
    DigitalWatch(){  
        JFrame fr = new JFrame();
        
        f=new JInternalFrame();  
          
        t = new Thread(this);  
            t.start();  
          
        b=new JButton();  
            b.setBounds(100,100,100,50);  
          
        f.add(b);  
        f.setSize(300,400);  
          
        f.setVisible(true);  
        fr.setBounds(100,100,1000,1000);
        fr.add(f);
        fr.setVisible(true);
    }  
      
     public void run() {  
          try {  
             while (true) {  
      
                Calendar cal = Calendar.getInstance();  
                hours = cal.get( Calendar.HOUR_OF_DAY );  
                if ( hours > 12 ) hours -= 12;  
                minutes = cal.get( Calendar.MINUTE );  
                seconds = cal.get( Calendar.SECOND );  
      
                SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");  
                Date date = cal.getTime();  
                timeString = formatter.format( date );  
      
                printTime();  
      
                t.sleep( 1000 );  // interval given in milliseconds  
             }  
          }  
          catch (Exception e) { }  
     }  
      
    public void printTime(){  
    b.setText(timeString);  
    }  
      
    public static void main(String[] args) {  
        new DigitalWatch();  
              
      
    }  
    }  