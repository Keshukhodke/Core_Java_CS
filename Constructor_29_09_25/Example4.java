package Constructor_29_09_25;

import Constructor_25_09_25.Example2;

public class Example4
{
    {
        System.out.println("inside non static block");
    }
    Example4( )
    {
        System.out.println("inside 0 Arg const");
    }
    public static void main(String[] args) {
        System.out.println("start");
        Example4  ref = new Example4();
        System.out.println("stop");

    }
}
