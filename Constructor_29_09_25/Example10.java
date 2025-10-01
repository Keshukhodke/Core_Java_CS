package Constructor_29_09_25;

public class Example10
{
    int a;
    Example10 (int a )
    {
        this();
        this.a = a;
        System.out.println("inside 1 arg const"+this.a);
    }
    Example10( )
    {
        System.out.println("inside 0 Arg const"+this.a);

    }

    public static void main(String[] args) {
        System.out.println("start ");
        Example10 ref = new Example10(100);

        System.out.println("stop");
    }
}
