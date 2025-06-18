import java.awt.* ; 


public class form extends Frame {
            form() {
                Frame f = new Frame() ; 
                Label  l1 = new Label( "first Name ") ;
                Label  l2 = new Label( "last Name") ;
                f.setSize( 300 , 300 ) ; 
                l1.setBounds( 20 , 50 , 80, 20 ) ; 
                l2.setBounds ( 20, 80 ,80 , 20 ); 

                TextField t1 = new TextField() ; 
                TextField t2= new TextField() ; 
                  t1.setBounds( 120 , 80 , 80, 20 ) ; 
                t2.setBounds ( 120, 100 ,80 , 20 ); 

                f.add( l1) ; 
                f.add(l2 ) ; 
                Button b1 = new Button("Submit") ; 
                Button b2 = new Button("Cancel") ; 
                b1.setBounds( 20 ,60 ,100 , 30) ; 
                b2.setBounds( 20 , 160, 100 , 30) ; 
                f.add(b1) ;
                f.add(b2) ;

                f.setVisible(true) ; 

                
            }

    public static void main(String[] args) {
        new form() ; 
    }
}
