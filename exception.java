
// throw example 
class findExp{
    void check (int a )  {
        if ( a == 5 ) 
        throw new ArithmeticException("Restricted Number ") ; 
        else 
        System.out.println( a ) ; 
    }
}

// throws example 
class  calculator {
        void display ( int a , int b  ) throws ArithmeticException {
            if ( b == 0 )
            throw new ArithmeticException ("Divide by 0 ") ; 

            else System.out.println(a/b) ;
        }
}

public class exception {
    public static void main(String[] args) {
        // findExp a = new findExp () ; 
        // a.check(5) ; 

        calculator c =new calculator() ;
        try { 
           c.display( 10 , 0 ) ; 
        }
        catch( ArithmeticException e ) {
            System.out.println(e) ;
        }
        
    }
}
