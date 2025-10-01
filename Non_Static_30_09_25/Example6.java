package Non_Static_30_09_25;

class  Demo
{
    static  int  a =100;
    static
    {
        System.out.println("inside static block");
    }
}

public class Example6 {
    public static void main(String[] args) {
        System.out.println("start");
        System.out.println(Demo.a);
        System.out.println("stop");
    }
}
