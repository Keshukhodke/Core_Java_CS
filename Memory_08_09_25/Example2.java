package Memory_08_09_25;

//Multiple Objects
//
//Modify the simple class to add another method m3() that prints "inside m3 method".
//
//Create two objects of simple in main():
//
//First object calls m1().
//
//Second object calls m2() and m3().


class  Simple
{
    void m1()
    {
        System.out.println("inside m1 method ");
    }
    void m2()
    {
        System.out.println("inside m2 method ");
    }
    void m3()
    {
        System.out.println("inside m3 method");
    }
}
public class Example2 {
    public static void main(String[] args) {


        // First object of Simple
        Simple s = new Simple();
        s.m1();

        // Second object of Simple
        Simple s1= new Simple();
        s1.m2();
        s1.m3();
    }


}
