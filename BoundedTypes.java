class Box<T extends Number> {
    T value;

    Box(T value) {
        this.value = value;
    }

    void show() {
        System.out.println( value );
    }
}

public class BoundedTypes {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>(10);
        b1.show();  // ✅ works

        Box<Double> b2 = new Box<>(5.5);
        b2.show();  // ✅ works

        // Box<String> b3 = new Box<>("Hello"); 
        // b3.show() ;                              // ERROR: String is not a subclass of Number
    }
}
