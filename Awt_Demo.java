import java.awt.* ;
import java.awt.Frame ; 

public class Awt_Demo {
    Awt_Demo () {
        Frame f = new Frame() ; 
        Button btn = new Button("hello world") ; 
        btn.setBounds( 50, 60 , 50 ,20) ; 
        f.add(btn) ; 
        f.setSize(200 , 100 ) ;
        f.setTitle("Awt") ; 
        f.setVisible(true) ; 
        f.setLayout(null) ; 

    }


    public static void main(String args[]) {
        new Awt_Demo() ; 
    }
}
