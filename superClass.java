
class super_A { 
    int a  = 10 ; 
    super_A( ) {
        System.out.println("Costructor a is called ") ;        
    }
    void display_A()  {
        System.out.println("method a is called") ; 
    }
}
class super_B extends super_A{ 
    int b  = 20 ; 
    super_B( ) {
        super() ;
        System.out.println("Costructor b is called ") ;        
    }
    void display_B()  {
         System.out.println(super.a) ;    
        super.display_A() ; 
        System.out.println("method b is called") ; 
    }
}

 
public class superClass {
 public static void main ( String args[]) {
        // super_B a = new super_B() ; 
        // a.display_B();

 }
}
