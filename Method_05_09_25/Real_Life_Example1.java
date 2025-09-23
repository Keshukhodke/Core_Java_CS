package Method_05_09_25;

public class Real_Life_Example1 {
 //Example 1: Banking App (Balance Calculation)
    public static void main(String[] args) {

        float intrest = calculate(100, 5, 2);
        System.out.println("intrest is "+ intrest);

    }

    static float calculate( float amount , float rate, float years)
    {
        return ( amount * rate * years)/100;
    }
}
