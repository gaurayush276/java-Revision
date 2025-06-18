// example of copy constructor 

class Cons_demo {
    int a ; 

    Cons_demo ( int x ) {
        this.a  = x ; 
    }
    Cons_demo ( Cons_demo x ) {
        this.a  = x.a ;
    }
    void display ( ) {
        System.out.println("Constructor is called " + a ) ; 
    }
}

// example of construct overloading 
class  Cons_over{
    int a ; 
    int b ;
    int c  ; 
    Cons_over ( int x , int y ) {
        this.a = x ; 
        this.b = y ;
        System.out.println(a + b ) ; 
    }
    
    Cons_over( int x , int y , int z) {
        this.a = x ; 
        this.b = y ; 
        this.c = z ;
        System.out.println(a + b + c ) ;  
    }

    
}

public class constructror {
    public static void main(String[] args) {
        // Cons_demo a = new Cons_demo(5) ;
        // Cons_demo b = new Cons_demo(a) ; 
        // a.display( ) ;
        // b.display( ) ;
        Cons_over a = new Cons_over(1,2) ; 
        Cons_over b = new Cons_over(1,2, 3 ) ; 
    }
}
