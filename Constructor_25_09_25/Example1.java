package Constructor_25_09_25;

// Constructor (no arguments)
public class Example1 {
     Example1 ()
     {
         System.out.println("inside 0 arguments ");
     }

    public static void main(String[] args) {
        System.out.println("start");

        // Object creation -> constructor is called

        Example1 ref = new Example1();
        System.out.println("stop");

    }
}
