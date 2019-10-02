import java.awt.*;

public class Example {
  public static void main(String[] args) {
    DrawingPanel panel = new DrawingPanel(400, 400); // creates a 400x400 panel
    Graphics g = panel.getGraphics(); // get the Graphics component and pass into variable
                                      // so you can draw shapes
    
    g.setBackground(Color.WHITE);
    g.setColor(Color.CYAN);
    g.fillRect(100, 100, 200, 100); // draw a cyan 200x100 rectangle with top left at (100, 100)
  }
}
