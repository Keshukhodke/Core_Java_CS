package Constructor_25_09_25;

public class Example6 {

    int a; // instance variable

    Example6() {
        System.out.println("inside 0 args " + a); // prints default value 0
        a = 10; // initialize a
    }

    void m1() {
        System.out.println("method m1 " + a); // prints updated value 10
    }

    public static void main(String[] args) {
        Example6 ref = new Example6(); // constructor called
        ref.m1();                     // method called
        System.out.println("stop");
    }
}
