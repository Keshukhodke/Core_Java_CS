package Constructor_29_09_25;

public class Example9 {
    int a;

    // Non-static block
    {
        System.out.println("inside non static block " + a);
    }

    // 0-arg constructor
    Example9() {
        System.out.println("before 0 arg const " + a);
        a = 100;
        System.out.println("after 0 arg const " + a);
    }

    // 1-arg constructor
    Example9(int x) {
        System.out.println("before 1 arg const " + a);
        a = x;
        System.out.println("after 1 arg const " + a);
    }

    public static void main(String[] args) {
        System.out.println("start");

        Example9 ref1 = new Example9();      // calls 0-arg constructor
        Example9 ref2 = new Example9(1000);  // calls 1-arg constructor

        System.out.println("ref1.a = " + ref1.a);  // prints value of 'a' in ref1
        System.out.println("ref2.a = " + ref2.a);  // prints value of 'a' in ref2

        System.out.println("stop");
    }
}
