package Non_Prime_23_08_25;

public class Non_prime6
{

    int a = 10;
   void m1(int a )
   {
       System.out.println("inside m1 method");
       System.out.println(a);

       System.out.println(this.a);
   }

    public static void main(String[] args) {
        System.out.println("start");

        new Non_prime6().m1(30);

        System.out.println("stop");
    }
}
