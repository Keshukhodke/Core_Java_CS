package Memory_08_09_25;

// Class simple with two non-static methods
class simple {
    void m1() {
        System.out.println("inside m1 method");
    }

    void m2() {
        System.out.println("inside m2 method");
    }
}

// Main class
public class Non_Static_var5 {
    public static void main(String[] args) {
        System.out.println("Start");

        // Create object of simple class
        simple S = new simple();

        // Call non-static methods using object reference
        S.m1();
        S.m2();

        System.out.println("Stop");
    }
}
