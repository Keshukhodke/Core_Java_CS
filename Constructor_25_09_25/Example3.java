package Constructor_25_09_25;

// based pn the number of times we can create an objects or based on  the new keyword

public class Example3 {

    Example3()
    {
        System.out.println("inside 0 args constructor ");

    }


    public static void main(String[] args) {
        System.out.println("start");

        Example3 ref = new Example3();
        Example3 ref2  = new Example3();
        Example3 ref3 = new Example3();
        System.out.println("stop");
    }
}
