
package picture_puzzle_project;



import sun.audio.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class GameMusic
{
public static void main(String[] args)
{
    
}
   

    public static void music() 
    {       
        AudioPlayer MGP = AudioPlayer.player;
        AudioStream BGM;
        AudioData MD;

        ContinuousAudioDataStream loop = null;

        try
        {
            InputStream test = new FileInputStream("C:\\gameMusic.wav");
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
    }


}