
package Game_Window;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class SpriteSheet extends JPanel{
    
    BufferedImage bimg ;  
    Graphics2D g;
    
    public SpriteSheet(BufferedImage bimg){
        this.bimg = bimg ;
    }
    public BufferedImage crop(int x,int y, int width, int height){
        return bimg.getSubimage(x, y, width, height);
    }
   
    
}
