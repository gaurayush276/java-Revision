// class Table {
//     synchronized void printTable(int n ){
//         for(int i=0 ; i< 10 ; i++){
//             System.out.println(n*i);
//         }
//     }
// }
// class Thread1 extends Thread{
//     Table t;
//     Thread1(Table t){
//         this.t = t;
//     }
//     public void run(){
//         t.printTable(5);
//     }
// }
// class Thread2 extends Thread{
//     Table t;
//     Thread2(Table t){
//         this.t = t;
//     }
//     public void run (){
//         t.printTable(7);
//     }
// }
// public class multiThreading{
//     public static void main(String args[]){
//         Table T= new Table();
//         Thread1 T1= new Thread1(T);
//         Thread2 T2 = new Thread2(T);
//         T1.start();
//         T2.start();
//     }
// }




class A extends Thread{
    public void run(){
        for(int i =0 ; i<50 ; i++){
            System.out.println("OOP");
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0 ; i<50 ;i++){
            System.out.println("Java");
        }
    }
}

public class multiThreading{
    public static void main(String args[]){
        A a = new A();
        B b = new B();
        a.setPriority(1);
        b.setPriority(3);
        a.start();
        b.start();
    }
}