import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class GraphicalPreview extends JComponent{

    public GraphicalPreview(int w, int h){
        int width = w;
        int height = h;
    }
    public void drawObject(Graphics g, int width, int height){
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D.Double r = new Rectangle2D.Double(0,0, width/5, height/5);
        g2.draw(r);
    }
}
