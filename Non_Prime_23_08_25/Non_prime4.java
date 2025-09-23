package Non_Prime_23_08_25;

public class Non_prime4 {

    void m1()
    {
        System.out.println("inside m1 method");
    }

    void m2()
    {
        System.out.println("inside m2 method");

    }

    static  void test1 (Non_prime4 ref)
    {
//        System.out.println("inside test method ");

        ref.m1();
        System.out.println("inside test method ");
        ref.m2();


    }

    public static void main(String[] args) {
        System.out.println("start");

        test1(new Non_prime4());
        System.out.println("stop");

    }
}
