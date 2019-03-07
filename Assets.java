
package Game_Window;


import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;




public class Assets extends Canvas{
    
    Canvas canvas ;
    private static final int width=40, height=32;
    public static BufferedImage sub1, sub2, sub3, sub4 ;
    public void init(){
    SpriteSheet Sheet = new SpriteSheet(LoadImage.loadImage("get.png"));
    
    sub1 = Sheet.crop(0 ,0, width, height);
    sub2 = Sheet.crop(41 ,32, width, height);
    sub3 = Sheet.crop(42 ,65, width, height);
    sub4 = Sheet.crop(42 ,97, width, height);
    canvas = new Canvas();
    
   
    
    }
   
    
    public void render(){
        BufferStrategy bs = canvas.getBufferStrategy();
        if(bs==null){
            canvas.createBufferStrategy(4);
            return;
        }
        Graphics g = bs.getDrawGraphics();
        g.clearRect(0, 0, width, width);
        g.drawImage(sub1, 100, 200, null);
        
        bs.show();
        g.dispose();
    }
}
