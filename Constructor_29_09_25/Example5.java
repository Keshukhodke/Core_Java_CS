package Constructor_29_09_25;

public class Example5 {
    {
        System.out.println("inside non static block --1 ");
    }
    {
        System.out.println("inside non static block --2 ");
    }

    Example5() {
        System.out.println("inside 0 Arg const");
    }

    Example5(int a) {
        System.out.println("inside 1 Arg const: " + a);
    }

    public static void main(String[] args) {
        System.out.println("start");

        Example5 ref1 = new Example5();      // calls 0 arg
        Example5 ref2 = new Example5();      // calls 0 arg again
        Example5 ref3 = new Example5(1555);  // calls 1 arg with 1555
        Example5 ref4 = new Example5(20);    // calls 1 arg with 20
        Example5 ref5 = new Example5(9999);  // calls 1 arg with 9999

        System.out.println("stop");
    }
}
