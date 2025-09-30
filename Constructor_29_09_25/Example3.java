package Constructor_29_09_25;

import Constructor_25_09_25.Example2;

public class Example3
{
    {
        System.out.println("inside non static block---1");
    }
    {
        System.out.println("inside non static block --2 ");
    }

    public static void main(String[] args) {
        System.out.println("start");
        Example3 ref = new Example3();
        System.out.println("stop");
    }
}
