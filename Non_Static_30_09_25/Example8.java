package Non_Static_30_09_25;

// If a program contains multiple classes,
// JVM will not load all classes at once.
// JVM loads a class only when it's required (dependency).
// For example, in this code: first 'Example8' is loaded,
// and then 'simple' is loaded only when we create its object.

class simple {
    // static block → executes ONLY ONCE when the class is loaded
    static {
        System.out.println("inside static block");
    }

    // non-static block → executes EVERY TIME when an object is created
    {
        System.out.println("inside non static block");
    }
}

public class Example8 {
    public static void main(String[] args) {
        System.out.println("start");

        // first time 'simple' class is needed, JVM loads it
        // 👉 loads 'simple' → runs static block → then runs constructor (with non-static block)
        simple s1 = new simple();

        // second object → static block will NOT run again
        // (because class 'simple' is already loaded),
        // but non-static block will run again
        simple s2 = new simple();

        System.out.println("stop");
    }
}
