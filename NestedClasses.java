// static inner class 

class  Outer {
    void display() {
        System.out.println("Outer Class") ;
    }
    static  class Inner{
    void display1() {
        System.out.println("Inner Class") ;
    }
    }
}

class local_method {
    void  display() {
        System.out.println("outer class") ;
        class Inner_local {
            void show() {
                System.out.println("inner class") ;
            }
        }
        Inner_local a = new Inner_local () ; 
        a.show()  ; 

    }
}

class Outer1{
    class Inner1{
        void display() { 
            System.out.println( "here i am ") ;
        }
    }
}

public class  NestedClasses {
    public static void main ( String args[]) {
        Outer.Inner a = new Outer.Inner() ; 
        a.display1() ; 

        local_method b = new local_method() ; 
        b.display() ; 

        Outer1 c = new Outer1() ; 
        Outer1.Inner1 d = c.new Inner1() ; 
        d.display() ; 
    }
}