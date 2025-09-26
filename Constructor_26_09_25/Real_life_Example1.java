package Constructor_26_09_25;

class Bankaccount {
    String Accountholder;
    int AccountNumber;
    double balance;

    Bankaccount() {
        this.Accountholder = "Keshav";
        this.AccountNumber = 19202289;
        this.balance = 0.0;
        System.out.println("default consctructor created ");

    }

    Bankaccount(int accno) {
        this.AccountNumber = accno;
        this.Accountholder = "Savi";
        this.balance = 0.0;

        System.out.println("Account created with number only");
    }

    Bankaccount(int accno, String name, double intialBalance) {
        this.AccountNumber = accno;
        this.Accountholder = name;
        this.balance = intialBalance;
        System.out.println("full account created ");
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " | New Balance: " + balance);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
        void checkBalance() {
            System.out.println("account balance " + balance);
        }
    }

    public class Real_life_Example1 {
        public static void main(String[] args) {
            Bankaccount acc1 = new Bankaccount();
            Bankaccount acc2 = new Bankaccount(101);
            Bankaccount acc3 = new Bankaccount(102, "keshav", 5000.0);

            acc3.deposit(2000);
            acc3.withdraw(1000);
            acc3.checkBalance();
        }
    }

