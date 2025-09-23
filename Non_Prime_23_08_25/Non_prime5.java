package Non_Prime_23_08_25;

public class Non_prime5

{
 // using this kwyword
    int a = 10;
    void m1( int a )
    {
        System.out.println(" the value of a is "+a);
        System.out.println("using this keyword "+this.a);
    }

    public static void main(String[] args) {
        System.out.println("start");

        Non_prime5 ref = new Non_prime5();
        ref.m1(20);

        System.out.println("stop");
    }
}
