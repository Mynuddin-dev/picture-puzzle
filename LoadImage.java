
package Game_Window;

//@author md. mahabub alam

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;


public class LoadImage {
    public static BufferedImage loadImage(String path){
        try { 
            return ImageIO.read(LoadImage.class.getResource(path));
        } catch (IOException ex) {
            Logger.getLogger(LoadImage.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null ;
    } 
}
