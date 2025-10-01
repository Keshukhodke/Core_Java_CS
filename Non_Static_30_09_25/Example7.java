package Non_Static_30_09_25;

class hdfc
{
    int amountbalance;
    static
    {
        System.out.println("logics to connect to aadhar server ");
    }
    {
        System.out.println("logics to verify aadhar otp");
    }
    hdfc(int amountbalance) {
        if (amountbalance >= 10000) {
            this.amountbalance = amountbalance;
            System.out.println("bank account succesfully created");
        } else {
            System.out.println("enter a valid amount");
        }
    }
        int getbalnceinfo()
        {
            return amountbalance;
        }

}

public class Example7 {
    public static void main(String[] args) {
        hdfc cust1 = new hdfc(10000);
        int currentbal = cust1.getbalnceinfo();
        System.out.println("current balance is "+currentbal);
    }
}
