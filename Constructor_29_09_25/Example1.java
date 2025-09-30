package Constructor_29_09_25;

import Constructor_26_09_25.Example18;

public class Example1 {
    {
        System.out.println("inside non_static method");
    }

    public static void main(String[] args) {
        System.out.println("start");
        Example1  ref = new Example1();
        System.out.println("stop");
    }
}
