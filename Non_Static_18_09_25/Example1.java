package Non_Static_18_09_25;

// in a non primitive variable are belongs 2 stages 1st is declration 2nd is is intalization
class Non_prime {

    int a = 100;
    void m1()
    {
        System.out.println(" inside m1");
    }
}

public class Example1 {
    public static void main(String[] args) {
//        Non_prime ref = new Non_prime();  /// object declaration + initialization
//
//        ref.m1();  //  method call

        Non_prime n = new Non_prime();
        System.out.println(n.a);

    }

}
