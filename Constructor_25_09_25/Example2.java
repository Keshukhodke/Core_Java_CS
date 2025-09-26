package Constructor_25_09_25;

// to return the control from the constrcuctor we use return statments.
// if we do not add return statment the compiler add return statment
// based on the number of objects we can create multiple class
public class Example2 {
    Example2()
    {
        System.out.println("inside 0 arg constructor ");
        return;
    }
    void   Example3()
    {
        System.out.println("inside void ");
    }

    public static void main(String[] args) {
        System.out.println("start");

        Example2 ref = new Example2();
        ref.Example3();

        System.out.println("stop");
    }
}
