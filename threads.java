
// by extending thread 
class  Thread1 extends Thread {
 
  
       public void run ()  {
        for ( int i = 1 ; i <= 5 ; i++ )
        System.out.println( "Hello" ) ; ; 
       }
}
class  Thread2 extends Thread {
 
  
       public void run ()  {
        for ( int i = 1 ; i <= 5 ; i++ )
        System.out.println( "Java" ) ; ; 
       }
}

// by using runnable interface 
class Thread3 implements Runnable {
    public void run () {
        for ( int i = 0 ; i < 5 ; i++  )
        System.out.println("Runnable 1 ") ;
    }
}
class Thread4 implements Runnable {
    public void run () {
        for ( int i = 0 ; i < 5 ; i++  )
        System.out.println("Runnable 2 ") ;
    }
}

public class threads {
     public static void main(String[] args) {
         Thread1 a = new Thread1() ; 
         a.start() ; 
         Thread2 b = new Thread2() ; 
        b.start() ; 



        Thread3 c = new Thread3() ; 
        Thread  obj1 = new Thread(c) ; 
        obj1.start() ; 
        Thread4 d = new Thread4() ; 
        Thread  obj2 = new Thread(d); 
        obj2.start() ; 

        System.out.println(a.getName()) ;
        System.out.println(b.getName()) ;
        a.setName ( "first ") ; 
        b.setName ( "second ") ; 
        System.out.println(a.getName()) ;
        System.out.println(b.getName()) ;
     }
}






