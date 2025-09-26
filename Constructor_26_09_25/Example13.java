package Constructor_26_09_25;

public class Example13 {
    Example13( )
    {
        System.out.println("inside 0 Args const");
        //this(10);
    }
    Example13(int a )
    {
        System.out.println("inside 1 Arg const");
    }

    public static void main(String[] args) {
        System.out.println("start");
        Example13 ref1 = new Example13();
        System.out.println("stop");
    }
}
