package Non_Prime_23_08_25;



public class Non_prime3 {

    void m1()
    {
        System.out.println("inside m1 method");
    }

    void m2()
    {
        System.out.println("inside m2 method");
    }

    public static void main(String[] args) {
        System.out.println("start");

        // named object creation
         Non_prime3 ref  = new Non_prime3();
         ref.m1();

         // nameless object creation

        new Non_prime3().m2();

        System.out.println("end ");
    }
}
