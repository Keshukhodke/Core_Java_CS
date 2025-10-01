package Constructor_29_09_25;

public class Example11 {
    int a;
    Example11(int a )
    {
        this();
        this.a = a;
        System.out.println("inside 1 Arg const:- "+this.a);
    }
    Example11( )
    {
        System.out.println("inside o Arg const :- "+this.a);
    }
    void m1(int a)
    {
        this.a = a;
        System.out.println("inside m1 method :- "+this.a);
    }

    public static void main(String[] args) {
        System.out.println("start");
        Example11 ref = new Example11(100);
        ref.m1(15000);

        System.out.println("stop");
    }
}
