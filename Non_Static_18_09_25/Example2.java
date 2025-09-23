package Non_Static_18_09_25;

class Non_prime2 {
    int a = 1000;
}
public class Example2 {
    public static void main(String[] args) {
        System.out.println("start");

        Non_prime ref = new Non_prime();

        test(ref);
        System.out.println("stop");
    }

    static void test (Non_prime ref )
    {
        System.out.println("inside test method ");
        System.out.println("Value of a = " +ref.a);
    }
}
