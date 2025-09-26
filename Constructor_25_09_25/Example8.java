package Constructor_25_09_25;

public class Example8 {
    Example8()
    {
        System.out.println("inside 0 arg const");
    }
    Example8(int a)
    {
        System.out.println("inside 1 args ");
    }

    public static void main(String[] args) {
        System.out.println("start");
        Example8 ref1 = new Example8();
        Example8 ref2 = new Example8(15);
        System.out.println("stop");
    }
}
