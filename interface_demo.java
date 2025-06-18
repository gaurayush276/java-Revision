// interface extending 

interface  interface_parent {
    abstract   void sum ( int a , int b ) ; 
    abstract   void diff( int a, int b ) ; 
}

interface interface_child extends interface_parent {
    abstract void prod( int a , int b )  ;
}
class class_to_interface  implements interface_child{
    public  void sum( int a  , int b ) {
        System.out.println(a+ b ) ;
    }
    public  void diff( int a  , int b ) {
        System.out.println(a- b ) ;
    }
    public  void prod( int a  , int b ) {
        System.out.println(a* b ) ;
    }
}

public class interface_demo {
    public static void main ( String args[]) {
    class_to_interface a = new class_to_interface() ; 
    a.sum( 2,1 ) ; 
    a.diff( 2,1 ) ; 
    a.prod( 2,1 ) ; 
    }
}
