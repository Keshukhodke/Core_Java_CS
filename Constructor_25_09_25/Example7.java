package Constructor_25_09_25;
// we can use this keyword within the constructor
public class Example7 {
    int a;
    Example7(int a)
    {
        System.out.println("inside local 0 args:- "+a);
       this.a= a;
    }
    void m1()
    {
        System.out.println("inside m1 method "+ a);
    }

    public static void main(String[] args) {
        System.out.println("start");

        Example7 ref = new Example7(451);
        ref.m1();
        System.out.println("stop");
    }
}
