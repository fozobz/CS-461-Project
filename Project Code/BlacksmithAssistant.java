import javax.swing.*;


public class BlacksmithAssistant {

    public static void main(String[] args) {
        int sizeScalar = 80;
        int w = 16 * sizeScalar;
        int h = 9 * sizeScalar;
        JFrame window = new JFrame();
        window.setSize(w, h);
        window.setTitle("Blacksmithing Curve Assistant");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

    }
    
}