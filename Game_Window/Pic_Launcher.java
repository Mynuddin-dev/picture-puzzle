package Game_Window;
import java.awt.Color;
public class Pic_Launcher {
    public Pic_Launcher(){
        Puzzle puzzle = new Puzzle();
	puzzle.setVisible(true);
        puzzle.setBounds(400, 200, 1200, 750);
        
    }
	public static void main(String[] args){
            new Pic_Launcher();
		
	}
}

