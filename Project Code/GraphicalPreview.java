import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class GraphicalPreview extends JComponent{

    private Spiral spiral;

    public GraphicalPreview(int w, int h){
        int width = w;
        int height = h;
        spiral = new Spiral(5, 5, 3);
    }
    protected void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

        spiral.drawSpiral(g2, 0, 100);
    }
}
