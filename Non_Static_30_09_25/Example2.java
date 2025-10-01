package Non_Static_30_09_25;


// we can create minimum static block or we can create number of static block
//if they are multiple static block then the order of
//execuation will be top to bottom
public class Example2 {

    // This will be executed when the class is loaded into memory by JVM.
    static
    {
        System.out.println("inside static block--1");
    }
    static
    {
        System.out.println("inside static block --2");
    }
    // Runs only after the class is loaded and all static blocks are executed.

    public static void main(String[] args) {
        System.out.println("start");
        System.out.println("stop");
    }
}
