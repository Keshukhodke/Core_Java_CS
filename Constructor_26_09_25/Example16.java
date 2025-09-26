package Constructor_26_09_25;

class  Demo
{
    Demo ()
{
    System.out.println("inside 0 arg const- Demo");
}
Demo(int a)
{
    this( );
    System.out.println("inside 1 arg const - Demo ");
}
}

class simple
{
    simple()
    {
        System.out.println("inside 0 arg const- simple");
    }

    simple(float b )
    {
        this();
        System.out.println("inside 1 arg const- simple");
    }
}

public class Example16
{
    public static void main(String[] args) {
        System.out.println("start");
        new Demo(100);
        new simple(20.5f);

        System.out.println("stop");

    }
}
