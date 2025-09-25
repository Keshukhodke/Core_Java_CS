package This_24_09_25;

// when use this keyword ?
// to differrentaite between local variable and insance variable we use this keyword
public class Non_prime1 {
    int a = 100;
    void m1(int a , int b   )
    {
        System.out.println("inside m1 method ");
        System.out.println("Instance variable a: " + this.a); // instance variable
        System.out.println("Local variable a: " + a);         // local variable
        System.out.println("Instance variable a again: " + this.a);
        System.out.println("Local variable b: " + b);
    }

    public static void main(String[] args) {
        {
            System.out.println("start");
            new Non_prime1().m1(30, 40); // passing two arguments
            new Non_prime1().m1(50, 60); // passing two arguments
            System.out.println("stop");
        }
    }
}
