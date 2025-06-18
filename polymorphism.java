// compile time ---- mehtod overlaoding 

class Poly_demo_1 { 
    void dispaly ( int a , int b ) {
        System.out.println(a+b ) ; 
    }
    void dispaly ( int a , int b , int c  ) {
        System.out.println(a+b + c ) ; 
    }
}
class Poly_demo_2 { 
    void dispaly ( int a , int b ) {
        System.out.println(a+b ) ; 
    }
    void dispaly ( float a, float b   ) {
        System.out.println(a+b ) ; 
    }
}


// run time method overriding 

class poly_parent {
    void display ( ) { 
        System.out.println("Parent");
    }
}

class poly_child extends poly_parent {
    void display ( ) { 
        System.out.println("child");
    }
}


public class polymorphism {
    public static void main (String args[]) {
        // Poly_demo_1 a = new Poly_demo_1() ; 
        // Poly_demo_2 b = new Poly_demo_2() ; 
        // a.dispaly(1,2) ; 
        // a.dispaly(1,2,3) ; 
        // b.dispaly(1,2);
        // b.dispaly(3.0f,2.0f);
        poly_parent p1 = new poly_parent() ;
        poly_child p2 = new poly_child() ;
        p1.display(); 
        p2.display(); 

    }
}