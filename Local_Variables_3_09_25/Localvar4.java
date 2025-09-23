package Local_Variables_3_09_25;

// how to access static member from another class
class Demo {
    static int x = 100;
}

class Demo1 {
    static float y = 10.2f;
}

public class Localvar4 {
    public static void main(String[] args) {
        System.out.println("start");

        // Correct addition
        System.out.println("Addition of both class variables is " + (Demo.x + Demo1.y));

        // Access individually
        System.out.println("Demo.x = " + Demo.x);
        System.out.println("Demo1.y = " + Demo1.y);

        System.out.println("stop");
    }
}
