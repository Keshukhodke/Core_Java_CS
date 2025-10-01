package Non_Static_30_09_25;

import Constructor_26_09_25.Example20;

public class Example3 {

    static
    {
        System.out.println("inside static block");
    }
    {
        System.out.println("inside non static block");
    }

    public static void main(String[] args) {
        System.out.println("start");
        new Example3();
        new Example3();
        System.out.println("stop");
    }
}
