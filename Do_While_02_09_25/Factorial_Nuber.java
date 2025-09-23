package Do_While_02_09_25;

public class Factorial_Nuber {

    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
        int i = n;

        do {
            fact = fact *i;
            i--;
        }
        while (i>0);
        System.out.println("factorial of "+ n+" is :- "+ fact);


    }
}
