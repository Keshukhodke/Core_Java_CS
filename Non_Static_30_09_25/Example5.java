package Non_Static_30_09_25;

// 👉 When do you use static blocks?
// Static blocks are primarily used for 2 reasons:
// 1) To initialize static variables during class loading (before any object creation).
// 2) To implement business logic that must execute only once when the class is loaded.

public class Example5 {

    // static variable (shared among all objects of this class)
    static int a;

    // static block
    static {
        System.out.println("inside static block, value of a = " + a);
        // default value of int 'a' is 0 here
        a = 10; // initialize 'a' explicitly
    }

    public static void main(String[] args) {
        System.out.println("start");
        // by this point, static block has already executed (a=10)
        System.out.println("the value of a is " + a);
        System.out.println("stop");
    }
}
