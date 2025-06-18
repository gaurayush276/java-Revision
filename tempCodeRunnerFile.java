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


public class polymorphism {
    public static void main (String args[]) {
        Poly_demo_1 a = new Poly_demo_1() ; 
        Poly_demo_2 b = new Poly_demo_2() ; 
        a.dispaly(1,2) ; 
        a.dispaly(1,2,3) ; 

    }
}