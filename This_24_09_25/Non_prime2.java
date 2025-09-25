package This_24_09_25;

import Non_Prime_23_08_25.Non_prime5;

public class Non_prime2 {
    static class hdfc {

        int amountotal;

        void depositeamount(int amt ) {
            this.amountotal += amt;
            System.out.println("Deposited: " + amt);
        }

        void getbalance() {
            System.out.println("Current balance is: " + this.amountotal);
        }
    }


    public static void main(String[] args) {

        System.out.println("start");

       //  Non_prime2 outer = new Non_prime2();
        hdfc cust = new hdfc();
        // cust.depositeamount(500);
        cust.depositeamount(200);
        cust.getbalance();

        System.out.println("stop");


    }

        }

