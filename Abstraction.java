abstract class absClass {
    absClass() { 
        System.out.println("this is the absClass constructor ") ; 
    }
    abstract void method () ; 

    void display ()  {
        System.out.println("display method ") ; 
    }
}

class tempAbsClass extends absClass {
        public void method ( ) {
            System.out.println("Abstract class method called")  ; 
        }

}

public class Abstraction {
    public static void main ( String  args[]) {
        tempAbsClass a = new tempAbsClass() ; 
        a.method() ;
        a.display()  ; 
    }
}
