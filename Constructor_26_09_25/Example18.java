package Constructor_26_09_25;

// we can use only one constructor then compiler will never create default
// we can use only one new keyword in the constructor
public class Example18 {
    Example18 ( )
    {
        this(10);
      //  this(10,20.5f);
        System.out.println("inside o Arg const");
    }
    Example18(int a )
    {
        this(10, 18.3f);
        System.out.println("inside 1 Arg const");
    }
    Example18(int a, float b )
    {
        this(10, 23.4f , 56  );
        System.out.println("inside 2 Arg const");
    }

    Example18(int a, float b , int x   )
    {
        System.out.println("inside 4 arg const");
    }

    public static void main(String[] args) {
        System.out.println("start");
        Example18  ref = new Example18( );
        System.out.println("stop");

    }
}
