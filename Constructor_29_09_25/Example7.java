package Constructor_29_09_25;

class hdfc
{
    int amountbal;
    {
        System.out.println("logics to verify aafhar otp");
    }

    hdfc(int amountbal)
    {
        if (amountbal>=10000)
        {
            this.amountbal= amountbal;
            System.out.println("bank account succesfully created");
        }else {

            System.out.println("enter a valid amount");
        }
    }
    int getbalanceinfo()
    {
        return amountbal;
    }
}

public class Example7
{
    public static void main(String[] args) {
        System.out.println("start");
        hdfc ref1 = new hdfc(10000);
        System.out.println("stop");
    }
}
