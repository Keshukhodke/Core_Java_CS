package Non_Static_30_09_25;

//When you run a Java program, the JVM first loads the class into memory.
//
//During class loading, all static members (variables, blocks, static initializers) are executed once in the order they appear.
//Only after the class is loaded, the JVM looks for the main() method and starts executing it.
public class Example1 {
    static
    {
        System.out.println("inside static block");
    }

    public static void main(String[] args) {
        {
            System.out.println("start");

            System.out.println("stop");
        }
    }
}
