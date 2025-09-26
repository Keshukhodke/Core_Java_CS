package Constructor_26_09_25;

class HDFC
{
    int amountbal;
    HDFC (int amountbal)
    {
        if (amountbal>=10000)
        {
            this.amountbal= amountbal;
            System.out.println("Bank account succesfully created ");
        }
        else {
            System.out.println("enter valid amoount");
        }
    }
    int getbalanceinfo()
    {
        return amountbal;
    }
}

public class Example11
{
    public static void main(String[] args) {
        HDFC h1 = new HDFC(100000);
        int currentbal = h1.getbalanceinfo();
        System.out.println("your current balance is "+ currentbal);
        System.out.println("stop");
    }

}
