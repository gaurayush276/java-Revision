
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

public class inheritance {
    public static void main ( String args[]) {
        single_A a = new single_A() ; 
        single_B b = new single_B() ; 
        a.swimming() ; 
        b.swimming() ; 
        b.fight() ; 

    }
}