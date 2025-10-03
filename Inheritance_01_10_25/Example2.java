package Inheritance_01_10_25;

class A
{
    int a= 11;
    void m1()
    {
        System.out.println("inside m1 method"+a);
    }
}
class B extends A{
    float b= 20.5f;
    void m2()
    {
        System.out.println("inside m2 method"+b);
    }
}


public class Example2 {
    public static void main(String[] args) {
        A a= new A();
        a.m1();
        B b= new B();
        b.m2();
        b.m1();
    }
}
