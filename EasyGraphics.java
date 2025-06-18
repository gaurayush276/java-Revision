import java.awt.*;
import java.awt.Frame;

public class EasyGraphics extends Frame {

    EasyGraphics() {
        setTitle("Easy Java Graphics");
        setSize(400, 300);
        setVisible(true);
    }

    public void paint(Graphics g) {
        // Draw a line
        g.drawLine(50, 50, 200, 50);

        // Draw a rectangle
        g.drawRect(50, 70, 150, 50);

        // Draw a circle (oval with equal width and height)
        g.drawOval(50, 130, 50, 50);

        // Draw a string
        g.drawString("Hello Graphics!", 50, 200);
    }

    public static void main(String[] args) {
        new EasyGraphics();
    }
}
