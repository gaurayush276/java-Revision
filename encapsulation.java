class Bank { 
    private int  balance ; 
    public String name ; 
    private  int account ;
    
    void setBalance ( int val ) {
        this.balance = val ; 
    }
    void setAccount ( int val ) {
        this.account = val ;
    }
    int getBalance (  ) {
        return this.balance ; 
    }
    void setname( String val ) {
        this.name = val ;
    }
    String getName (  ) {
        return this.name ; 
    }
    int getAccount (  ) {
        return this.account ; 
    }

    void addBalance ( int val ) {
        this.balance += val ; 
    }


}


public class encapsulation {
    public static void main(String args[]) {

    
      Bank a = new Bank() ;
      a.setAccount(123456) ; 
      a.setBalance(900000) ; 
      System.out.println(a.getAccount()  );
      System.out.println(a.getBalance()  );
      a.setname("John")  ; 
      System.out.println(a.getName() );
 }
}