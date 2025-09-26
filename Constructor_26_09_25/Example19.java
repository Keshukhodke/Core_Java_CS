package Constructor_26_09_25;
//Constructor call must be the first statement in a constructor
public class Example19 {
    Example19( )
    {
        System.out.println("inside 0 arg const");
    }
    void m1( )
    {
        // this( );

        new Example19( );

    }

    public static void main(String[] args) {
        System.out.println("start");
        Example19 ref = new Example19();
        ref.m1();
        System.out.println("stop");
    }
}
