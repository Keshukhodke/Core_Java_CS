package Constructor_29_09_25;

import Constructor_25_09_25.Example2;

public class Example6 {
    int a  ;
    {
        System.out.println("inside non static block");
        a=10;
    }
    Example6()
    {
        System.out.println("inside 0 Arg const");
    }

    public static void main(String[] args) {
        System.out.println("start");
        Example6 ref1 = new Example6();
        System.out.println("stop");
    }
}
