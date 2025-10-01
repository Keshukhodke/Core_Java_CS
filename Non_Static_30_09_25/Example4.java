package Non_Static_30_09_25;

// 👉 A class during execution is loaded only once into JVM.
// 👉 When class is loaded, static blocks are executed automatically.
// 👉 In Java versions <= 1.6, you could run a program without a main() method
//    (just static blocks would execute).
// 👉 From Java 1.7 onwards, declaring a main() method is mandatory,
//    otherwise you'll get "main method not found" error.

public class Example4 {
    // Static block
    static {
        System.out.println("inside static block");
    }
}
