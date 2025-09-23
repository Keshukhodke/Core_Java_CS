package Do_While_02_09_25;

import java.util.Scanner;

public class Prime_Or_Not {

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int i = 2;                 // start divisor
        boolean isPrime = true;    // assume prime first

        if (num <= 1) {
            isPrime = false; // 0 and 1 are not prime
        } else {
            do {
                if (num % i == 0) {   // found a divisor
                    isPrime = false;
                    break;            // exit loop early
                }
                i++;
            } while (i <= num / 2);
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
