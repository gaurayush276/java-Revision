import java.util.Arrays;

class ArrayMethods { 
    void displaySort () {
        int arr[] = { 5,34,8,4,3,6,4,2,34,46,4} ; 
        
        Arrays.sort(arr) ; 

        for ( int i : arr) 
        System.out.print( i + " "); 
    }

    void displayFill() {
        int arr[] = new int[10] ; 

        Arrays.fill(arr, 2) ; 

        for ( int i : arr ) 
        System.out.print( i + " ") ; 
    }
    void displayCopy( ) {
        int arr [ ] ={ 1,2,3,4,5}; 
        int n = arr.length ; 
        System.out.println(n) ;
        
        int brr[] = Arrays.copyOf( arr , 5 ) ; 

        for ( int i : brr )  
        System.out.print(i + " ") ;
        
        
    }

    void displayEqual ( ) {
        int arr[] = { 1,2,3,4,5} ; 
        int brr [] = { 1,2,3,4,5} ; 
        boolean  find = Arrays.equals( arr ,brr ) ; 
        System.out.println(find) ;
        
    }
}

public class Array {
    public static void main ( String  args []) {
        int arr[] = new int[10] ; 

        // conspile time initilazation 
        // int arr[]  = { 1,2,3,4,5,6,7,8,9,10} ; 

        // run time initialization 
        for ( int i = 0 ; i < 10 ; i++ ) {
            arr[i] = i +1 ; 

        }
        for ( int i = 0 ; i < 10 ; i++ ) {
            System.out.println(arr[i]) ; 
        }
 
        // 2 D array 
   
        int matrix [][] = new int [3][3] ; 
        for ( int i = 0 ; i < 3 ; i++ ) {
           for ( int j = 0 ; j <3 ; j++  ) {
            matrix[i][j] = i +j + 1 ;  
           }
        }
        for ( int i = 0 ; i < 3 ; i++ ) {
            for ( int j = 0 ; j < 3 ; j++  ){
                System.out.print(matrix[i][j] + "\t") ;
            }
            System.out.println() ; 
        }

        ArrayMethods a = new ArrayMethods() ; 
        a.displaySort() ; 
        System.out.println("");
        a.displayFill() ; 
        System.out.println() ;
        a.displayCopy();
        System.out.println() ;
        a.displayEqual() ; 
    }
}
