package Constructor_29_09_25;

public class Example2 {
    {
        System.out.println("inside non static block");
    }

    public static void main(String[] args) {
        System.out.println("start");
        Example2 ref1 = new Example2();
        Example2 ref2 = new Example2();
        Example2 ref3 = new Example2();

        System.out.println("stop");
    }
}
