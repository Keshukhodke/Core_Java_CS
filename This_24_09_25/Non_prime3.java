package This_24_09_25;

public class Non_prime3 {

    int a;  //  // Instance variable
    void m1(int a )
    {
        System.out.println("inside m1 method");
        }

    public static void main(String[] args) {
        System.out.println("start");

        // Create first object
        Non_prime3 ref1 = new Non_prime3();

        ref1.m1(100);  // call method → assigns 100 to ref1'
        // Create second object
        Non_prime3 ref2 = new Non_prime3();

        ref2.m1(500); //// call method → assigns 500 to ref2's
        System.out.println("ref2 is " + ref2.a);
        System.out.println("ref1 is " + ref1.a);

        System.out.println("stop");
    }
}
