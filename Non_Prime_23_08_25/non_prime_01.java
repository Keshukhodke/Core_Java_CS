package Non_Prime_23_08_25;

class Demo {
    boolean z = true;   // instance variable
    Demo d;             // reference to another Demo object
}

public class non_prime_01 {
    public static void main(String[] args) {
        System.out.println("start");

        Demo ref = new Demo();     // creates first Demo object
        ref.d = new Demo();        // creates second Demo object and assigns it to 'd'

        System.out.println(ref.d); // prints reference of second Demo object
        System.out.println("end ");
    }
}
