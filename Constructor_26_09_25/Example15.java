package Constructor_26_09_25;

public class Example15 {
    Example15( )
    {
        this(10);
        System.out.println("inside 0 Arg const");
    }
    Example15(int a)
    {
        System.out.println("inside 1 Arg const");
    }

    public static void main(String[] args) {
        System.out.println("start");
        new Example15();
        System.out.println("stop");
    }
}
