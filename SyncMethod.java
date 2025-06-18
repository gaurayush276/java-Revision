class Table_M {
     synchronized void print( int n ) {
        for ( int i = 1 ; i <= 10 ; i++ )
        System.out.println(i*n) ;
    }
}

class Thread_syncM_1  extends Thread { 
     Table_M t1 ; 
    Thread_syncM_1( Table_M t) {
        this.t1 = t ; 
    }
        public void run () {
           t1.print(2);`
        }
}
class Thread_syncM_2  extends Thread { 
     Table_M t1 ; 
    Thread_syncM_2( Table_M t) {
        this.t1 = t ; 
    }
        public void run () {
           t1.print(5);
        }
}

public class SyncMethod {
    public static void main ( String args [ ]) {
        Table_M t = new Table_M() ;
        Thread_syncM_1 a = new Thread_syncM_1(t) ; 
        a.start() ; 
        Thread_syncM_2 b = new Thread_syncM_2(t) ; 
        b.start() ; 
    }
}
