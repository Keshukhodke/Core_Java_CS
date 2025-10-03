package Inheritance_01_10_25;

class AAA {
    int a = 10;
    void m1() {
        System.out.println("inside m1 method :- " + a);
    }
}

// Child class of AAA
class BBB extends AAA {
    float b = 20.5f;
    void m2() {
        System.out.println("inside m2 method :- " + b);
    }
}

// Another child class of AAA
class CCC extends AAA {
    char c = 'y';
    void m3() {
        System.out.println("inside m3 method :- " + c);
    }
}

// Another child class of AAA
class DDD extends AAA {
    boolean d = true;
    void m4() {
        System.out.println("inside m4 method :- " + d);
    }
}

public class Example4 {
    public static void main(String[] args) {
        AAA a1 = new AAA();
        a1.m1();
        System.out.println("---------");

        BBB b1 = new BBB();
        b1.m2();
        b1.m1();
        System.out.println("---------");

        CCC c1 = new CCC();
        c1.m1();
        c1.m3();   // ✅ Corrected
        System.out.println("---------");

        DDD d1 = new DDD();
        d1.m1();
        d1.m4();
        System.out.println("---------");
    }
}
