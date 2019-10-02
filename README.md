# Java Sketchbook
Uses DrawingPanel class written by Stuart Reges and Marty Stepp.

Download `DrawingPanel.java` and place it in the same folder as your `.java` file  
or just clone the repo and run your file from there.

Open your file in a Java IDE (e.g. jGrasp, BlueJ, etc.)

At the top of you code, write `import java.awt.*;`  

Here's an example to get started:  

```java
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
```
