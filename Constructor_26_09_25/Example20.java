package Constructor_26_09_25;

// First class
 class TestDemo
{

    TestDemo() {
        System.out.println("inside 0 arg const");
    }

    TestDemo(int a) {
        System.out.println("inside 1 arg const");
    }

    void m1() {
        System.out.println("inside method m1");
    }

    void m2() {
        System.out.println("inside method m2");
    }

    void m3() {
        System.out.println("inside method m3");
    }

    void m4() {
        System.out.println("inside method m4");
    }
}

// Second class with main()
public class Example20  {
    public static void main(String[] args) {
        System.out.println("start");

        // creating object using 0-arg constructor
        TestDemo ref1 = new TestDemo();

        // creating object using 1-arg constructor
        TestDemo ref2 = new TestDemo(10);

        // calling all 4 methods
        ref1.m1();
        ref1.m2();
        ref2.m3();
        ref2.m4();

        System.out.println("stop");
    }
}
