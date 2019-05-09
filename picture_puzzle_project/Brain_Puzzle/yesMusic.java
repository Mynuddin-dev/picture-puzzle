
package picture_puzzle_project.Brain_Puzzle;
import sun.audio.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class yesMusic
{
public static void main(String[] args)
{
    new yesMusic();
   
}
   

    public yesMusic() 
    {       
        AudioPlayer MGP = AudioPlayer.player;
        AudioStream BGM;
        AudioData MD;

        ContinuousAudioDataStream loop = null;

        try
        {
            InputStream test = new FileInputStream("D:\\Project\\Picture_Puzzle_Project\\picture-puzzle\\src\\picture_puzzle_project\\Brain_Puzzle\\yes-2.wav");
            BGM = new AudioStream(test);
            AudioPlayer.player.start(BGM);
            MD = BGM.getData();
            loop = new ContinuousAudioDataStream(MD);

        }
        catch(FileNotFoundException e){
            System.out.print(e.toString());
        }
        catch(IOException error)
        {
            System.out.print(error.toString());
        }
        MGP.start(loop);
    try {
        Thread.sleep(600);
    } catch (InterruptedException ex) {
    }
    MGP.stop(loop);
        
    
    
        
        
    }
    


}