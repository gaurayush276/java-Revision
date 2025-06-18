import java.awt.*;
import java.awt.Frame;

public class testGraphics extends Frame{

    testGraphics() {
        setTitle("Graphics") ; 
        setVisible(true) ; 
        setSize( 500 , 500 ) ; 
    }

    public void paint(Graphics g) {
        // g.drawLine( 100 , 100 , 200 ,200 ) ;
        g.drawOval(100 , 200 , 200 ,200 )  ; 
        g.drawRect(50 , 100 , 50 , 20 ) ; 

    }
    public static void main  (String args []) {
        new testGraphics () ; 
    }
}
