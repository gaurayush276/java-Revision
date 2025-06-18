
class single_A{
     void swimming ( ) {
        System.out.println("Can swim") ; 
     }
}

class single_B extends single_A {
    void fight () {
        System.out.println("Can fight") ; 
    }
}

class hierarchical_A { 
    void  sing ( ) {
        System.out.println("H A") ; 
    }
}



class hierarchical_B extends hierarchical_A { 
    void sketting ( ) {
        System.out.println("H b") ; 
    }
}
class hierarchical_c extends hierarchical_A { 
    void sketting ( ) {
        System.out.println(" h C") ; 
    }
}

class hybrid_A{
     void disA( ) {
        System.out.println("a") ; 
     }
}

class hybrid_B extends hybrid_A{
     void disB ( ) {
        System.out.println("b") ; 
     }
}

class hybrid_C extends hybrid_B{
     void disC ( ) {
        System.out.println("c") ; 
     }
}
class hybrid_D extends hybrid_B{
     void disD ( ) {
        System.out.println("d") ; 
     }
}

// example of multiple inheritance  interface 

interface inter_A { 
        abstract void callA ( ) ;
}
interface inter_B { 
        abstract void callB ( ) ;
}
 
 class multiple implements inter_A , inter_B {
    public void callA () {
        System.out.println("Calls A "); 
    }
    public void callB () {
        System.out.println("Calls B "); 
    }
 }

 
public class inheritance {
    public static void main ( String args[]) {
        // single_A a = new single_A() ; 
        // single_B b = new single_B() ; 
        // a.swimming() ; 
        // b.swimming() ; 
        // b.fight() ; 
        // hierarchical_A a = new hierarchical_A() ; 
        // hierarchical_B b= new hierarchical_B() ; 
        // hierarchical_c c = new hierarchical_c() ; 
        // a.sing() ; 
        // b.sing() ; 
        // c.sing() ; 
        // hybrid_C c = new hybrid_C() ; 
        // c.disA(); 
        // c.disB(); 
        // c.disC(); 
        multiple m = new multiple() ; 
        m.callA(); 
        m.callB(); 
    }
}