
// synchronized block 

class Table {
    void print( int n ) { 
        synchronized(this) {
     for ( int i = 1 ; i <= 10; i++ ) {
                System.out.println(i * n ) ; 
            }
        }

    }
}
class Thread_sync_1  extends Thread { 
     Table t1 ; 
    Thread_sync_1( Table t) {
        this.t1 = t ; 
    }
        public void run () {
           t1.print(5);
        }
}
class Thread_sync_2  extends Thread { 
    Table t1 ; 
    Thread_sync_2( Table t) {
        this.t1 = t ; 
    }
        public void run () {
             t1.print(2) ; 
        }
}


// synchronized method 

 



public class synchronization {
    public static void main(String[] args) {
        Table t = new Table () ; 
        Thread_sync_1 a = new Thread_sync_1(t)  ; 
        Thread_sync_2 b = new Thread_sync_2(t)  ; 
        a.start() ;
        b.start();
    }
}


//  in the below it is not working correctly beacuse it does not access the same resource  because we are creating different table but in the first one we are accessing the same table 



// // synchronized block 

// class Table {
//     void print( int n ) { 
//         synchronized(this) {
//      for ( int i = 1 ; i <= 10; i++ ) {
//                 System.out.println(i * n ) ; 
//             }
//         }

//     }
// }
// class Thread_sync_1  extends Thread { 
//      Table t1  = new Table(); 
//     // Thread_sync_1( Table t) {
//     //     this.t1 = t ; 
//     // }
//         public void run () {
//            t1.print(5);
//         }
// }
// class Thread_sync_2  extends Thread { 
//    Table t1  = new Table(); 
//     // Thread_sync_2( Table t) {
//     //     this.t1 = t ; 
//     // }
//         public void run () {
//              t1.print(2) ; 
//         }
// }


// public class synchronization {
//     public static void main(String[] args) {
//         // Table t = new Table () ; 
//         Thread_sync_1 a = new Thread_sync_1()  ; 
//         a.start() ;
//         Thread_sync_2 b = new Thread_sync_2()  ; 
//         b.start();
//     }
// }



