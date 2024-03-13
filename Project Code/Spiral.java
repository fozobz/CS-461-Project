import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class Spiral {

    public double width;
    public double density;
    public int inflectionCount;

    public Spiral(double width, double density, int inflectionCount){
        this.width = width;
        this.density = density;
        this.inflectionCount = inflectionCount;
    }

    private double getTheta(int i,Double b){
        return i/b;
    }

    private double getPolarX(double r, Double spiralAngle){
        return r * Math.sin(spiralAngle);
    }

    private double getPolarY(double r, Double spiralAngle){
        return r * Math.cos(spiralAngle);
    }

    public void drawSpiral(Graphics2D g2,int x, int y){
        Double b = 1.0;

        for (int i = 0; i < 10000; i++){
            Double spiralAngle = getTheta(i, b);

            double newX = getPolarX(i, spiralAngle);
            double newY = getPolarY(i, spiralAngle);
            Ellipse2D.Double ellipse = new Ellipse2D.Double(i*newX, i*newY,3,3);
            g2.setColor(Color.GREEN);
            g2.fill(ellipse);
        }
    }

}


