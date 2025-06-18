
// Generic Class 

class generic_demo <T> { 
        T val ; 

        generic_demo(  T val ){
            this.val = val ; 
        }

        T  getVal ( ) {
            return this.val ; 
        }
}

// Generic Method 
class generic_method{
        public <T> void method ( T val ) {
            System.out.println(val) ;
        }
}

public class generics {
    public static void main(String[] args) {
            generic_demo < Integer> a = new generic_demo <>( 5) ; 
            System.out.println( a.getVal() ) ;
            generic_demo < String>  b = new generic_demo <>( "John") ; 
            System.out.println( b.getVal() ) ;

            generic_method c = new generic_method() ; 
            c.<Integer>method(5) ; 
            c.<String>method("JAVA") ; 
        
    }
}
