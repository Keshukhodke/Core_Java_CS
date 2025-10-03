package Inheritance_01_10_25;

class  AA
{
    int a= 100;
    void m1()
    {
        System.out.println("inside m1 method "+a);
    }
}
class BB extends A
{
    float b = 20.5f;
    void m2()
    {
        System.out.println("inside m1 method "+b);
    }
}
class CC extends B {
    char c = 'X';
    void m3()
    {
        System.out.println("inside m3 method"+c);
    }
}

public class Example3 {

    public static void main(String[] args) {
        AA a1 = new AA();
        a1.m1();
        System.out.println("------------------");
        BB b1 = new BB();
        b1.m2();
        b1.m1();

        System.out.println("------------------");
        CC c1 = new CC();
        c1.m1();
        c1.m2();
        c1.m3();
        System.out.println("------------------");

    }
}
