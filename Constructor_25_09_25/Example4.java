package Constructor_25_09_25;

public class Example4 {
    Example4()
    {
        System.out.println("inside 0 args constructor ");

    }
    Example4(int a ) {
        System.out.println("inside 1 arg constructor "+a);
    }

    public static void main(String[] args) {
        System.out.println("start");
        Example4 ref = new Example4(100);
        Example4 ref1 = new Example4(4555);
    }
}
