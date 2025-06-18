class Daemon_Demo extends Thread { 
        public void run () {
            if ( Thread.currentThread().isDaemon() )
            System.out.println("Deamon thread works") ;
            else 
            System.out.println("user Thread works") ;
        }
}

public class Daemon {
      public static void main ( String args[]) {
        Daemon_Demo a = new Daemon_Demo () ; 
        Daemon_Demo b = new Daemon_Demo () ; 
        Daemon_Demo c = new Daemon_Demo () ; 
        a.setDaemon(true)  ;
        a.start() ; 
        b.start() ; 
        c.start() ; 
        
      }
}
