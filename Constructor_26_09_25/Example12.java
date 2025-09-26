package Constructor_26_09_25;


// this keywords reffers ti the current pobjects
public class Example12 {
int a;
    Example12()
    {
       // this(100);
        System.out.println("inside o arg const");
        new Example12(50);

    }
    Example12(int a)
    {
         // this.a = a;

        System.out.println("inside 1 arg const");

    }

    public static void main(String[] args) {
        System.out.println("start");

        Example12 ref1 = new Example12();
        System.out.println("stop");
    }
}
